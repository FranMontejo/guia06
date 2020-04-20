package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import died.guia06.Alumno;
import died.guia06.Curso;

class CursoTest {

	private Alumno a1;
	private Alumno a2;
	private Curso c1;
	private Curso c2;
	
	@BeforeEach
	void init() {
		a1 = new Alumno("Francisco",130);
		a2 = new Alumno("Federico",150);
		c1 = new Curso(150,0,"Java");
		c2 = new Curso(100,150,"Java 2");
	}
	
	
	
	@Test
	void testInscribir() {
		Boolean b1 = c1.inscribir(a1);
		Boolean b2 = c2.inscribir(a2);
		assertTrue(b1);
		assertFalse(b2);
	}
	
	@Test
	void testImprimir() {
		Alumno a3 = new Alumno("Roodrigo",12);
		c1.inscribir(a1);
		c1.inscribir(a2);
		c1.inscribir(a3);
		assertTrue(c1.imprimirInscriptos1());
		assertTrue(c1.imprimirInscriptos2());
		assertTrue(c1.imprimirInscriptos3());
		assertFalse(c2.imprimirInscriptos1());
		assertFalse(c2.imprimirInscriptos2());
		assertFalse(c2.imprimirInscriptos3());
	}
	
	@Test
	void testInscribirAlumno() throws NoCumpleCondicionesException {
		
		assertTrue(c1.inscribirAlumno(a1));
		
	}
	

}
