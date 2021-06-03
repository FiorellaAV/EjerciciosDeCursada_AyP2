package Loom_3;

public class Empresa {

	private Empleado[] listaDeEmpleados;
	private int cantidadDeEmpleados;
	
	/*
	 * Constructor de Nomina que recibe como parametro la cantidad de empleados que puede contener la nomina
	 * */
	public Empresa(int numeroDeEmpleados){
		if(numeroDeEmpleados<=0){
			throw new Error("El numero de espacios en la nomina debe ser mayor a cero");
		}
		listaDeEmpleados = new Empleado[numeroDeEmpleados];
		this.cantidadDeEmpleados = 0;
	}
	/*
	 * Metodo para agregar un empleado a la lista
	 * */
	public void agregarEmpleado(Empleado empleado){

		if(cantidadDeEmpleados >= listaDeEmpleados.length){
			throw new Error("La nomina se encuentra completa, no se pueden agregar mas empleados");
		}
		listaDeEmpleados[cantidadDeEmpleados] = empleado;
		cantidadDeEmpleados++;

	}
	/*
	 * Metodo que imprime una lista con los empleados y sus respectivos datos
	 * */
	public void listarEmpleados(){
		for(int i = 0; i<listaDeEmpleados.length;i++){
			if(listaDeEmpleados[i] != null){
				System.out.println(mostrarDatosDeEmpleado(i));
			}
		}
	}
	/*
	 * Metodo que devuelve una lista de los empleados con sus datos y sus respectivos salarios
	 * */
	public void liquidarSueldo(){
		for(int i = 0; i<listaDeEmpleados.length;i++){
			if(listaDeEmpleados[i] != null){
				System.out.println(mostrarDatosDeEmpleado(i) + "." + " Salario : $" + listaDeEmpleados[i].liquidarSalario());
			}
		}
	}
	/*
	 *Metodo que calcula el sueldo de todos los empleados ee la lista, cambiando el valor de la unidad retributiva
	 *Recibe como parametro el nuevo valor de la unidad retributiva
	 * */
	public void calcularSueldo(int nuevoValorDeUR){
		
		for(int i = 0; i<listaDeEmpleados.length;i++){
			if(listaDeEmpleados[i] != null){
				listaDeEmpleados[i].setNuevoValorDeUR(nuevoValorDeUR);
			}
		}
	}
	/*
	 * Metodo para mostrar los datos de un empleado.
	 * Recibe como parametro un numero que indicara el numero de empleado en la lista
	 * Devuelve un String con el nombre, apellido y el tipo de empleado.
	 * */
	private String mostrarDatosDeEmpleado(int empleado){
		
		return listaDeEmpleados[empleado].toString();
		
	}
}


