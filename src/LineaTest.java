

import org.junit.Test;

import junit.framework.Assert;

public class LineaTest {

	@Test
	public void testForCreateLinea() {
		Linea lineaDeHenry=new Linea(12345678,"Wow","Henry Torrico Jimpol");
		Assert.assertEquals("Numero:12345678 - Plan:Wow - Nombre Propietario:Henry Torrico Jimpol",lineaDeHenry.getLinea()); 
	}
}
