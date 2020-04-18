package died.guia06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class AlumnoTest {

	private Alumno a1;
	private Alumno a2;
	private Curso c1;
	private Curso c2;
	

	@BeforeEach
	public void init() {
		a1 = new Alumno("Francisco",130);
		a2 = new Alumno("Federico",150);
		c1 = new Curso(150,0,"Java");
		c2 = new Curso(100,150,"Java 2");	
		a1.inscripcionAceptada(c1);
		a1.inscripcionAceptada(c2);
		a2.inscripcionAceptada(c1);
	}

	
	
	@Test
	void testCreditosObtenidos() {
		
		a1.aprobar(c1);
		a1.aprobar(c2);		
		a2.aprobar(c1);
		assertEquals(250,a1.creditosObtenidos());
		assertEquals(150,a2.creditosObtenidos());
	}
	
	

	@Test
	void testAprobar() {
		a1.aprobar(c1);
		assertTrue(a1.getAprobados().contains(c1));
		assertFalse(a2.getAprobados().contains(c1));
	}

	@Test
	void testInscripcionAceptada() {

	}
	
	@Test
	void testEquals() {
		Alumno a3 = new Alumno("Federica",150);
		assertTrue(a3.equals(a2));
		assertFalse(a3.equals(a1));
		
	}
	
	@Test
	void testCompareTo() {
		List<Alumno> alumnos = new ArrayList<>();
		List<Alumno> alumnosParaComparar = new ArrayList<>();
		Alumno a3 = new Alumno("Federica",150);
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		Collections.sort(alumnos);
		alumnosParaComparar.add(a3);
		alumnosParaComparar.add(a2);
		alumnosParaComparar.add(a1);
		assertEquals(alumnos,alumnosParaComparar);
	}
	
	

}
