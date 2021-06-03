package listaEnlazada_Tp;

import java.util.Iterator;

public class ListaDobleEnlace implements Lista{
	
	// Atributos
	private int size;
	
	ListaEnlazada listaPar = new ListaEnlazada();
	ListaEnlazada listaImpar = new ListaEnlazada();

	// Construtor
	public ListaDobleEnlace(){
		size =0;
	}
	
	/* Metodo implentado de la interfaz lista
	 * 
	 * Este metodo devuelve el elemento en la posicion que se desee buscar
	 * 
	 */
	@Override
	public int obtener(int posicion) {
	
		if(posicion<0 || posicion>size ){
			throw new NullPointerException();
		}
		int indice = buscarPosicion(posicion, posicion%2);
		if(posicion%2 == 0){
			return listaPar.obtener(indice);
		}
		else{
			return listaImpar.obtener(indice);
		}
	}

	/* Metodo implentado de la interfaz lista
	 * 
	 * Este metodo agrega el elemento que se desee al final de la lista,
	 * en caso de que la posicion sea par se colocara en la lista par, en caso
	 * contrario se colocara en la lista impar
	 * 
	 */
	@Override
	public void agregar(int elemento) {

		if(size%2 == 0){
			listaPar.agregar(elemento);
		}
		else{
			listaImpar.agregar(elemento);
		}
		size++;
	}

	/* Metodo implentado de la interfaz lista
	 * 
	 * Este metodo quita en la posicion indicada un elemento (Nodo)
	 * en caso de que la posicion sea par se quitara de la lista par
	 * en caso contrario se quitara de la lista impar
	 */
	@Override
	public void quitar(int posicion) {

		if(posicion<0 || posicion>size ){
			throw new NullPointerException();
		}
		int indice = buscarPosicion(posicion, posicion%2);
		if(posicion%2 == 0){
			listaPar.quitar(indice);
		}
		else{
			listaImpar.quitar(indice);
		}
		size--;
	}

	/*
	 * Metodo privado que recibe como parametro una posicion y un valor inicial
	 * y devuelve el indice de la posicion (ESTE METODO SE UTILIZA PARA PODER
	 * ENCONTRAR LAS POSICIONES EN LAS LISTAS PAR O IMPAR, ya que las mismas tienen
	 * otros indices a los de la posiciones)
	 * 
	 * */
	
	private int buscarPosicion(int posicion, int valorInicial){

		int sumador = valorInicial;
		int contador = 0;

		while(sumador < posicion ){
			contador++;
			sumador = sumador +2;
		}
		return contador;
	}
	/*
	 * Metodo iterador que internamente crea un iterador con los metodos estandar
	 * en java y devuelve este mismo iterador.
	 * 
	 * */
	public Iterator<Nodo> iterator(Nodo nodo) {
		
		Iterator<Nodo> it = new Iterator<Nodo>() {
						
			private int currentIndex = 0;

			public boolean hasNext() {
				return currentIndex < size && nodo.getNext() != null;
			}
			public Nodo next() {
				return nodo.getNext();
			}
		};
		return it;
	}
}

