package listaEnlazada_Tp;

public class Timer {

	//Atributos
	private long startTime = 0;
	private long endTime = 0;
   
	//Metodo que inicia el "reloj"
	public void start(){
		startTime = System.currentTimeMillis();
	} 
	//Metodo que detiene el "reloj"
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	//Metodo que devuelve el tiempo total que estuvo corrienedo el reloj
	public long getTotalTime(){
		return endTime - startTime;
	}
}