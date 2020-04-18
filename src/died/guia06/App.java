package died.guia06;

public class App {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Francisco",130);
		Alumno a2 = new Alumno("Federico",150);
		Curso c1 = new Curso(150,0,"Java");
		Curso c2 = new Curso(100,150,"Java 2");	
		a1.inscripcionAceptada(c1);
		a1.inscripcionAceptada(c2);
		a2.inscripcionAceptada(c1);
		a1.aprobar(c1);
		a1.aprobar(c2);		
		a2.aprobar(c1);
		System.out.println(a1.creditosObtenidos());
	}
}
