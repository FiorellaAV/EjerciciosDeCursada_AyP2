package Loom_2;

import org.junit.Assert;
import org.junit.Test;

public class TelefonoTest {

	@Test
	public void crearUnNumeroDeTelefono(){
		
		Telefono mf = new Telefono("1131546587","Celular");
		
		Assert.assertEquals("1131546587 Celular", mf.toString());
	}
	@Test
	public void cambiarNumeroDeTelefono(){
		Telefono mf = new Telefono("1131546587","Celular");
		
		mf.setTelefono("1135687896");
		Assert.assertEquals("1135687896 Celular", mf.toString());
	}
	@Test
	public void cambiarElTipoDeNumeroDeTelefono(){
		Telefono mf = new Telefono("1131546587","Celular");
		
		mf.setTipoDeTelefono("Trabajo");
		Assert.assertEquals("1131546587 Trabajo", mf.toString());
	}
	@Test
	public void cambiarElNumeroYElTipoDeNumeroDeTelefono(){
		Telefono mf = new Telefono("1131546587","Celular");
		
		mf.setTelefono("48756985");
		mf.setTipoDeTelefono("Casa");
		Assert.assertEquals("48756985 Casa", mf.toString());
	}
	
}
