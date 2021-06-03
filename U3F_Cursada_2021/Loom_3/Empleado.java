package Loom_3;

public abstract class Empleado {

	private String nombre;
	private String apellido;
	private int sueldoBasico;
	private int unidadRetributiva;
	protected int cantidadDeHijos;
	protected boolean tieneConyugue;
	/*
	 * Constrictor de la clase Empleado
	 * */
	public Empleado(String nombre, String apellido, int cantidadDeHijos, boolean tieneConyugue){
	
		if(nombre == null || apellido == null ){
			throw new Error("El nombre y apellido no pueden ser nulos");
		}
		this.nombre = nombre;
		this.apellido = apellido;	
	}
	/*
	 * Metodo que devuelve el nombre del empleado
	 * */
	public String getNombre(){
		return nombre;
	}
	/*
	 *Metodo que devuelve el apellido del empleado
	 **/
	public String getApellido(){
		return apellido;
	}
	/*
	 * Metodo que devuelve el tipo de empleado
	 * */
	public String getTipoDeEmpleado(){
		return "Empleado";
	}
	/*
	 * Metodo que devuelve el sueldo basico
	 * */
	public int getSueldo(){
		sueldoBasico =1000*getValorDeUR();
		return sueldoBasico;
	}
	/*
	 * Metodo para colocarle un nuevo valor a la unidad retributiva
	 * recibe como parametro un integer
	*/
	public void setNuevoValorDeUR(int nuevoValor){
		if(nuevoValor <= 0){
			throw new Error("El valor de la unidad retributiva NO puede ser menor o igual a cero");
		}
		unidadRetributiva = nuevoValor;
	}
	/*
	 * Metodo que devuelve el valor de la unidad retributiva 
	 * */
	public int getValorDeUR(){
		return unidadRetributiva;
	}
	/*
	 * Metodo que devuelve el salario familiar 
	 * en caso de que tenga un conyugue devolvera el salario familiar con la cantiidad de hijos y el conyugue
	 * y en caso contrario devolvera el salario familiar segun la cantidad de hijos que tenga
	 * */
	public int salarioFamiliar(){
		if(tieneConyugue == true){
			return cantidadDeHijos *200*getValorDeUR() + 100*getValorDeUR();		
		}else{
			return cantidadDeHijos * 200*getValorDeUR();
		}
	}
	/*
	 * Metodo que devuelve un String con el nombre, apellido y tipo de empleado
	 * */
	public String toString(){
		return getNombre() +" "+ getApellido() +" : "+ getTipoDeEmpleado(); 
	}
	/*
	 * Metodo abstracto que heredan las clases hijas de empleado
	 * */
	public abstract int liquidarSalario();
}
