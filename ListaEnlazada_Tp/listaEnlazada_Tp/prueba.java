package listaEnlazada_Tp;

public class prueba {

	public static void main(String[] args){
		
		ListaDobleEnlace lista = new ListaDobleEnlace();

		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(3);
		lista.agregar(4);
		lista.agregar(5);
		System.out.println(lista.obtener(0));
		System.out.println(lista.obtener(1));
		System.out.println(lista.obtener(2));
		System.out.println(lista.obtener(3));
		System.out.println(lista.obtener(4));
		
		lista.quitar(2);

		System.out.println(lista.obtener(0));
		System.out.println(lista.obtener(1));
		System.out.println(lista.obtener(2));
		System.out.println(lista.obtener(3));
		System.out.println(lista.obtener(4));
	}
}
