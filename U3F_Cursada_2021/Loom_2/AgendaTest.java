package Loom_2;

import org.junit.Assert;
import org.junit.Test;

public class AgendaTest {

	@Test
	public void crearUnaAgendaVaciaPrueba(){
		
	Agenda agenda = new Agenda();
	
	Assert.assertEquals(true,agenda.isEmpty());
	}
	
	@Test
	public void crearUnaAgendaYUnContacto(){
		Agenda agenda = new Agenda();
		agenda.crearUnContacto("Samuel", "Scott");
		
		Assert.assertEquals("Samuel  Scott",agenda.mostrarDatosDeContacto(0));
	}
	@Test
	public void crearUnaAgendaYUnContactoCon2Nombres(){
		Agenda agenda = new Agenda();
		agenda.crearUnContacto("Eduardo","Daniel" ,"Suarez");
		

		Assert.assertEquals("Eduardo Daniel Suarez",agenda.mostrarDatosDeContacto(0));
	}
	@Test
	public void crearUnaAgendaConTresContactos(){
		Agenda agenda = new Agenda();
		agenda.crearUnContacto("Dave", "Williams");
		agenda.crearUnContacto("Maria","Laura","Rodriguez");
		agenda.crearUnContacto("Tomas","Ezequiel","Gomez");
		
		Assert.assertEquals("Tomas Ezequiel Gomez",agenda.mostrarDatosDeContacto(2));
	}
	@Test
	public void borrarUnContactoDeLaAgenda(){
		Agenda agenda = new Agenda();
		agenda.crearUnContacto("Tomas", "Martinez");
		agenda.crearUnContacto("Santiago", "Rojas");
		agenda.crearUnContacto("Juan","Carlos","Diaz");
		
		agenda.removerContacto(1);
		
		Assert.assertEquals("Juan Carlos Diaz" ,agenda.mostrarDatosDeContacto(1));
		
	}
	@Test
	public void borrarTodosLosContactosDeLaAgenda(){
		Agenda agenda = new Agenda();
		agenda.crearUnContacto("Tomas", "Martinez");
		agenda.crearUnContacto("Santiago", "Rojas");
		agenda.crearUnContacto("Juan","Carlos","Diaz");
		
		agenda.removerContacto(0);
		agenda.removerContacto(0);
		agenda.removerContacto(0);
		
		Assert.assertEquals(true, agenda.isEmpty());
		
	}
	@Test
	public void modificarUnContactoEnLaAgenda(){
		Agenda agenda = new Agenda();
		
		agenda.crearUnContacto("Dave", "Williams");
		agenda.crearUnContacto("Maria","Laura","Rodriguez");
		agenda.crearUnContacto("Tomas","Ezequiel","Gomez");
		
		agenda.editarContacto(0,"Santiago","Krimi");
		
		Assert.assertEquals("Santiago  Krimi", agenda.mostrarDatosDeContacto(0));
	}
	
	
}
