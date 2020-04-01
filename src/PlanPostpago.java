
public class PlanPostpago extends CalculadoraTarifa{

	public PlanPostpago(Llamada llamada) {
		super(llamada);
	}

	@Override
	public double calcularTarifa() {
		return tiempoLlamada;
	}


	@Override
	public int getHoraLlamada() {
		return horaLlamada;
	}

	@Override
	public int getTiempoLlamada() {
		return tiempoLlamada;
	}

}
