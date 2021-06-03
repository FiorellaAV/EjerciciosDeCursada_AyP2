package Loom_3;

public class Demo {

	public static void main(String[] args){
		
		Empresa lista = new Empresa(10);
		Empleado p1 = new Gerente ("Maria","Gomez",1,false,2);
		Empleado p2 = new SinCategoriaEspecial("Juan","Perez",2, true, 2);
		Empleado p3 = new SinCategoriaEspecial("Juan","Martinez",25,2, true, 2);
		Empleado p4 = new PlantaTemporaria("Selma","Spazzo",2,true);
		Empleado p5 = new PlantaTemporaria("Samanta","Trotta",20,2,true);
		Empleado p7 = new PlantaTemporaria("Andres","Frisko",28,1,false);
		
	
		lista.agregarEmpleado(p1);
		lista.agregarEmpleado(p2);
		lista.agregarEmpleado(p3);
		lista.agregarEmpleado(p4);
		lista.agregarEmpleado(p5);
		lista.agregarEmpleado(p7);
		
		lista.calcularSueldo(20);
		lista.liquidarSueldo();
		
		System.out.println("*****************************************************************************");
		
		lista.calcularSueldo(30);
		lista.liquidarSueldo();
			
	}	
}
