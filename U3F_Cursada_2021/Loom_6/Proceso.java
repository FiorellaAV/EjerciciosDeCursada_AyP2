package Loom_6;

public class Proceso implements Comparable<Proceso> {
	
	public enum Estado {
		LISTO, FINALIZADO
	};
	private int tiempoDeArribo;
	private int tiempoDeEjecucion;
	private int prioridad;
	private Estado status;
	
	/*
	 * LISTO = ya puede ser en algun momento procesado
	 * FINALIZADO = ya fue procesado
	 * */
	
	public Proceso(String procesoName, int tiempoDeArribo, int tiempoDeEjecucion, int prioridad) {

		if((procesoName == null) ||(tiempoDeArribo <0) || (tiempoDeEjecucion <0) || (prioridad <0)){
			throw new Error("Los tiempos de arribo, de ejecucion y la prioridad no pueden ser negativos. Adicionalmente el nombre del proceso no puede ser nulo");
		}
		this.tiempoDeArribo = tiempoDeArribo;
		this.tiempoDeEjecucion = tiempoDeEjecucion;
		this.prioridad = prioridad;
	}
	/*
	 * Metodo que devuelve el tiempo de ejecucion
	 * */
	public long getT_ejecucion() {
		return tiempoDeEjecucion;
	}
	/*
	 * Metodo para settear el estado del proceso.
	 * Recibe como parametro un Estado
	 * */
	public void setStatus(Estado finalizado) {

		if (finalizado.equals(Estado.FINALIZADO)){
		status = Proceso.Estado.FINALIZADO;
		}
		else{
			status = Proceso.Estado.LISTO;
		}
	}
	/*
	 * Metodo que devuelve el tiempo de arribo
	 * */
	public int getTiempoDeArribo(){
		return this.tiempoDeArribo;
	}
	/*
	 * Metodo que devuelve el Estado del proceso
	 * */
	public Estado getStatus(){
		return status;
	}
	@Override
	public int compareTo(Proceso other) {

		if(this.prioridad < other.prioridad){
			return -1;
		}
		
		if(this.prioridad > other.prioridad){
			return 1;
		}
		
		if(this.tiempoDeArribo < other.tiempoDeArribo) {

			return -1;
		}
		else {
			return 1;
		}
	}
}

