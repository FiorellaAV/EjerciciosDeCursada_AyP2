package Loom_6;

import java.util.ArrayList;
import java.util.PriorityQueue;

import org.junit.Assert;
import org.junit.Test;

public class SistemaOperativoTest {

	@Test
	public void todosLosProcesosSonAtendidos() {
		Proceso p0 = new Proceso("P0", 0, 5, 4);
		Proceso p1 = new Proceso("P1", 1, 3, 2);
		Proceso p2 = new Proceso("P2", 2, 8, 5);
		Proceso p3 = new Proceso("P3", 3, 2, 1);
		Proceso p4 = new Proceso("P4", 4, 3, 2);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(25);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());

	}

	@Test
	public void unProcesoNoEsAtendidoPorEstarFinalizado() {
		Proceso p0 = new Proceso("P0", 0, 5, 4);
		Proceso p1 = new Proceso("P1", 1, 3, 2);
		Proceso p2 = new Proceso("P2", 2, 8, 5);
		Proceso p3 = new Proceso("P3", 3, 2, 1);
		Proceso p4 = new Proceso("P4", 4, 3, 2);
		Proceso p5 = new Proceso("P5", 0, 3, 2);
		p5.setStatus(Proceso.Estado.FINALIZADO);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);
		colaArribo.add(p5);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(25);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());

	}

	@Test
	public void arribosAlMismoTiempo() {
		Proceso p0 = new Proceso("P0", 0, 5, 4);
		Proceso p1 = new Proceso("P1", 0, 5, 2);
		Proceso p2 = new Proceso("P2", 0, 5, 5);
		Proceso p3 = new Proceso("P3", 0, 5, 2);
		Proceso p4 = new Proceso("P4", 0, 5, 3);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p0);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(25);

		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());
	}

	@Test
	public void arribosDistanciados() {
		Proceso p0 = new Proceso("P0", 40, 5, 1);
		Proceso p1 = new Proceso("P1", 30, 5, 2);
		Proceso p2 = new Proceso("P2", 20, 5, 3);
		Proceso p3 = new Proceso("P3", 10, 5, 4);
		Proceso p4 = new Proceso("P4", 0, 5, 5);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p4);
		procesosSalida.add(p3);
		procesosSalida.add(p2);
		procesosSalida.add(p1);
		procesosSalida.add(p0);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(50);

		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());
	}

	@Test
	public void simulacionPausada() {
		Proceso p0 = new Proceso("P0", 40, 5, 1);
		Proceso p1 = new Proceso("P1", 30, 5, 2);
		Proceso p2 = new Proceso("P2", 20, 5, 3);
		Proceso p3 = new Proceso("P3", 10, 5, 4);
		Proceso p4 = new Proceso("P4", 0, 5, 5);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p4);
		procesosSalida.add(p3);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(22);

		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());

		procesosSalida.add(p2);
		procesosSalida.add(p1);
		procesosSalida.add(p0);

		so.simular(50);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());
	}

	/*
	 * Metodo que espera que los resultados de las listas comparadas sean
	 * diferentes
	 */
	@Test
	public void resultadosDiferentes() {
		Proceso p0 = new Proceso("P0", 0, 5, 4);
		Proceso p1 = new Proceso("P1", 1, 3, 2);
		Proceso p2 = new Proceso("P2", 2, 8, 5);
		Proceso p3 = new Proceso("P3", 3, 4, 6);
		Proceso p4 = new Proceso("P4", 4, 3, 2);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p1);
		procesosSalida.add(p3);
		procesosSalida.add(p0);
		procesosSalida.add(p2);
		procesosSalida.add(p4);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(30);
		Assert.assertNotEquals(procesosSalida, so.listarProcesosSalida());

	}

	@Test
	public void TodosLosProcesosConMismaPrioridad() {

		Proceso p0 = new Proceso("P0", 0, 6, 4);
		Proceso p1 = new Proceso("P1", 1, 2, 4);
		Proceso p2 = new Proceso("P2", 2, 3, 4);
		Proceso p3 = new Proceso("P3", 3, 4, 4);
		Proceso p4 = new Proceso("P4", 4, 1, 4);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p1);
		procesosSalida.add(p2);
		procesosSalida.add(p3);
		procesosSalida.add(p4);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(40);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());

	}

	@Test
	public void TodosLosProcesosCon_MismaPrioridad_y_MismoTiempoDeEjecucion() {

		Proceso p0 = new Proceso("P0", 0, 3, 3);
		Proceso p1 = new Proceso("P1", 1, 3, 3);
		Proceso p2 = new Proceso("P2", 2, 3, 3);
		Proceso p3 = new Proceso("P3", 3, 3, 3);
		Proceso p4 = new Proceso("P4", 4, 3, 3);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p1);
		procesosSalida.add(p2);
		procesosSalida.add(p3);
		procesosSalida.add(p4);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(20);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());
	}

	@Test
	public void TodosLosProcesosCon_MismaPrioridad_MismoTiempoDeEjecucion_Y_MismoArribo() {

		Proceso p0 = new Proceso("P0", 3, 3, 3);
		Proceso p1 = new Proceso("P1", 3, 3, 3);
		Proceso p2 = new Proceso("P2", 3, 3, 3);
		Proceso p3 = new Proceso("P3", 3, 3, 3);
		Proceso p4 = new Proceso("P4", 3, 3, 3);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(20);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());

	}

	@Test(expected = Error.class)
	public void simulacionConTiempoNegativo() {
		Proceso p0 = new Proceso("P0", 0, 5, 4);
		Proceso p1 = new Proceso("P1", 1, 3, 2);
		Proceso p2 = new Proceso("P2", 2, 8, 5);
		Proceso p3 = new Proceso("P3", 3, 2, 1);
		Proceso p4 = new Proceso("P4", 4, 3, 2);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(-30);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());

	}

	@Test(expected = Error.class)
	public void procesoConTiemposNegativos() {
		Proceso p0 = new Proceso("P0", 0, -5, 4);
		Proceso p1 = new Proceso("P1", 1, -3, 2);
		Proceso p2 = new Proceso("P2", 2, 8, -5);
		Proceso p3 = new Proceso("P3", 3, 2, -1);
		Proceso p4 = new Proceso("P4", 4, -3, 2);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(25);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());
	}

	@Test
	public void pruebaDe10ProcesosConAlgunosFinalizados() {
		Proceso p0 = new Proceso("P0", 0, 5, 4);
		Proceso p1 = new Proceso("P1", 1, 3, 2);
		Proceso p2 = new Proceso("P2", 2, 8, 5);
		Proceso p3 = new Proceso("P3", 3, 2, 1);
		Proceso p4 = new Proceso("P4", 4, 3, 2);
		Proceso p5 = new Proceso("P5", 5, 5, 4);
		Proceso p6 = new Proceso("P6", 6, 3, 2);
		Proceso p7 = new Proceso("P7", 7, 8, 5);
		Proceso p8 = new Proceso("P8", 8, 2, 1);
		Proceso p9 = new Proceso("P9", 9, 3, 2);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);
		colaArribo.add(p5);
		colaArribo.add(p6);
		colaArribo.add(p7);
		colaArribo.add(p8);
		colaArribo.add(p9);

		p1.setStatus(Proceso.Estado.FINALIZADO);
		p9.setStatus(Proceso.Estado.FINALIZADO);
		p4.setStatus(Proceso.Estado.FINALIZADO);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();

		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p6);
		procesosSalida.add(p8);
		procesosSalida.add(p5);
		procesosSalida.add(p2);
		procesosSalida.add(p7);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(50);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());
	}

	@Test(expected = Error.class)
	public void procesosConNombresNulos() {
		Proceso p0 = new Proceso(null, 0, 5, 4);
		Proceso p1 = new Proceso("P1", 1, 1, 5);
		Proceso p2 = new Proceso(null, 2, 9, 2);
		Proceso p3 = new Proceso("P3", 3, 4, 3);
		Proceso p4 = new Proceso("P4", 4, 2, 1);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(15);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());
	}

	@Test(expected = Error.class)
	public void prueba_De_Simulacion_Igual_A_Cero() {
		Proceso p0 = new Proceso("P0", 0, 5, 4);
		Proceso p1 = new Proceso("P1", 1, 3, 2);
		Proceso p2 = new Proceso("P2", 2, 8, 5);
		Proceso p3 = new Proceso("P3", 3, 2, 1);
		Proceso p4 = new Proceso("P4", 4, 3, 2);

		PriorityQueue<Proceso> colaArribo = new PriorityQueue<Proceso>(
				new OrdenadorProcesosArribo());
		colaArribo.add(p0);
		colaArribo.add(p1);
		colaArribo.add(p2);
		colaArribo.add(p3);
		colaArribo.add(p4);

		ArrayList<Proceso> procesosSalida = new ArrayList<Proceso>();
		procesosSalida.add(p0);
		procesosSalida.add(p3);
		procesosSalida.add(p1);
		procesosSalida.add(p4);
		procesosSalida.add(p2);

		SistemaOperativo so = new SistemaOperativo(colaArribo);
		so.simular(0);
		Assert.assertEquals(procesosSalida, so.listarProcesosSalida());

	}
}
