import java.util.ArrayList;
import java.util.List;

public class main {

	public static void pruebaDeGuardadVariasLlamadas() {
		Archivo archivo = new Archivo();
		Llamada llamada1 = new Llamada();
		String numeroDeHenry="00000";
		String numeroDeSergio="777777";
		llamada1.setNumeroLlamante(numeroDeHenry);
		llamada1.setNumeroLlamado(numeroDeSergio);
		Llamada llamada2 = new Llamada();
		numeroDeHenry="33333333";
		numeroDeSergio="4444444";
		llamada2.setNumeroLlamante(numeroDeHenry);
		llamada2.setNumeroLlamado(numeroDeSergio);
		Llamada llamada3 = new Llamada();
		numeroDeHenry="555555";
		numeroDeSergio="666666";
		llamada3.setNumeroLlamante(numeroDeHenry);
		llamada3.setNumeroLlamado(numeroDeSergio);
		
		List<Llamada> llamadas = new ArrayList<Llamada>();
		llamadas.add(llamada1);
		llamadas.add(llamada1);
		llamadas.add(llamada1);
		
		archivo.guardarLlamada(llamada1);
		archivo.guardarLlamada(llamada2);
		archivo.guardarLlamada(llamada3);
		
		
	}
	
	public static void guardarUnaLlamada() {
		
		Archivo archivo = new Archivo();
		Llamada llamada1 = new Llamada();
		String numeroDeHenry="1111111";
		String numeroDeSergio="2222222";
		llamada1.setNumeroLlamante(numeroDeHenry);
		llamada1.setNumeroLlamado(numeroDeSergio);
		
		archivo.guardarLlamada(llamada1);
		
	}
	
	public static void pruebaDeCargarLlamadas() {
		Archivo archivo = new Archivo();
		archivo.imprimirLlamadas();
	}
	
	
	
	public static void main(String[] args) {
		
			pruebaDeGuardadVariasLlamadas();
			pruebaDeCargarLlamadas();
			System.out.println("TERMINO");
			
	}

}
