package listaEnlazada_Tp;

public class Nodo {
	
	//Atibutos
	private int elemento;
	private Nodo next;
	//Constuctores
	public Nodo(int element,Nodo n){
		elemento = element;
		next = n;
	}
	public Nodo(int element){
		elemento = element;
	}
	//Metodo que devuelve el elemento en el nodo
	public int getElemento() {
		return elemento;
	}
	//Metodo que guarda el elemento que se le pase como paramentro en el nodo
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	//Metodo que devuelve el siguiente nodo al cual esta enlazado
	public Nodo getNext() {
		return next;
	}
	//Metodo que enlaza el nodo al nodo que se le pase como parametro
	public void setNext(Nodo next) {
		this.next = next;
	}
}
