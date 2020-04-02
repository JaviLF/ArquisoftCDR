public class CalculadoraTarifaPrepago implements CalculadoraTarifa{

	public double calcular(Llamada llamada) {
		String str = String.valueOf(llamada.getTiempoLlamada());
		double tarifa = Double.parseDouble(str.substring(0, str.indexOf('.')));
		float decNumbert = Float.parseFloat(str.substring(str.indexOf('.')));
		
		if(decNumbert>0.50) {
			tarifa=tarifa+0.5;
		}
		if (llamada.getHoraLlamada()>19) {
			tarifa=tarifa*2;
		}
		return tarifa;
	}
}
