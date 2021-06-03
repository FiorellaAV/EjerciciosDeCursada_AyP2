package Loom_3;

public abstract class PlantaPermanente extends Empleado {
	
	public PlantaPermanente(String nombre, String apellido,int cantidadDeHijos,boolean tieneConyugue) {
		super(nombre, apellido, cantidadDeHijos, tieneConyugue);
	}
	@Override
	public String getTipoDeEmpleado(){
		return "Planta Permanente";
	}	
}
