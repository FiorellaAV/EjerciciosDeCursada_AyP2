package Loom_2;

public class Persona {

	//Atributos
	
	private String nombre;
	private String segundoNombre = "";
	private String apellido;
	private int fechaDeCumpleanos;
	private String empresaDondeTrabaja;
	private DatoDeContacto dato = null;
	
	//Constructor para nombre, segundo nombre y apellido
	public Persona (String nombre, String segundoNombre, String apellido ){
		
		this.nombre = nombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
		
	}
	//Constructor para nombre y apellido
	public Persona (String nombre, String apellido){
		
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//Constructor para nombre, segundo nombre , apellido y dato de contacto
	public Persona (String nombre, String segundoNombre, String apellido, DatoDeContacto dato){
		
		this.nombre = nombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
		this.dato = dato;
		
	}
	//Constructor para nombre, apellido y dato de contacto
	public Persona (String nombre, String apellido,DatoDeContacto dato){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dato = dato;
	}
	
	/*Pre: este metodo solo cambiara el PRIMER nombre
	 * Metodo para cambiar el nombre de la persona*/
	
	public void cambiarNombre(String nuevoNombre){
		
		nombre = nuevoNombre;
	}
	/*
	 * Pre: este metodo cambiara el PRIMER Y SEGUNDO nombre
	 * Metodo para cambiar el nombre y segundo nombre de la persona
	 * */
	public void cambiarNombreySegundoNombre(String nuevoNombre,String nuevoSegundoNombre){
		 nombre = nuevoNombre;
		 segundoNombre = nuevoSegundoNombre;
	}
	//Metodo para cambiar el apellido
	public void cambiarApellido(String nuevoApellido){
		apellido = nuevoApellido;
	}
	/*
	 * Post: metodo que devuelve el nombre
	 * */
	public String getNombre(){
		return nombre;
	}
	/*
	 * Post: metodo que devuelve el seugno nombre
	 * */
	public String getSegundoNombre(){
		return segundoNombre;
	}
	/*
	 * Post: metodo que devuelve el apellido
	 * */
	public String getApellido(){
		return apellido;
	}
	/*
	 * Metodo para guardar la fecha de cumpleaños de la persona
	 * */
	public void setFechaDeCumpleanos(int fecha){
		fechaDeCumpleanos = fecha;
	}
	/*
	 * Metodo para guardar la empresa en donde trabaja la persona
	 * */
	public void setEmpresaDondeTrabaja(String empresa){
		empresaDondeTrabaja = empresa;
	}
	/*
	 * Metodo que devuelve la fecha de cumpleaños de la persona
	 * */
	public int getFechaDeCumpleanos(){
		return fechaDeCumpleanos;
	}
	
	/*
	 * Metodo que devuelve la empresa donde trabaja la persona
	 * */
	public String getEmpresaDondeTrabaja(){
		return empresaDondeTrabaja;
	}
	/*
	 * Metodo que devuleve el dato de contacto
	 * */
	public String getDatoDeContacto(){

		return dato.toString();
	}
	/*
	 * 
	 * PRE: Los parametros recibidos, dependiendo del tipo de dato de contacto (TELEFONO/CORREO),
	 * seran telefono y tipo de telefono ó correo y tipo de correo
	 * Metodo para editar el dato de contacto. SOLO PARA TELEFONO O CORREO
	 * */
	public void editarDato(String nuevoDato, String nuevoDato2){
		
		dato.editar(nuevoDato, nuevoDato2);
	}
	/*
	 * PRE:Los paramentros recibidos deben ser calle, numeroDeCalle, piso, depto, localidad, 
	 *		partido, provincia, pais
	 *	Metodo para editar el dato de contacto de tipo DOMICILIO, con datos obligatorios y opcionales
	 * */
	public void editarDato(String nuevoDato,int nuevoDato2,String nuevoDato3,String nuevoDato4,String nuevoDato5
			,String nuevoDato6,String nuevoDato7,String nuevoDato8){
		
		dato.editar(nuevoDato, nuevoDato2, nuevoDato3, nuevoDato4, nuevoDato5, nuevoDato6,
				nuevoDato7, nuevoDato8);
	}
	/*
	 * PRE:Los paramentros recibidos deben ser calle, numeroDeCalle, localidad, provincia, pais
	 *	Metodo para editar el dato de contacto de tipo DOMICILIO, SOLO con datos obligatorios
	 * */
	public void editarDato(String nuevoDato,int nuevoDato2,String nuevoDato3, String nuevoDato4, String nuevoDato5){
		
		dato.editar(nuevoDato,nuevoDato2,nuevoDato3,nuevoDato4,nuevoDato5);
	}
	/*
	 * Metodo que devuelve un String con el nombre, el segundo nombre y el apellido
	 * en caso de no tener segundo nombre, se llenara con un espacio vacio
	 * */
	public String toString(){
		return getNombre() + " " + getSegundoNombre() + " " + getApellido();
	} 
	
}
