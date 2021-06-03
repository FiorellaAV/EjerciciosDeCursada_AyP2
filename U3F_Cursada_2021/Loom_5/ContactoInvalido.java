package Loom_5;

@SuppressWarnings("serial")
public class ContactoInvalido extends Exception{	
	
	private String error = "Error al crear un nuevo contacto, datos invalidos.";
	
	public ContactoInvalido() {
		this.obtenerError();
	}

	public String obtenerError() {
		return error;
	}
}

