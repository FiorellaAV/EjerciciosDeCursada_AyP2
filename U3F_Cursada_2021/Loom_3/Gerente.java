package Loom_3;

public class Gerente extends PlantaPermanente{

	private int antiguedad;
	/*
	 * Constructor de la clase Gerente
	 * */
	public Gerente(String nombre, String apellido, int cantidadDeHijos, boolean tieneConyugue, int antiguedad) {
		super(nombre, apellido, cantidadDeHijos, tieneConyugue);
	}
	@Override
	public String getTipoDeEmpleado(){
		return "Gerente";
	}
	@Override
	public String toString(){
		return getNombre() +" "+ getApellido() + ": " +  getTipoDeEmpleado() + ", " + super.getTipoDeEmpleado(); 
	}
	@Override
	public int liquidarSalario() {
		return getSueldo() + salarioFamiliar() + antiguedad*100*getValorDeUR() + 2000*getValorDeUR();
		
	}
}
