package died.guia06;

public class App {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Francisco",130);
		Alumno a2 = new Alumno("Federico",150);
		Alumno a3 = new Alumno("Rodrigo",145);
		Alumno a4 = new Alumno("Marcela",150);
		Curso c1 = new Curso(150,0,"Java");
		Curso c2 = new Curso(100,150,"Java 2");	
		
		System.out.println(a2.equals(a4));
		c1.inscribir(a1);
		c1.inscribir(a2);
		c1.inscribir(a3);
		c1.imprimirInscriptos();
		System.out.println("------------");
		c2.imprimirInscriptos();
		System.out.println(c2.inscribir(a1));
		a1.aprobar(c1);
		a2.aprobar(c1);
		c2.inscribir(a1);
		System.out.println("------------");

		c1.imprimirInscriptos();
		System.out.println("------------");
		c2.imprimirInscriptos();
		
		
	}
}
