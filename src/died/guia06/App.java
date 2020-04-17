package died.guia06;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Sebastian",150);
		Alumno a2 = new Alumno("Federica",130);
		Alumno a3 = new Alumno("Martin",130);
		Alumno a4 = new Alumno("Federico",120);
		Alumno a5 = new Alumno("Rodrigo",130);
		Alumno a6 = new Alumno("Sebastián",130);
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		alumnos.add(a5);
		alumnos.add(a6);
		for(Alumno a: alumnos) {
			System.out.println(a.getNombre());
		}
		System.out.println("------------------------------");
		Collections.sort(alumnos);
		for(Alumno a: alumnos) {
			System.out.println(a.getNombre());
		}
	}
}
