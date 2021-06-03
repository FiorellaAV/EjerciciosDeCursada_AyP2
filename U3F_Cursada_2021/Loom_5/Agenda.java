package Loom_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> contactos;
	
	public Agenda() {
		contactos = new ArrayList<Persona>();
	}
	
	/*
	 *Metodo que crea una persona y la agrega al arraylist (La lista de contactos)
	 *recibe como parametro 3 Strings (Nombre, apellido y mail); 
	 * */
	public void agregarContacto(String pNombre, String pApellido, String pMail) {
		
		Persona contacto = new Persona(pNombre, pApellido, pMail);
		contactos.add(contacto);
	}
	
	/**
	 * Borra un contacto de la agenda
	 * @param pApellido Apellido del contacto a borrar
	 * @throws ContactoInexistenteEx si no se encuentra el apellido buscado
	 */
	public void borrarContacto(String pApellido) throws ContactoInexistenteEx {
		int indice;
		
		indice = this.buscarContacto(pApellido);
		contactos.remove(indice);
	}
	
	/**
	 * Busca un contacto por apellido
	 * @param pApellido apellido del contacto buscado
	 * @return devuelve la primera aparición del apellido buscado
	 * @throws ContactoInexistenteEx si no existe ningún contacto con el apellido buscado
	 */
	private int buscarContacto(String pApellido) throws ContactoInexistenteEx {
		
		int i = 0;
		for (Persona contacto: contactos) {
			if (contacto.getApellido().equals(pApellido)) {
				return i;
			}
			i++;
		}
			
		throw new ContactoInexistenteEx(pApellido);
	}
	
	/**
	 * Muestra por pantalla todos los contactos de la Agenda
	 * Nota: no está bueno que un método muestre por pantalla los datos
	 * pero por ahora hasta que tengamos iteradores elegimos hacerlo de esta
	 * manera para no devolver todo el arreglo de contactos
	 */
	public void mostrarTodosLosContactos() {
		int i = 0;
		for(Persona contacto : contactos) {
			System.out.println(i+":\t"+contacto);
			i++;
		}
		System.out.println("\nTotal: "+i+" contactos\n");
	}
	
	/**
	 * Carga todos los contactos que puede en al agenda.
	 * El formato del archivo de entrada es el siguiente:
	 * Una línea por cada contacto, y en cada linea separado por coma
	 * y etiquetados los datos del contacto. Ej
	 * nombre: Juan, apellido: Perez, mail: jperez@gmail.com
	 * @param pArchivo nombre del archivo (path absoluto o
	 * relativo a la carpeta src del proyecto
	 * @throws IOException 
	 */
	public void cargarArchivo(String pArchivo) throws IOException{
		
		BufferedReader lector = new BufferedReader(new FileReader(pArchivo+".txt"));

		String linea;

		while ((linea=lector.readLine()) != null) {
			if (!linea.isEmpty()) {
				String[] dato = linea.split(",");

				if(validarDato(linea)){

					agregarContacto(dato[0],dato[1],dato[2]);
				}
			}
		}
		lector.close();

		/* OTRA FORMA DE HACERLO. ESTA RESPUESTA ME LA DIERON EN LOOM
		 * String linea = lector.readLine();
			while ((linea != null) && !linea.isBlank()) { // .isBlank() revisa, además, que la línea no esté llena de
							// espacios vacíos. Es más completa.
				if (validarDato(linea)) {

				String[] dato = linea.split(",|:"); // El operador | permite añadir más de un argumento de separación.
				agregarContacto(dato[1], dato[3], dato[5]); // Ahora ya no almacenamos 'nombre', 'apellido' y 'mail' en sí. 
				}

			linea = lector.readLine();
			}
			lector.close();
		 * 
		 * */
	}

	/**
	 * Guarda la agenda completa en disco, en el archivo especificado como parámetro
	 * Con el siguiente formato. Una línea por contacto, con los 
	 * datos etiquetados
	 * nombre: Juan, apellido: Perez, mail: jperez@gmail.com
	 * @param pArchivo nombre del archivo (path absoluto o relativo
	 * a la carpeta src del proyecto
	 * @throws IOException 
	 */
	public void guardarAgenda(String pArchivo) throws IOException {
		
		File file = new File(pArchivo + ".txt");
		FileWriter escritor = new FileWriter(file);
		PrintWriter impresor = new PrintWriter(escritor);

		for(int i = 0; i<contactos.size();i++) {
			if(!contactos.get(i).toString().contains("nombre")){
				impresor.println("nombre: " + contactos.get(i).getNombre()+ ", apellido: " + contactos.get(i).getApellido()+ ", mail: " + contactos.get(i).getMail());
			}
			else{
				impresor.println(contactos.get(i).getNombre() + "," + contactos.get(i).getApellido() + "," + contactos.get(i).getMail());
			}
		}
		
		impresor.close();
		
		
		/* OTRA FORMA DE ARMARLO. SACADO DE LA REVISION DE LOOM QUE ME HICIERON
		 * try {
			
		FileWriter escritor = new FileWriter(pArchivo + ".txt");
	
		for (Persona contacto : contactos) { // Se lee "Por cada 'contacto' en 'contactos'..."
				
			escritor.write("nombre: " + contacto.getNombre());
			escritor.write(", apellido: " + contacto.getApellido());
			escritor.write(", mail: " + contacto.getMail());
			escritor.write("\n");
		}
			
		escritor.close();
			
	} catch (IOException e) {
			
		System.err.println("No se puede escribir en el archivo");
	}
		 * */
	}
	
	/*
	 *Metodo privadado que valida que el dato sea valido, es decir que no contega null, que no este vacio , y que contenga @
	 *Este metodo devuelve un booleano 
	 * */
	private boolean validarDato(String dato){
		
		if(dato.contains("null") || dato.isEmpty() || !dato.contains("@") || dato.contains("  ") ){
			return false;
		}
		else{
			return true;
		}
	}
}


