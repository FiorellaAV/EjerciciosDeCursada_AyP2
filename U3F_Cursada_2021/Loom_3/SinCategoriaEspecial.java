package Loom_3;

public class SinCategoriaEspecial extends PlantaPermanente {

	private boolean tiempoCompleto;
	private int cantidadDeHoras;

	private int antiguedad;
	
	/*Pre: este constructor es utilizado para crear empleados de tipo SinCategoriaEspacial de TIEMPO COMPLETO
	 * Constructor de la clase SinCategoriaEspecial para EMPLEADOS DE TIEMPO COMPLETO, los paramentros que recibe
	 * son un nombre, un apellido ,la cantidad de hijos que posea, si tiene conyugue y la antiguedad en la empresa.
	 * */
	public SinCategoriaEspecial(String nombre, String apellido, int cantidadDeHijos, boolean tieneConyugue, int antiguedad) {
		super(nombre, apellido, cantidadDeHijos, tieneConyugue);
		if(antiguedad > 20 || antiguedad <= 0){
			throw new Error ("La cantidad de años de antiguedad no puede ser mayor a 20, ni menor a 0");
		}
		this.tiempoCompleto = true;
		this.cantidadDeHijos = cantidadDeHijos;
		this.tieneConyugue = tieneConyugue;
		this.antiguedad = antiguedad;
	}
	/*Pre: este constructor es utilizado para crear empleados de tipo SinCategoriaEspacial de TIEMPO PARCIAL
	 * Constructor de la clase SinCategoriaEspecial para EMPLEADOS DE TIEMPO PARCIAL, los paramentros que recibe
	 * son un nombre, un apellido ,la cantidad de horas que trabaja, la cantidad de hijos que posea,
	 * si tiene conyugue y la antiguedad en la empresa.
	 * */
	public SinCategoriaEspecial(String nombre, String apellido,int cantidadDeHoras , int cantidadDeHijos, 
			boolean tieneConyugue, int antiguedad){
		super(nombre, apellido, antiguedad, tieneConyugue);
		if(antiguedad > 20 || antiguedad <= 0){
			throw new Error ("La cantidad de años de antiguedad no puede ser mayor a 20, ni menor a 0");
		}
		this.tiempoCompleto = false;
		this.cantidadDeHoras = cantidadDeHoras;
		this.cantidadDeHijos = cantidadDeHijos;
		this.tieneConyugue = tieneConyugue;
		this.antiguedad = antiguedad;
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
		return "Sin Categoria Especial";
	}
	@Override
	public String toString(){
		if(trabajaTiempoCompleto()){
		return getNombre() +" "+ getApellido() + ": " + "empleado a tiempo completo" +", "+ getTipoDeEmpleado() + ", " + super.getTipoDeEmpleado(); 
		}else{
			return getNombre() +" "+ getApellido() + ": " + "empleado a tiempo parcial" +", "+ getTipoDeEmpleado() + ", " + super.getTipoDeEmpleado(); 
		}
	}
	@Override
	public int liquidarSalario() {
		
		if(tiempoCompleto == true){
			return getSueldo() + salarioFamiliar() + antiguedad*100*getValorDeUR();
		}
		else{
			if( (cantidadDeHoras*10*getValorDeUR() + (getSueldo()/3) ) >= 1000*getValorDeUR()){
				return( getSueldo()/3 ) + 1000*getValorDeUR() + salarioFamiliar() + antiguedad*100*getValorDeUR();
			}
			else{
				return ( getSueldo()/3 ) + (cantidadDeHoras*10*getValorDeUR()) + salarioFamiliar() + antiguedad*100*getValorDeUR();
			}	
		}
	}
}

