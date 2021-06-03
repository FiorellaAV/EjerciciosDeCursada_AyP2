package listaEnlazada_Tp;

public class ListaEnlazada implements Lista {

	//Atributos
    private Nodo head;
    private int size;

    //Constructor
    public ListaEnlazada(){
        head = null;
        size = 0;
    }
    /*
     * Metodo privado que comprueba si la lista esta vacia
     * */
    private boolean estaVacia(){
        return head == null;
    }
    
    /*
     * Metodo implementado de la interfaz lista
     * 
     * Este metodo agrega un elemento ( crea un nodo) al final de la lista
     * 
     */
    @Override
    public void agregar(int elemento){
        
        Nodo nuevoNodo = new Nodo(elemento, null);
        
        if (estaVacia()) {
           
            head = nuevoNodo;
        } else{
            Nodo aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(nuevoNodo);
        }
        size++;
    }
    /*
     * Metodo implementado de la interfaz lista
     * 
     * Este metodo devuelve un elemento en la posicion que se le pase como
     * parametro
     *  
     */
    @Override
    public int obtener(int posicion) {
    	
    	if(posicion<0 || posicion>size ){
    		throw new NullPointerException();
    	}
    	if (posicion == 0) {
    		return head.getElemento();
    	}else{
    		Nodo aux = head;
    		for (int i = 0; i < posicion; i++) {
    			aux = aux.getNext();
    		}
    		return aux.getElemento();
    	}
    }
    /*
     * Metodo implementado de la interfaz lista
     * 
     * Este metodo quita un elemento de la lista segun la posicion que se le pase
     * como parametro
     *  
     * */
    @Override
    public void quitar(int posicion){

    	if(posicion<0 || posicion>size ){
    		throw new NullPointerException();
    	}
    	if(posicion == 0){
    	
    		head = head.getNext();
    	}
    	else{
    		Nodo aux = head;
    		for (int i = 0; i < posicion-1; i++) {
    			aux = aux.getNext();
    		}
    		Nodo siguiente = aux.getNext();
    		aux.setNext(siguiente.getNext());
    	}
    	size--;
    }
}
