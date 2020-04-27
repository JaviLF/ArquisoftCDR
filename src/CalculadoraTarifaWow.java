
public class CalculadoraTarifaWow implements CalculadoraTarifa{

	Llamada llamada;
	LineaWow linea=new LineaWow();
	
	public CalculadoraTarifaWow(Llamada llamada1,LineaWow linea) {
		llamada=llamada1;
		this.linea=linea;
	}
	
	public double calcularTarifa(Llamada llamada) {
		double tarifa=llamada.getTiempoLlamada()*linea.getTarifa(llamada.getNumeroLlamado());
		return tarifa;
	}
}
