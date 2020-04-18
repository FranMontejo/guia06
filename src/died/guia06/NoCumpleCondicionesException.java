package died.guia06;

public class NoCumpleCondicionesException extends Exception {
	
	
	public NoCumpleCondicionesException (int error) {
		super();
		switch(error) {
		case 1: System.out.println("Error: No cumple la cantidad de créditos requeridos"); break;
		case 2: System.out.println("Error: El alumno ya está inscripto a más de tres materias"); break;
		case 3: System.out.println("Error: No hay más cupos disponibles para este curso");
		
		}
	}
	
	
	

}
