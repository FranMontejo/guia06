package died.guia06;

public class NoCumpleCondicionesException extends Exception {
	
	
	public NoCumpleCondicionesException (int error) {
		super();
		switch(error) {
		case 1: System.out.println("Error: No cumple la cantidad de cr�ditos requeridos"); break;
		case 2: System.out.println("Error: El alumno ya est� inscripto a m�s de tres materias"); break;
		case 3: System.out.println("Error: No hay m�s cupos disponibles para este curso");
		
		}
	}
	
	
	

}
