import org.junit.Test;

import junit.framework.Assert;

public class LlamadaTest {
	@Test
	public void testForSetAndGetNumeros() {
		 Llamada llamada1 = new Llamada();
		 String numeroDeHenry="12345678";
		 String numeroDeSergio="0000";
		 llamada1.setNumeroLlamante(numeroDeHenry);
		 llamada1.setNumeroLlamado(numeroDeSergio);
		 Assert.assertEquals("12345678",llamada1.getNumeroLlamante());
		 Assert.assertEquals("0000",llamada1.getNumeroLlamado());
	}
	@Test
	public void testForSetAndGetHoraLlamada() {
		Llamada llamada1 = new Llamada();
		llamada1.setHoraLlamada(16);
		Assert.assertEquals(16,llamada1.getHoraLlamada());  
	}
	@Test
	public void testForSetAndGetTiempoLlamada() {
		Llamada llamada1 = new Llamada();
		llamada1.setTiempoLlamada(4.53);
		Assert.assertEquals(4.53,llamada1.getTiempoLlamada());  
	}
	@Test
	public void testForCalculateTarifa() {
		
		LineaPrepago lineaDeJavier=new LineaPrepago("1111","Javier Loayza");
		LineaPostpago lineaDeSergio=new LineaPostpago("0000","Sergio Rivera Mai");
		LineaWow lineaDeHenry=new LineaWow("2222","Henry Torrico");
		Llamada llamada1 = new Llamada();
		llamada1.setHoraLlamada(22);
		llamada1.setTiempoLlamada(2.54);
		llamada1.setNumeroLlamado(lineaDeSergio.getNumero());
		llamada1.setNumeroLlamante(lineaDeJavier.getNumero());
		CalculadoraTarifa calculadora=new CalculadoraTarifaPrepago(llamada1,lineaDeJavier);
		Assert.assertEquals(2.413,llamada1.calcularTarifa(calculadora));
		llamada1.setNumeroLlamante(lineaDeSergio.getNumero());
		llamada1.setNumeroLlamado(lineaDeHenry.getNumero());
		calculadora=new CalculadoraTarifaPostpago(llamada1,lineaDeSergio);
		Assert.assertEquals(2.5146,llamada1.calcularTarifa(calculadora));
		llamada1.setNumeroLlamante(lineaDeHenry.getNumero());
		llamada1.setNumeroLlamado(lineaDeSergio.getNumero());
		lineaDeHenry.agregarNumeroAmigo(lineaDeSergio.getNumero());
		calculadora=new CalculadoraTarifaWow(llamada1,lineaDeHenry);
		Assert.assertEquals(0.0,llamada1.calcularTarifa(calculadora));
		llamada1.setNumeroLlamado(lineaDeJavier.getNumero());
		Assert.assertEquals(2.5146,llamada1.calcularTarifa(calculadora));
	}
}
