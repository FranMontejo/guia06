package died.guia06;

public class App {

	public static void main(String[] args) throws NoCumpleCondicionesException {
		Alumno a1 = new Alumno("Francisco",130);
		Alumno a2 = new Alumno("Federico",150);
		Alumno a3 = new Alumno("Rodrigo",145);
		Alumno a4 = new Alumno("Marcela",150);
		Curso c1 = new Curso(150,0,"Java");
		Curso c2 = new Curso(100,150,"Java 2");	
		Curso c3 = new Curso(0,0,"PHP");
		Curso c4 = new Curso(0,0,"Python");
		Curso c5 = new Curso(0,0,"Javascript");
		
		System.out.println(a2.equals(a4));
		c1.inscribirAlumno(a1);
		c1.inscribirAlumno(a2);
		c1.inscribirAlumno(a3);
		
		//Excepción: No cumple créditos
		c2.inscribirAlumno(a1);
		
		//Excepción: No hay mas cupos
		c1.inscribirAlumno(a4);
		
		//Excepción: Alumno inscripto a más de 3 materias
		c3.inscribirAlumno(a1);
		c4.inscribirAlumno(a1);
		c5.inscribirAlumno(a1);
		
		
		c1.imprimirInscriptos1();
		System.out.println("------------");
		c2.imprimirInscriptos1();
		System.out.println(c2.inscribir(a1));
		a1.aprobar(c1);
		a2.aprobar(c1);
		c2.inscribirAlumno(a1);
		System.out.println("------------");
		c1.imprimirInscriptos1();
		System.out.println("------------");
		c1.imprimirInscriptos2();
		System.out.println("------------");
		c1.imprimirInscriptos3();
		System.out.println("------------");
		c2.imprimirInscriptos1();
		
		
	}
}
