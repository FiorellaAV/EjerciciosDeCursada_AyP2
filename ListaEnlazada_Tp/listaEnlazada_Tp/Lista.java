package listaEnlazada_Tp;

public interface Lista {

	//Devuelve la posicion en la lista//
	public int obtener(int posicion);
	
	//Agrega un nuevo nodo a la lista//
	public void agregar( int elemento);
	
	//Remueve un elemeto de la lista//
	public void quitar(int posicion);
}
