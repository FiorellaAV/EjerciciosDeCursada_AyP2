package listaEnlazada_Tp;
public class PruebaDeTiempos {
 
	Timer timer = new Timer();
	ListaEnlazada lista = new ListaEnlazada();
	ListaDobleEnlace listaDoble = new ListaDobleEnlace();
	public static void main(String[] args){
		
		PruebaDeTiempos mf = new PruebaDeTiempos();
	
		System.out.println("Pruebas de lista simple: agregar ");
		// 	PRUEBAS DE AGREGAR EN LISTA ENLAZADA
		mf.pruebaAgregar100elementos();
		mf.pruebaAgregar200elementos();
		mf.pruebaAgregar500elementos();
		mf.pruebaAgregar1000elementos();
		mf.pruebaAgregar2000elementos();
		mf.pruebaAgregar5000elementos();
		mf.pruebaAgregar500000elementos();
		System.out.println("Pruebas de lista doble: agregar ");
		//  PRUEBAS DE AGREGAR EN LISTA DOBLE ENLACE
		mf.pruebaAgregar100elementosLDE();
		mf.pruebaAgregar200elementosLDE();
		mf.pruebaAgregar500elementosLDE();
		mf.pruebaAgregar1000elementosLDE();
		mf.pruebaAgregar2000elementosLDE();
		mf.pruebaAgregar5000elementosLDE();
		mf.pruebaAgregar500000elementosLDE();
		//  PRUEBAS DE QUITAR EN LISTA ENLAZADA
		System.out.println("Pruebas de lista simple: quitar");
		mf.pruebaQuitar100elementos();
		mf.pruebaQuitar200elementos();
		mf.pruebaQuitar500elementos();
		mf.pruebaQuitar1000elementos();
		mf.pruebaQuitar2000elementos();
		mf.pruebaQuitar5000elementos();
		mf.pruebaQuitar500000elementos();
		//  PRUBAS DE QUITAR EN LISTA DOBLE ENLACE
		System.out.println("Pruebas de lista doble: quitar ");
		mf.pruebaQuitar100elementosLDE();
		mf.pruebaQuitar200elementosLDE();
		mf.pruebaQuitar500elementosLDE();
		mf.pruebaQuitar1000elementosLDE();
		mf.pruebaQuitar2000elementosLDE();
		mf.pruebaQuitar5000elementosLDE();
		mf.pruebaQuitar500000elementosLDE();
		//  PRUEBAS DE OBTENER EN LISTA ENLAZADA
		System.out.println("Pruebas de lista simple: obtener");
		mf.pruebaObtener100elementos();
		mf.pruebaObtener200elementos();
		mf.pruebaObtener500elementos();
		mf.pruebaObtener1000elementos();
		mf.pruebaObtener2000elementos();
		mf.pruebaObtener5000elementos();
		mf.pruebaObtener500000elementos();
		//  PRUEBAS DE OBTENER EN LISTA DOBLE ENLACE
		System.out.println("Pruebas de lista doble: obtener ");
		mf.pruebaObtener100elementosLDE();
		mf.pruebaObtener200elementosLDE();
		mf.pruebaObtener500elementosLDE();
		mf.pruebaObtener1000elementosLDE();
		mf.pruebaObtener2000elementosLDE();
		mf.pruebaObtener5000elementosLDE();
		mf.pruebaObtener500000elementosLDE();
	}
	public void pruebaAgregar100elementos(){

		timer.start();
		for(int i = 0;i<100;i++){
			lista.agregar((int) Math.random()*100);
		}
		timer.stop();
		System.out.println("100 elementos en: " + timer.getTotalTime() + " miliseconds " );
	}
	public void pruebaAgregar200elementos(){

		timer.start();
		for(int i = 0;i<200;i++){
			lista.agregar((int) Math.random()*200);
		}
		timer.stop();
		System.out.println("200 elementos en: " + timer.getTotalTime() + " miliseconds " );
	}
	public void pruebaAgregar500elementos(){

		timer.start();
		for(int i = 0;i<500;i++){
			lista.agregar((int) Math.random()*500);
		}
		timer.stop();
		System.out.println("500 elementos en: " + timer.getTotalTime() + " miliseconds " );
	}
	public void pruebaAgregar1000elementos(){

		timer.start();
		for(int i = 0;i<1000;i++){
			lista.agregar((int) Math.random()*1000);
		}
		timer.stop();
		System.out.println("1000 elementos en: " + timer.getTotalTime() + " miliseconds " );
	}
	public void pruebaAgregar2000elementos(){

		timer.start();
		for(int i = 0;i<2000;i++){
			lista.agregar((int) Math.random()*2000);
		}
		timer.stop();
		System.out.println("2000 elementos en: " + timer.getTotalTime() + " miliseconds " );
	}
	public void pruebaAgregar5000elementos(){

		timer.start();
		for(int i = 0;i<5000;i++){
			lista.agregar((int) Math.random()*5000);
		}
		timer.stop();
		System.out.println("5000 elementos en: " + timer.getTotalTime() + " miliseconds " );
	}
	public void pruebaAgregar500000elementos(){

		timer.start();
		for(int i = 0;i<500000;i++){
			lista.agregar((int) Math.random()*500000);
		}
		timer.stop();
		System.out.println("500000 elementos en: " + timer.getTotalTime() + " miliseconds " );
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////
	public void pruebaAgregar100elementosLDE(){
		timer.start();
		for(int i = 0; i<100;i++){
			listaDoble.agregar((int) Math.random()*100);
		}
		timer.stop();
		System.out.println("100 elementos en: "  + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaAgregar200elementosLDE(){
		timer.start();
		for(int i = 0; i<200;i++){
			listaDoble.agregar((int) Math.random()*200);
		}
		timer.stop();
		System.out.println("200 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	
	public void pruebaAgregar500elementosLDE(){
		timer.start();
		for(int i = 0; i<500;i++){
			listaDoble.agregar((int) Math.random()*500);
		}
		timer.stop();
		System.out.println("500 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	
	public void pruebaAgregar1000elementosLDE(){
		timer.start();
		for(int i = 0; i<1000;i++){
			listaDoble.agregar((int) Math.random()*1000);
		}
		timer.stop();
		System.out.println("1000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	
	public void pruebaAgregar2000elementosLDE(){
		timer.start();
		for(int i = 0; i<2000;i++){
			listaDoble.agregar((int) Math.random()*2000);
		}
		timer.stop();
		System.out.println("2000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	
	public void pruebaAgregar5000elementosLDE(){
		timer.start();
		for(int i = 0; i<5000;i++){
			listaDoble.agregar((int) Math.random()*5000);
		}
		timer.stop();
		System.out.println("5000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaAgregar500000elementosLDE(){
		timer.start();
		for(int i = 0; i<500000;i++){
			listaDoble.agregar((int) Math.random()*500000);
		}
		timer.stop();
		System.out.println("500000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public void pruebaQuitar100elementos(){
		for(int i = 0; i<200;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<100;i++){
			lista.quitar((int)Math.random()*100);
		}
		timer.stop();
		System.out.println("100 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar200elementos(){
		for(int i = 0; i<400;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<200;i++){
			lista.quitar((int)Math.random()*200);
		}
		timer.stop();
		System.out.println("200 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar500elementos(){
		for(int i = 0; i<1000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500;i++){
			lista.quitar((int)Math.random()*500);
		}
		timer.stop();
		System.out.println("500 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar1000elementos(){
		for(int i = 0; i<2000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<1000;i++){
			lista.quitar((int)Math.random()*1000);
		}
		timer.stop();
		System.out.println("1000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar2000elementos(){
		for(int i = 0; i<4000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<2000;i++){
			lista.quitar((int)Math.random()*2000);
		}
		timer.stop();
		System.out.println("2000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar5000elementos(){
		for(int i = 0; i<10000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<5000;i++){
			lista.quitar((int)Math.random()*5000);
		}
		timer.stop();
		System.out.println("5000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar500000elementos(){
		for(int i = 0; i<1000000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500000;i++){
			lista.quitar((int)Math.random()*500000);
		}
		timer.stop();
		System.out.println("500000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public void pruebaQuitar100elementosLDE(){
		for(int i = 0; i<200;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<100;i++){
			listaDoble.quitar((int)Math.random()*100);
		}
		timer.stop();
		System.out.println("100 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar200elementosLDE(){
		for(int i = 0; i<400;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<200;i++){
			listaDoble.quitar((int)Math.random()*200);
		}
		timer.stop();
		System.out.println("200 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar500elementosLDE(){
		for(int i = 0; i<1000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500;i++){
			listaDoble.quitar((int)Math.random()*500);
		}
		timer.stop();
		System.out.println("500 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar1000elementosLDE(){
		for(int i = 0; i<2000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<1000;i++){
			listaDoble.quitar((int)Math.random()*1000);
		}
		timer.stop();
		System.out.println("1000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar2000elementosLDE(){
		for(int i = 0; i<4000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<2000;i++){
			listaDoble.quitar((int)Math.random()*2000);
		}
		timer.stop();
		System.out.println("2000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar5000elementosLDE(){
		for(int i = 0; i<10000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<5000;i++){
			listaDoble.quitar((int)Math.random()*5000);
		}
		timer.stop();
		System.out.println("5000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaQuitar500000elementosLDE(){
		for(int i = 0; i<1000000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500000;i++){
			listaDoble.quitar((int)Math.random()*500000);
		}
		timer.stop();
		System.out.println("500000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void pruebaObtener100elementos(){
		for(int i = 0; i<100;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<100;i++){
			lista.obtener((int) Math.random()*100);
		}
		timer.stop();
		System.out.println("100 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener200elementos(){
		for(int i = 0; i<200;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<200;i++){
			lista.obtener((int) Math.random()*200);
		}
		timer.stop();
		System.out.println("200 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener500elementos(){
		for(int i = 0; i<500;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500;i++){
			lista.obtener((int) Math.random()*500);
		}
		timer.stop();
		System.out.println("500 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener1000elementos(){
		for(int i = 0; i<1000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<1000;i++){
			lista.obtener((int) Math.random()*1000);
		}
		timer.stop();
		System.out.println("1000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener2000elementos(){
		for(int i = 0; i<2000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<2000;i++){
			lista.obtener((int) Math.random()*2000);
		}
		timer.stop();
		System.out.println("2000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener5000elementos(){
		for(int i = 0; i<5000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<5000;i++){
			lista.obtener((int) Math.random()*5000);
		}
		timer.stop();
		System.out.println("5000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener500000elementos(){
		for(int i = 0; i<500000;i++){
			lista.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500000;i++){
			lista.obtener((int) Math.random()*500000);
		}
		timer.stop();
		System.out.println("500000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void pruebaObtener100elementosLDE(){
		for(int i = 0; i<100;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<100;i++){
			listaDoble.obtener((int) Math.random()*100);
		}
		timer.stop();
		System.out.println("100 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener200elementosLDE(){
		for(int i = 0; i<200;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<200;i++){
			listaDoble.obtener((int) Math.random()*200);
		}
		timer.stop();
		System.out.println("200 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener500elementosLDE(){
		for(int i = 0; i<500;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500;i++){
			listaDoble.obtener((int) Math.random()*500);
		}
		timer.stop();
		System.out.println("500 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener1000elementosLDE(){
		for(int i = 0; i<1000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<1000;i++){
			listaDoble.obtener((int) Math.random()*1000);
		}
		timer.stop();
		System.out.println("1000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener2000elementosLDE(){
		for(int i = 0; i<2000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<2000;i++){
			listaDoble.obtener((int) Math.random()*2000);
		}
		timer.stop();
		System.out.println("2000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener5000elementosLDE(){
		for(int i = 0; i<5000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<5000;i++){
			listaDoble.obtener((int) Math.random()*5000);
		}
		timer.stop();
		System.out.println("5000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	public void pruebaObtener500000elementosLDE(){
		for(int i = 0; i<500000;i++){
			listaDoble.agregar(i);
		}
		timer.start();
		for(int i = 0; i<500000;i++){
			listaDoble.obtener((int) Math.random()*500000);
		}
		timer.stop();
		System.out.println("500000 elementos en: " + timer.getTotalTime() + " miliseconds ");
	}
	
}