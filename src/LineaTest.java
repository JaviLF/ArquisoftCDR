
import org.junit.Test;

import junit.framework.Assert;

public class LineaTest {
	@Test
	public void testForLinea() {
		Linea lineaDeHenry=new LineaPrepago("1111","Henry");
		Assert.assertEquals("1111",lineaDeHenry.getNumero());
		Assert.assertEquals("prepago",lineaDeHenry.getPlan());
		Assert.assertEquals("Henry",lineaDeHenry.getNombreUsuario());
	}
	@Test
	public void testForLineaPrepago() {
		LineaPrepago lineaDeHenry=new LineaPrepago("1111","Henry");
		Assert.assertEquals("1111",lineaDeHenry.getNumero());
		Assert.assertEquals("prepago",lineaDeHenry.getPlan());
		Assert.assertEquals("Henry",lineaDeHenry.getNombreUsuario());
		Assert.assertEquals(1.45,lineaDeHenry.getTarifaHorarioNormal());
		Assert.assertEquals(0.95,lineaDeHenry.getTarifaHorarioReducido());
		Assert.assertEquals(0.70,lineaDeHenry.getTarifaHorarioSuperReducido());
	}
	@Test
	public void testForLineaPostpago() {
		LineaPostpago lineaDeHenry=new LineaPostpago("1111","Henry");
		Assert.assertEquals("1111",lineaDeHenry.getNumero());
		Assert.assertEquals("postpago",lineaDeHenry.getPlan());
		Assert.assertEquals("Henry",lineaDeHenry.getNombreUsuario());
		Assert.assertEquals(0.99,lineaDeHenry.getTarifa());
	}
	@Test
	public void testForLineaWow() {
		LineaWow lineaDeHenry=new LineaWow("1111","Henry");
		Assert.assertEquals("1111",lineaDeHenry.getNumero());
		Assert.assertEquals("wow",lineaDeHenry.getPlan());
		Assert.assertEquals("Henry",lineaDeHenry.getNombreUsuario());
		lineaDeHenry.agregarNumeroAmigo("222");
		Assert.assertEquals(0.99,lineaDeHenry.getTarifa("333"));
		Assert.assertEquals(0.0,lineaDeHenry.getTarifa("222"));
	}
	
}
