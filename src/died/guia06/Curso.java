package died.guia06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import died.guia06.util.Registro;

/**
 * Clase que representa un curso. Un curso se identifica por su ID y por su nombre y ciclo lectivo.
 * Un curso guarda una lista de los inscriptos actuales que tienen.
 * Un curso, al aprobarlo, otorga una cantidad de creditos definidas en el curso.
 * Un curso requiere que para inscribirnos tengamos al menos la cantidad de creditos requeridas, y que haya cupo disponible
 * @author marti
 *
 */
public class Curso  {

	private Integer id;
	private String nombre;
	private Integer cicloLectivo;
	private Integer cupo; 
	private List<Alumno> inscriptos;
	private Integer creditos;
	private Integer creditosRequeridos;
	
	private Registro log;
	
	public Curso() {
		super();
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();
	}
	
	public Curso(int creditos, int creditosR, String nombre) {
		this.creditos = creditos;
		this.creditosRequeridos = creditosR;
		this.nombre = nombre;
		this.cupo = 3;
		this.inscriptos = new ArrayList<Alumno>();
		this.log = new Registro();

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCupo() {
		return cupo;
	}

	public void setCupo(Integer cupo) {
		this.cupo = cupo;
	}

	public List<Alumno> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(List<Alumno> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public Integer getCreditosRequeridos() {
		return creditosRequeridos;
	}

	public void setCreditosRequeridos(Integer creditosRequeridos) {
		this.creditosRequeridos = creditosRequeridos;
	}

	public Integer getCreditos() {
		return this.creditos;
	}
	

	/**
	 * Este método, verifica si el alumno se puede inscribir y si es así lo agrega al curso,
	 * agrega el curso a la lista de cursos en los que está inscripto el alumno y retorna verdadero.
	 * Caso contrario retorna falso y no agrega el alumno a la lista de inscriptos ni el curso a la lista
	 * de cursos en los que el alumno está inscripto.
	 * 
	 * Para poder inscribirse un alumno debe
	 * 		a) tener como minimo los creditos necesarios
	 *      b) tener cupo disponibles
	 *      c) puede estar inscripto en simultáneo a no más de 3 cursos del mismo ciclo lectivo.
	 * @param a
	 * @return
	 */
	public Boolean inscribir(Alumno a) {
		
		if(a.requisitoCreditos(this.creditosRequeridos) && a.requisitoCursadas() &&(this.inscriptos.size() < this.cupo)) {
			this.inscriptos.add(a);
			a.inscripcionAceptada(this);
			return true;
		}
		try {
			 {
				log.registrar(this, "inscribir ",a.toString());
			}
		}
		catch(IOException e) {
			System.out.println(e+" ERROR: no se ha podido guardar la operaci�n.");
		}
		
		return false;
	}
	
	
	/**
	 * imprime los inscriptos en orden alfabetico
	 */
	
	/* Cambio el retorno de la funci�n para poder realizar el testeo*/
	
	public boolean imprimirInscriptos() {
		
		if(this.inscriptos.isEmpty()) {
			System.out.println("No hay alumnos inscriptos a este curso");
			return false;
		}
		
		Collections.sort(this.inscriptos);
		
		for(Alumno a: this.inscriptos) {
			System.out.println(a.getNombre());
		}
		
		try {
		log.registrar(this, "imprimir listado",this.inscriptos.size()+ " registros ");
		}
		catch(IOException e) {
			System.out.println(e+" ERROR: no se ha podido imprimir la lista");
		}
		
		return true;
	}

	//Paso 7: agregar m�todo inscribirAlumno
	
	public boolean inscribirAlumno(Alumno a) throws NoCumpleCondicionesException 	{
		
		if(a.requisitoCreditos(this.creditosRequeridos)) {
			if(a.requisitoCursadas()) {
				if(this.inscriptos.size() < this.cupo) {
					this.inscribir(a);
				}
				else {
					throw new NoCumpleCondicionesException(3);
					}
				}
			else {
				throw new NoCumpleCondicionesException(2);
			}
		}
		else {
			throw new NoCumpleCondicionesException(1);
			
		}
	
		try {
			
				log.registrar(this, "inscribir", a.toString());
			}
	
		catch(IOException e) {
			new RegistroAuditoriaException(e.toString());
			
		}
		return true;
	}
}
