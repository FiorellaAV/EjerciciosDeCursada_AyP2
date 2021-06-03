package Loom_3;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void pruebaCrearUnEmpleadoDeTipoPlantaTemporalTiempoCompleto(){
		Empleado p1 = new PlantaTemporaria("Juan","Perez",2,true);
		Assert.assertEquals("Juan Perez: empleado a tiempo completo, Planta Temporaria",p1.toString());
	}
	@Test
	public void pruebaCrearUnEmpleadoDeTipoGerente(){
		Empleado p1 = new Gerente("Juan","Perez",1,true,5);
		Assert.assertEquals("Juan Perez: Gerente, Planta Permanente",p1.toString());
	}
	@Test
	public void pruebaCrearUnEmpleadoDeTipoSinCategoriaEspecialTiempoCompleto(){
		Empleado p1 = new SinCategoriaEspecial("Juan","Perez",2, true, 2);
		Assert.assertEquals("Juan Perez: empleado a tiempo completo, Sin Categoria Especial, Planta Permanente",p1.toString());
	}
	@Test
	public void pruebaCrearUnEmpleadoDeTipoSinCategoriaEspecialTiempoParcial(){
		Empleado p1 = new SinCategoriaEspecial("Juan","Perez",20 ,1, false, 3);
		Assert.assertEquals("Juan Perez: empleado a tiempo parcial, Sin Categoria Especial, Planta Permanente",p1.toString());
	}
	@Test(expected = Error.class)
	public void pruebaCrearUnEmpleadoDeTipoPlantaTemporalNulo(){
		Empleado p1 = new PlantaTemporaria(null,null,2,true);
		Assert.assertEquals("null null: empleado a tiempo completo, Planta Temporaria",p1.toString());
	}
	@Test
	public void pruebaSalarioDeEmpleadoSinCategoriaDeTiempoCompleto(){
		Empleado p1 = new SinCategoriaEspecial("Juan","Perez",1, false, 3);
		p1.setNuevoValorDeUR(20);
		
		Assert.assertEquals(30000,p1.liquidarSalario());
	}
	@Test
	public void pruebaSalarioDeEmpleadoSinCategoriaDeTiempoParcial(){
		Empleado p1 = new SinCategoriaEspecial("Juan","Perez",20,2, true, 1);
		p1.setNuevoValorDeUR(20);
		
		Assert.assertEquals(22666,p1.liquidarSalario());
	}
	@Test
	public void pruebaSalarioDeEmpleadoDeTipoPlantaTemporalTiempoCompleto(){
		Empleado p1 = new PlantaTemporaria("Marta","Gomez",2,true);
		p1.setNuevoValorDeUR(30);
		
		Assert.assertEquals(45000,p1.liquidarSalario());
	}
	@Test
	public void pruebaSalarioDeEmpleadoDeTipoPlantaTemporalTiempoParcial(){
		Empleado p1 = new PlantaTemporaria("Marta","Gomez",25,3,false);
		p1.setNuevoValorDeUR(30);
		
		Assert.assertEquals(35500,p1.liquidarSalario());
	}
}
