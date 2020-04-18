package died.guia06;

public class RegistroAuditoriaException extends Exception {

	public RegistroAuditoriaException(String mensaje) {
		super(mensaje);
		System.out.println("Error: no se pudo registrar la operación");
	}
}
