package Loom_5;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner teclado;
	private static int menuChoice = -1;
	
	static Agenda agenda = new Agenda();
	
	public static void main(String []args) throws IOException{
		
		Main.teclado = new Scanner(System.in);
		cargarPantalla();
	}
	/*
	 * Metodo que muestra en pantalla un menu para interactuar con la agenda
	 * 
	 * */
	public static void cargarPantalla() throws IOException{
		
		while(menuChoice!=0){

		System.out.println("                            ");
		System.out.println("           MENU             ");
		System.out.println("                            ");
		System.out.println(" 1- Cargar Archivo          ");
		System.out.println(" 2- Guardar Agenda          ");
		System.out.println(" 3- Agregar Contacto        ");
		System.out.println(" 4- Borrar Contacto         ");
		System.out.println(" 5- Mostrar Agenda          ");
		System.out.println(" 0- Salir                   ");
		System.out.println("                            ");
		
		
		
			menuChoice = getIntInput();
			switch(menuChoice){
			case 1:
				cargarArchivo();
				cargarPantalla();
				break;
			case 2:
				guardarAgenda();
				cargarPantalla();
				break;
			case 3:
				try {
					agregarContacto();
					cargarPantalla();
				} catch (ContactoInvalido e1) {
					e1.printStackTrace();
				}
				
				break;
			case 4:
					borrarContacto();
					cargarPantalla();
				
				break;
			case 5:
				agenda.mostrarTodosLosContactos();
				cargarPantalla();
				break;
			case 0:
				break;
			}
		}
	}
	
	/*
	 * Metodo privado utilizado por la pantalla de carga para cargar un archivo.
	 * el mismo utiliza el metodo de cargarArchivo de la clase agenda
	 * este tembien interactua por consola para recibir el nombre del archivo que desea cargar. 
	 * (NO NECESITA QUE SE ESCRIBA .TXT, con solo escribir el nombre del archivo funciona)
	 * */
	private static void cargarArchivo() throws IOException{

		try{
			System.out.println("Por favor ingrese el nombre del archivo txt que desea cargar");
			String nombreDeArchivo = teclado.next();
			agenda.cargarArchivo(nombreDeArchivo);
			System.out.println("El archivo se ha cargado exitosamente!");
		}catch(FileNotFoundException e){
			System.out.println("El archivo que desea cargar no se ha encontrado, intente nuevamente");
		}

	}
	/*
	 * Metodo privado utilizado por la pantalla de carga para guardar la agenda en un archivo txt
	 * El mismo utiliza el metodo guarfarAgenda de la clase Agenda.
	 * Adicionalmente este metodo crea el archivo .txt en la carpeta del programa, si la misma ya exite, la sobreescribe.
	 * */
	private static void guardarAgenda() throws IOException{
		 System.out.println("Por favor ingrese el nombre que tendra el archivo txt");
		 String nombreDeArchivo = teclado.next();
		 agenda.guardarAgenda(nombreDeArchivo);
		 System.out.println("La agenda se ha guardado exitosamente!");
	}
	
	/*
	 * Metodo privado utilizado por la pantalla de carga para agregar un contacto a la lista
	 * El mismo utiliza el metodo agregarContacto de la clase Agenda
	 * 
	 * */
	private static void agregarContacto() throws ContactoInvalido{

		
		System.out.println("Por favor ingrese el nombre del contacto");
		String nombre = teclado.next();
		if(validarDato(nombre)){
			throw new ContactoInvalido();
		}
		System.out.println("Por favor ingrese el apellido del contacto");
		String apellido = teclado.next();
		if(validarDato(apellido)){
			throw new ContactoInvalido();
		}
		System.out.println("Por favor ingrese el mail del contacto");
		
		String mail = teclado.next();
		while(!mail.contains("@")){
			System.out.println("El dato ingresado no es un mail. Por favor ingrese el mail del contacto");
			mail = teclado.next();
		}
		agenda.agregarContacto(nombre, apellido, mail);
		System.out.println("El contacto se ha cargado exitosamente!");
		
	}
	/*
	 * Metodo privado utilizado por la pantalla de carga
	 * El mismo utiliza el metodo borrarContacto de la clase Agenda
	 * */
	private static void borrarContacto(){
		
		try{
			System.out.println("Por favor ingrese el apellido del contacto que desea borrar");
			String apellido = teclado.next();
			agenda.borrarContacto(apellido);
			System.out.println("El contacto se ha borrado exitosamente!");
		}catch(ContactoInexistenteEx e){
			System.out.println("El contato que desea borrar de la lista, no se ha encontrado. Intente nuevamente");
		}
	}

	
	/*
	 * Metodo privado que verifica que el dato sea valido, es decir que no contecga ni numeros, ni caracteres especiales
	 * El mismo recibe como parametro un String y devuelve un booleano
	 * */
	private static boolean validarDato(String dato){

		char [] caracteres = {'1','2','3','4','5','6','7','8','9','+','*','-','_','°','|','!','?','¿','=','¨','´','{','}','(',')','/','&','%','$','#','@'};

		char[] datoIngresado = dato.toCharArray();
		int contador = 0;
		while(contador < datoIngresado.length){	

			for(int i = 0;i<caracteres.length;i++){

				if(datoIngresado[contador] ==(caracteres[i])){
					return true;
				}
			}
			contador++;
		}
		return false;
	}
	

	/*
	 *Metodo privado utilizado por la pantalla de carga 
	 *Devuelve el String ingresado por consola en fomato de integer 
	 * */
	private static int getIntInput(){
		int numero = -1;
		while(numero<0) {
			try {
				numero = Integer.parseInt(teclado.nextLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Opción invalida. Intente nuevamente");
			}
		}
		return numero;
	}

}






