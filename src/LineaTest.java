
import org.junit.Test;

import junit.framework.Assert;

public class LineaTest {
	@Test
	public void testForCreateLinea0() {
		Linea lineaDeHenry=new Linea();
		Assert.assertEquals("Numero:0000 - Plan:prepago - Nombre Propietario:Pepe",lineaDeHenry.getLinea()); 
	}
	@Test
	public void testForCreateLinea() {
		Linea lineaDeHenry=new Linea("12345678","wow","Henry Torrico Jimpol");
		Assert.assertEquals("Numero:12345678 - Plan:wow - Nombre Propietario:Henry Torrico Jimpol",lineaDeHenry.getLinea()); 
	}
	@Test
	public void testForGetAndSetNumero() {
		Linea linea1=new Linea("12345678","wow","Henry Torrico Jimpol");
		linea1.setNumero("222");
		Assert.assertEquals("222",linea1.getNumero()); 
	}
	@Test
	public void testForGetAndSetPlan() {
		Linea linea1=new Linea("12345678","wow","Henry Torrico Jimpol");
		linea1.setPlan("post-pago");
		Assert.assertEquals("post-pago",linea1.getPlan()); 
	}
	@Test
	public void testForGetAndSetUsuario() {
		Linea linea1=new Linea("12345678","wow","Henry Torrico Jimpol");
		linea1.setNombreUsuario("Sergio");
		Assert.assertEquals("Sergio",linea1.getNombreUsuario()); 
	}
}
