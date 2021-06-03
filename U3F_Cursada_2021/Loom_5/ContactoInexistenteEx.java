package Loom_5;

@SuppressWarnings("serial")
public class ContactoInexistenteEx extends Exception {

	private String error = "Contacto Inexistente";
	
	public ContactoInexistenteEx(String error) {
		this.obtenerError();
	}

	public String obtenerError() {
		return error;
	}
}
