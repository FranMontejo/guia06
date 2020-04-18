package died.guia06;

public class App {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Francisco",130);
		Alumno a2 = new Alumno("Federico",150);
		Curso c1 = new Curso(150,0,"Java");
		Curso c2 = new Curso(100,150,"Java 2");	
		c1.inscribir(a1);
		c1.inscribir(a2);
		c1.imprimirInscriptos();
	}
}
