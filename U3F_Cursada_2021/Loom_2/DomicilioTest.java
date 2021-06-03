package Loom_2;

import org.junit.Assert;
import org.junit.Test;

public class DomicilioTest {

	@Test
	public void crearUnDomicilioConDatosObligatoriosYOpcionales(){
		
		String dato = "Av Maipu 3451 7mo A Vicente Lopez Vicente Lopez Buenos Aires Argentina";
		DatoDeContacto mf = new Domicilio("Av Maipu",3451,"7mo","A","Vicente Lopez","Vicente Lopez","Buenos Aires","Argentina");
		
		Assert.assertEquals(dato,mf.toString());
	}
	@Test
	public void crearUnDomicilioSoloConDatosObligatorios(){
		
		String dato = "Av Segurola 4387  -   -  Villa Devoto  -  Buenos Aires Argentina";
		DatoDeContacto mf = new Domicilio("Av Segurola",4387,"Villa Devoto","Buenos Aires","Argentina");
		
		Assert.assertEquals(dato,mf.toString());
	}
	@Test
	public void editarDomicilioConDatosObligatoriosYOpcionales(){
		
		DatoDeContacto mf = new Domicilio("Av Maipu",3451,"7mo","A","Vicente Lopez","Vicente Lopez","Buenos Aires","Argentina");
		mf.editar("Av Juan B Justo",2123,"2do","D","Villa Devoto","CABA","Buenos Aires","Argentina");
		
		String dato = "Av Juan B Justo 2123 2do D Villa Devoto CABA Buenos Aires Argentina";
		Assert.assertEquals(dato,mf.toString());
	}
	@Test
	public void editarDomicilioSoloConDatosObligatorios(){
		DatoDeContacto mf = new Domicilio("Av Maipu",3451,"Vicente Lopez","Buenos Aires","Argentina");
		mf.editar("Av Cabildo",5421,"CABA","Buenos Aires","Argentina");
		
		String dato = "Av Cabildo 5421  -   -  CABA  -  Buenos Aires Argentina";
		Assert.assertEquals(dato,mf.toString());
	}
}
