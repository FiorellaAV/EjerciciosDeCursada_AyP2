package Loom_2;

import java.util.ArrayList;

public class Agenda {

	ArrayList<Persona> lista = new ArrayList<Persona>();
	/*
	 * Metodo que crea un contacto con nombre, segundo nombre y apellido en la agenda
	 * */
	public void crearUnContacto(String nombre, String segundoNombre, String apellido){
		
		Persona persona = new Persona(nombre,segundoNombre,apellido);
		
		lista.add(persona);
	}
	/*
	 * Metodo que crea un contacto con nombre y apellido en la agenda
	 * */
	public void crearUnContacto(String nombre, String apellido){
		
		Persona persona = new Persona(nombre,apellido);
		
		lista.add(persona);
	}
	/*
	 * Metodo que remueve un contacto de la agenda
	 * */
	public void removerContacto(int indice){
		lista.remove(indice);
	}
/*
 * PRE: SE LE DEBE PASAR UN INDICE PARA INDICAR CUAL CONTACTO SE QUIERE MODIFICAR Y EL NUEVO NOMBRE, SEGUNDO NOMBRE
 * Y APELLIDO QUE SE LE QUIERA COLOCAR
 * */
	public void editarContacto(int indice, String nuevoNombre, String nuevoSegundoNombre, String nuevoApellido){
		lista.get(indice).cambiarNombreySegundoNombre(nuevoNombre, nuevoSegundoNombre);
		lista.get(indice).cambiarApellido(nuevoApellido);
	}
	/*
	 * PRE: SE LE DEBE PASAR UN INDICE PARA INDICAR CUAL CONTACTO SE QUIERE MODIFICAR Y EL NUEVO NOMBRE
	 * Y APELLIDO QUE SE LE QUIERA COLOCAR
	 * */
	public void editarContacto(int indice, String nuevoNombre, String nuevoApellido){
		lista.get(indice).cambiarNombre(nuevoNombre);
		lista.get(indice).cambiarApellido(nuevoApellido);
	}
	
	public String mostrarDatosDeContacto(int indice){
		return lista.get(indice).toString();
	}
	/*
	 * Metodo que devuelve si la agenda se encuentra vacia
	 * */
	public boolean isEmpty(){
		return lista.isEmpty();
	}
}
