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

	public int creditosObtenidos() {
		int cred = 0;
		for(Curso c: aprobados) {
			cred+= c.getCreditos();
		}
		return cred;
	}
	
	public void aprobar(Curso c) {
		if(! this.aprobados.contains(c) && this.cursando.contains(c)) {
			this.aprobados.add(c);
			this.cursando.remove(c);
		}
	}

	public void inscripcionAceptada(Curso c) {
		this.cursando.add(c);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroLibreta == null) ? 0 : nroLibreta.hashCode());
		return result;
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

	@Override
	public int compareTo(Alumno o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	
	public String getNombre() {
		return this.nombre;
	}

}
