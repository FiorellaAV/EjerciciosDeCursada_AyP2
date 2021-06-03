package Loom_2;

public class Domicilio extends DatoDeContacto{

	private String calle;
	private int numeroDeCalle;
	private String piso  = " - ";
	private String depto = " - ";
	private String localidad;
	private String partido = " - ";
	private String provincia;
	private String pais;
	/*
	 * Constructor con todos los datos (OPCIONALES Y OBLIGATORIOS)
	 * */
	public Domicilio(String calle,int numeroDeCalle, String piso,String depto,String localidad, 
			String partido, String provincia, String pais){
		
		this.calle = calle;
		this.numeroDeCalle = numeroDeCalle;
		this.piso = piso;
		this.depto = depto;
		this.localidad = localidad;
		this.partido = partido;
		this.provincia = provincia;
		this.pais = pais;
	}
	/*
	 * Constructor con solo los datos OBLIGATORIOS
	 * */
	public Domicilio(String calle,int numeroDeCalle,String localidad, String provincia, String pais){
		
		this.calle = calle;
		this.numeroDeCalle = numeroDeCalle;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}
	/*
	 * Getters y setters
	 * */
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumeroDeCalle() {
		return numeroDeCalle;
	}
	public void setNumeroDeCalle(int numeroDeCalle) {
		this.numeroDeCalle = numeroDeCalle;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	/*
	 * Metodo para editar el domicilio con DATOS OBLIGATORIOS Y OPCIONALES
	 * */
	public void editarDomicilio(String calle,int numeroDeCalle, String piso,String depto,String localidad, 
			String partido, String provincia, String pais) {
	this.setCalle(calle);
	this.setNumeroDeCalle(numeroDeCalle);
	this.setPiso(piso);
	this.setDepto(depto);
	this.setLocalidad(localidad);
	this.setPartido(partido);
	this.setProvincia(provincia);
	this.setPais(pais);
	
	}
	/*
	 * Metodo para editar el domicilio con DATOS OBLIGATORIOS 
	 * */
	public void editarDomicilio(String calle,int numeroDeCalle,String localidad, String provincia, String pais){
		this.setCalle(calle);
		this.setNumeroDeCalle(numeroDeCalle);
		this.setLocalidad(localidad);
		this.setProvincia(provincia);
		this.setPais(pais);
	}
	
	@Override
	public String toString(){
		return getCalle() + " " + getNumeroDeCalle() + " " + getPiso() + " " + getDepto() + " " + getLocalidad() 
				+ " " + getPartido() + " " + getProvincia() + " " + getPais();
	}
	@Override
	public void editar(String calle,int numeroDeCalle, String piso,String depto,String localidad, 
			String partido, String provincia, String pais){
		editarDomicilio(calle,numeroDeCalle,piso,depto,localidad,partido,provincia,pais);
	}
	@Override
	public void editar(String calle,int numeroDeCalle,String localidad, String provincia, String pais){
		editarDomicilio(calle,numeroDeCalle,localidad,provincia,pais);
	}
	

	//METODO NO UTILIZADO EN ESTA CLASE
	@Override
	public void editar(String dato1, String dato2) {
	
		throw new Error("Este metodo no se puede utilizar en esta Clase");
	}

}
