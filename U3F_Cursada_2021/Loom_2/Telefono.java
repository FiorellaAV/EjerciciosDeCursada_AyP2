package Loom_2;

public class Telefono extends DatoDeContacto{

	private String telefono;
	private String tipoDeTelefono;
	
	public Telefono(String telefono, String tipoDeTelefono){
			
		this.telefono = telefono;
		this.tipoDeTelefono = tipoDeTelefono;
		
	}
	/*
	 * Setters y getters
	 * */
	public void setTelefono(String nuevoTelefono){
		telefono = nuevoTelefono;
	}
	
	public String getTelefono(){
		return telefono;
	}
	
	public void setTipoDeTelefono(String nuevoTipoDeTelefono){
		tipoDeTelefono = nuevoTipoDeTelefono;
	} 
	public String getTipoDeTelefono(){
		return tipoDeTelefono;
	}
	/*
	 * Metodo que edita el numero de telefono y el tipo
	 * */
	public void editarTelefono(String nuevoTelefono,String nuevoTipoDeTelefono) {
		this.setTelefono(nuevoTelefono);
		this.setTipoDeTelefono(nuevoTipoDeTelefono);
		
	}
	@Override
	public String toString(){
		return getTelefono() + " " + getTipoDeTelefono();
	}

	@Override
	public void editar(String nuevoTelefono, String nuevoTipoDeTelefono) {
		
		editarTelefono(nuevoTelefono, nuevoTipoDeTelefono);
		
	}
	
	
	//METODOS NO UTILIZADOS EN ESTA CLASE
	@Override
	public void editar(String dato1, int dato2, String dato3, String dato4,
			String dato5, String dato6, String dato7, String dato8) {
		throw new Error("Este metodo no se puede utilizar en esta Clase");
		
	}

	@Override
	public void editar(String dato1, int dato2, String dato3, String dato4,
			String dato5) {
		throw new Error("Este metodo no se puede utilizar en esta Clase");
	}
	
}
