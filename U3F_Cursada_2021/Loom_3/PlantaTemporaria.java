package Loom_3;

public class PlantaTemporaria extends Empleado {

	private boolean tiempoCompleto;
	private int cantidadDeHoras;
	
	/* Pre: este constructor es utilizado para crear empleados de planta temporaria de TIEMPO COMPLETO
	 * Constructor de la clase SinCategoriaEspecial, los paramentros que recibe son un nombre, un apellido, la cantidad
	 * de hijos y un booleano para saber si tiene conyugue o no.
	 * En caso de que sea empleado de tiempo completo sera TRUE, y en caso contrario sera FALSE
	 * */
	public PlantaTemporaria(String nombre, String apellido, int cantidadDeHijos, boolean tieneConyugue) {
		super(nombre, apellido, cantidadDeHijos, tieneConyugue);
		
		this.tiempoCompleto = true;
		this.cantidadDeHijos = cantidadDeHijos;
		this.tieneConyugue = tieneConyugue;
	
	}
	/*Pre: este constructor es utilizado para crear empleados de planta temporaria de TIEMPO PARCIAL
	 * Constructor de la clase SinCategoriaEspecial, los paramentros que recibe son un nombre, un apellido,
	 * la cantidad de horas que trabajo, la cantidad de hijos y un booleano para saber si tiene conyugue o no.
	 * En caso de que sea empleado de tiempo completo sera TRUE, y en caso contrario sera FALSE
	 * */
	public PlantaTemporaria(String nombre, String apellido,int cantidadDeHoras , int cantidadDeHijos, 
			boolean tieneConyugue){
		super(nombre, apellido, cantidadDeHijos, tieneConyugue);
		
		this.tiempoCompleto = false;
		this.cantidadDeHoras = cantidadDeHoras;
		this.cantidadDeHijos = cantidadDeHijos;
		this.tieneConyugue = tieneConyugue;
	}
	/*
	 * Metodo para conocer si el empleado trabaja tiempo completo o parcial.
	 * retorna TRUE en caso de que si trabaje tiempo completo, y FALSE en caso de que trabaje 
	 * tiempo parcial.
	 * */
	public boolean trabajaTiempoCompleto(){
		return tiempoCompleto;
	}
	@Override
	public String getTipoDeEmpleado(){
		return "Planta Temporaria";
	}
	@Override
	public String toString(){
		if(trabajaTiempoCompleto()){
		return getNombre() +" "+ getApellido() + ": " + "empleado a tiempo completo" +", "+ getTipoDeEmpleado(); 
		}else{
		return getNombre() +" "+ getApellido() + ": " + "empleado a tiempo parcial" +", "+ getTipoDeEmpleado(); 
		}
	}
	@Override
	public int liquidarSalario() {
		if(tiempoCompleto == true){
			return getSueldo() + salarioFamiliar();
		}
		else{
			if( (cantidadDeHoras*10*getValorDeUR() + (getSueldo()/3) ) >= 1000*getValorDeUR()){
				return( getSueldo()/3 ) + 1000*getValorDeUR() + salarioFamiliar();
			}
			else{
				return ( getSueldo()/3 ) + (cantidadDeHoras*10*getValorDeUR()) + salarioFamiliar();
			}	
		}
	}
}

