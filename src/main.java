
public class main {

	public static void pruebasDeGuardaryCargarLlamadas() {
		
		FicherosBinarios ficherosBinarios = new FicherosBinarios();
		Llamada llamada1 = new Llamada();
		String numeroDeHenry="12345678";
		String numeroDeSergio="0000";
		llamada1.setNumeroLlamante(numeroDeHenry);
		llamada1.setNumeroLlamado(numeroDeSergio);
		
		ficherosBinarios.guardarLlamada(llamada1);
		ficherosBinarios.cargarLlamada();
	}
	
	
	
	public static void main(String[] args) {
		
			pruebasDeGuardaryCargarLlamadas();
			System.out.println("TERMINO");
			
	}

}
