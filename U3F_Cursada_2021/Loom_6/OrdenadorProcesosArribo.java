package Loom_6;

import java.util.Comparator;

public class OrdenadorProcesosArribo implements Comparator<Proceso> {

	@Override
	public int compare(Proceso proceso1, Proceso proceso2) {
	
		return proceso1.getTiempoDeArribo()-proceso2.getTiempoDeArribo();
	}

}

