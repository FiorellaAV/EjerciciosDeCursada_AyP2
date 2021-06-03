package Loom_6;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SistemaOperativo {
	/**
	 * cola priorizadda por prioridad, a igual prioridad, prioriza por tiempo de arribo.
	 */
	private PriorityQueue<Proceso> colaProcesos = new PriorityQueue<Proceso>();
	/**
	 * cola priorizadda por tiempo de arribo.
	 */
	private PriorityQueue<Proceso> colaArribo;
	/**
	 * lista de procesos que fueron terminados de procesar.
	 */
	private ArrayList<Proceso> procesosSalida;
	private long tiempoProcesador;
	private Procesador procesador;
	
	/**
	 * @param colaArribo cola prorizada por tiempo de arribo
	 */
	public SistemaOperativo(PriorityQueue<Proceso> colaArribo) {
		this.tiempoProcesador = 0;
		this.colaArribo = colaArribo;
		this.procesosSalida = new ArrayList<Proceso>();
		this.procesador = new Procesador(procesosSalida);
	}
	
	/**
	 * Se ejecuta la simulaci�n durante el tiempo pasado como parmetro. 
	 * en cada ciclo, se desencola los procesos de la colaArribo segun 
	 * si el tiempo de arribo coincide con el tiempo de proceso actual y se encola
	 * en colaProcesos solo si el proceso no esta terminado.
	 * Tambien si el procesador esta libre comienza a procesar un proceso de la colaProcesos.
	 * El procesador procesa en cada ciclo el proceso que tiene asignado. 
	 * @param tiempo duraci�n de la simulaci�n
	 */
	public void simular(long tiempo) {
		
		if(tiempo<=0){
			throw new Error("El tiempo no puede ser negativo,ni cero");
		}	
		Proceso procesoActual = null;
		for (; tiempoProcesador <= tiempo; tiempoProcesador++) {
			
			while((!colaArribo.isEmpty()) && (colaArribo.peek().getTiempoDeArribo() == tiempoProcesador)){
				procesoActual = colaArribo.poll();
				if(procesoActual.getStatus() != Proceso.Estado.FINALIZADO){
					colaProcesos.offer(procesoActual);
				}
			}
			if (procesador.getStatus() == Procesador.Estado.LIBRE) {
				if (!colaProcesos.isEmpty()) {
					procesador.procesar(colaProcesos.poll());
				}
			}
			procesador.pulsoClock();
		}
	}
	/*
	 * Metodo que devuelve un arrayList con los procesos de salida
	 * */
	public ArrayList<Proceso> listarProcesosSalida() {
		return procesosSalida;
	}

}
