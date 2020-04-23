
public class CalculadoraTarifaPostpago implements CalculadoraTarifa{

	Llamada llamada;
	LineaPostpago linea=new LineaPostpago();
	
	public CalculadoraTarifaPostpago(Llamada llamada1,LineaPostpago linea) {
		llamada=llamada1;
		this.linea=linea;
	}
	
	public double calcularTarifa(Llamada llamada) {
		double tarifa=llamada.getTiempoLlamada()*linea.getTarifa();
		return tarifa;
	}
}
