package Loom_2;

import org.junit.Assert;
import org.junit.Test;

public class CorreoElectronicoTest {

	@Test
	public void crearUnCorreoElectronico(){
		
		CorreoElectronico mf = new CorreoElectronico("john.hale@gmail.com","Trabajo");
		
		Assert.assertEquals("john.hale@gmail.com Trabajo",mf.toString());
	}
	@Test
	public void cambiarElCorreoElectronico(){
		
	}
}
