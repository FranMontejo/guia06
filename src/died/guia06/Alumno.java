package died.guia06;

import java.util.ArrayList;
import java.util.List;


public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private Integer nroLibreta;
	private List<Curso> cursando;
	private List<Curso> aprobados;

	public Alumno(String nombre, Integer nroLibreta) {
		this.nombre = nombre;
		this.nroLibreta = nroLibreta;
		this.cursando = new ArrayList<>();
		this.aprobados = new ArrayList<>();	
	}
	
	public Alumno() {
		new Alumno("",0);
	}

	public int creditosObtenidos() {
		int cred = 0;
		for(Curso c: aprobados) {
			cred+= c.getCreditos();
		}
		return cred;
	}
	
	public void aprobar(Curso c) {
		
		if(!this.cursando.isEmpty() && this.cursando.contains(c) ) {
			if(this.aprobados.isEmpty() || !this.aprobados.contains(c)) {
			this.aprobados.add(c);
			this.cursando.remove(c);
			}
		}
	}

	public void inscripcionAceptada(Curso c) {
		this.cursando.add(c);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Alumno a = (Alumno) obj;
		if(this.nroLibreta.equals(a.nroLibreta) ) {
			return true;
		}
		return false;
	}

	public Integer getNroLibreta() {
		return nroLibreta;
	}

	public void setNroLibreta(Integer nroLibreta) {
		this.nroLibreta = nroLibreta;
	}

	public List<Curso> getCursando() {
		return cursando;
}

	public void setCursando(List<Curso> cursando) {
		this.cursando = cursando;
	}

	public List<Curso> getAprobados() {
		return aprobados;
	}

	public void setAprobados(List<Curso> aprobados) {
		this.aprobados = aprobados;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Alumno o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	
	public String getNombre() {
		return this.nombre;
	}

}
