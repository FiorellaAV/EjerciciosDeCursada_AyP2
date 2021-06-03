package Loom_2;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {
	
	@Test
	public void crearUnaPersonaConUnNombreYUnApellidoYSinDatosDeContacto(){
		
		Persona mf = new Persona("Juan","Ramirez");
		
		Assert.assertEquals("Juan  Ramirez", mf.toString());
	}
	@Test
	public void crearUnaPersonaConDosNombresYUnApellidoYSinDatosDeContacto(){
		
		Persona mf = new Persona("Juan","Ignacio" ,"Ramirez");
		
		Assert.assertEquals("Juan Ignacio Ramirez", mf.toString());
	}
	@Test
	public void crearUnaPersonaConUnNombreYUnApellidoYConDatoDeContacto(){
		
		DatoDeContacto telefono = new Telefono("01124252336", " celular");
		Persona mf = new Persona("Juan","Ramirez", telefono );
		
		Assert.assertEquals(telefono.toString(),mf.getDatoDeContacto());
	}
	@Test
	public void crearUnaPersonaConDosNombresYUnApellidoYConDatoDeContacto(){
		DatoDeContacto correoElectronico = new CorreoElectronico("ji_ramirez@gmail.com","Personal");
		Persona mf = new Persona("Juan","Ignacio" ,"Ramirez",correoElectronico);
		
		Assert.assertEquals(correoElectronico.toString(),mf.getDatoDeContacto());
	}
	@Test
	public void crearUnaPersonaConUnNombreYUnDatoDeContactoDomicilio(){
		DatoDeContacto domicilio = new Domicilio("San Martin",5542,"5to","B","Caseros","Tres de febrero","Buenos Aires","Argentina");
		Persona mf = new Persona ("Maria","Kramer",domicilio);
		
		Assert.assertEquals(domicilio.toString(),mf.getDatoDeContacto());
	}
	@Test
	public void crearUnaPersonaConDosNombresYUnDatoDeContactoDomicilio(){
		DatoDeContacto domicilio = new Domicilio("Suiza",3254,"Caseros","Buenos Aires","Argentina");
		Persona mf = new Persona ("Samanta","Larsson",domicilio);
		
		Assert.assertEquals(domicilio.toString(),mf.getDatoDeContacto());
	}
	@Test
	public void agregarleLaFechaDeCumpleañosAUnContacto(){
		
		Persona mf = new Persona("Juan","Ramirez");
		
		mf.setFechaDeCumpleanos(15-05-1991);
		Assert.assertEquals(15-05-1991,mf.getFechaDeCumpleanos());
		
	}
	@Test
	public void agregarleEmpresaEnDondeTrabajaUnaPersona(){
		Persona mf = new Persona("Juan","Ramirez");
		
		mf.setEmpresaDondeTrabaja("Samsung");
		Assert.assertEquals("Samsung",mf.getEmpresaDondeTrabaja());
	}
	@Test
	public void cambiarleElNombreALaPersona(){
		Persona mf = new Persona("Juan","Ramirez");
		
		mf.cambiarNombre("Pablo");
		Assert.assertEquals("Pablo",mf.getNombre());
	}
	@Test
	public void cambiarleLosDosNombresALaPersona(){
		Persona mf = new Persona("Juan","Ignacio" ,"Ramirez");
		
		mf.cambiarNombreySegundoNombre("Martina","Belen" );
		Assert.assertEquals("Martina Belen Ramirez",mf.toString());
	}
	
	@Test
	public void cambiarleElApellidoALaPersona(){
		Persona mf = new Persona("Marta", "Gonzalez");
		
		mf.cambiarApellido("Ginger");
		Assert.assertEquals("Marta  Ginger",mf.toString());
	}
	@Test
	public void editarDatoDeContactoDeTipoTelefono(){
		
		DatoDeContacto telefono = new Telefono("01124252336", " celular");
		Persona mf = new Persona("Juan","Ramirez", telefono );
		
		mf.editarDato("42546895", "Casa");
		Assert.assertEquals("42546895 Casa",mf.getDatoDeContacto());
	}
	@Test
	public void editarDatoDeContactoDeTipoCorreo(){
		DatoDeContacto correoElectronico = new CorreoElectronico("ji_ramirez@gmail.com","Personal");
		Persona mf = new Persona("Juan","Ignacio" ,"Ramirez",correoElectronico);
		
		mf.editarDato("pasteleria.jr@gmail.com", "Trabajo");
		Assert.assertEquals("pasteleria.jr@gmail.com Trabajo",mf.getDatoDeContacto());
	}
	@Test
	public void editarDatoDeContactoDeTipoDomicilio(){
		DatoDeContacto domicilio = new Domicilio("Suiza",3254,"Caseros","Buenos Aires","Argentina");
		Persona mf = new Persona ("Samanta","Larsson",domicilio);
		
		mf.editarDato("Av Francisco Beiro", 1254,"Villa Devoto","Buenos Aires","Argentina");
		
		Assert.assertEquals(domicilio.toString(),mf.getDatoDeContacto());
		
	}
	@Test
	public void editarDatoDeContactoDeTipoDomicilio2(){
		DatoDeContacto domicilio = new Domicilio("San Martin",5542,"5to","B","Caseros","Tres de febrero","Buenos Aires","Argentina");
		Persona mf = new Persona ("Maria","Kramer",domicilio);
		
		mf.editarDato("Av Maipu",3212,"2to","A","Vicente Lopez","Vicente Lopez","Buenos Aires","Argentina");
		
		Assert.assertEquals(domicilio.toString(),mf.getDatoDeContacto());
	}
}
