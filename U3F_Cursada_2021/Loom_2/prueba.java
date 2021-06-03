package Loom_2;

public class prueba{

	public static void main (String[]args){
		
		Agenda agenda2021 = new Agenda();
		
		agenda2021.crearUnContacto("Marta", "Perez");
		agenda2021.crearUnContacto("Juan", "Dominguez");
		agenda2021.crearUnContacto("Juan","Tomas","Dirmo");
		agenda2021.crearUnContacto("Tamara","Esther","Sabiola");
		
		System.out.println(agenda2021.mostrarDatosDeContacto(0));
		System.out.println(agenda2021.mostrarDatosDeContacto(1));
		System.out.println(agenda2021.mostrarDatosDeContacto(2));
		System.out.println(agenda2021.mostrarDatosDeContacto(3));
		
		
		System.out.println("------------------------------");
		agenda2021.editarContacto(2, "Samanta","Paola", "Muñiz");
		
		System.out.println(agenda2021.mostrarDatosDeContacto(2));
		
		System.out.println("------------------------------");
		agenda2021.removerContacto(0);
		
		System.out.println(agenda2021.mostrarDatosDeContacto(0));
		System.out.println(agenda2021.mostrarDatosDeContacto(1));
		System.out.println(agenda2021.mostrarDatosDeContacto(2));
	}
}
