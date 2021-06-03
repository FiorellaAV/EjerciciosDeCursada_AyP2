package Loom_2;

public class CorreoElectronico extends DatoDeContacto{

	private String correo;
	private String tipoDeCorreo;
	
	public CorreoElectronico(String correo, String tipoDeCorreo){
		
		this.correo = correo;
		this.tipoDeCorreo = tipoDeCorreo;
	}
	/*
	 * Setters y getters
	 * */
	public void setCorreoElectronico(String nuevoCorreo){
		correo = nuevoCorreo;
	}
	public void setTipoDeCorreo(String nuevoTipoDeCorreo){
		tipoDeCorreo = nuevoTipoDeCorreo;
	}
	public String getCorreo(){
		return correo;
	}
	public String getTipoDeCorreo(){
		return tipoDeCorreo;
	}
	/*
	 * Metodo para editar el correo electronico y su tipo
	 * */
	public void editarCorreo(String nuevoCorreo, String nuevoTipoDeCorreo){
		this.setCorreoElectronico(nuevoCorreo);
		this.setTipoDeCorreo(nuevoTipoDeCorreo);
	}
	
	@Override
	public String toString(){
		return getCorreo() + " " + getTipoDeCorreo();
	}

	@Override
	public void editar(String nuevoCorreo, String nuevoTipoDeCorreo) {
		editarCorreo(nuevoCorreo, nuevoTipoDeCorreo);
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
