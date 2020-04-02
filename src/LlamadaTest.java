import org.junit.Test;

import junit.framework.Assert;

public class LlamadaTest {
	@Test
	public void testForSetAndGetLineas() {
		 Llamada llamada1 = new Llamada();
		 Linea lineaDeHenry=new Linea("12345678","wow","Henry Torrico Jimpol");
		 Linea lineaDeSergio=new Linea("0000","postpago","Sergio Rivera Mai");
		 llamada1.setLineaEntrante(lineaDeHenry);
		 llamada1.setLineaSaliente(lineaDeSergio);
		 Assert.assertEquals("Numero:12345678 - Plan:wow - Nombre Propietario:Henry Torrico Jimpol",llamada1.getLineaEntrante().getLinea());
		 Assert.assertEquals("Numero:0000 - Plan:postpago - Nombre Propietario:Sergio Rivera Mai",llamada1.getLineaSaliente().getLinea());
	}
	@Test
	public void testForSetAndGetHoraLlamada() {
		Llamada llamada1 = new Llamada();
		llamada1.setHoraLlamada(16);
		Assert.assertEquals(16,llamada1.getHoraLlamada());  
	}
	@Test
	public void testForAetAndGetTiempoLlamada() {
		Llamada llamada1 = new Llamada();
		llamada1.setTiempoLlamada(4.53);
		Assert.assertEquals(4.53,llamada1.getTiempoLlamada());  
	}
	@Test
	public void testForCalculateTarifa() {
		Llamada llamada1 = new Llamada();
		llamada1.setHoraLlamada(12);
		llamada1.setTiempoLlamada(1.54);
		Linea lineaDeSergio=new Linea("0000","postpago","Sergio Rivera Mai");
		llamada1.setLineaSaliente(lineaDeSergio);
		Assert.assertEquals(1.50,llamada1.calcularTarifa());
		lineaDeSergio.setPlan("wow");
		Assert.assertEquals(0.75,llamada1.calcularTarifa());
		lineaDeSergio.setPlan("prepago");
		llamada1.setHoraLlamada(20);
		Assert.assertEquals(3.0,llamada1.calcularTarifa());
	}
}
