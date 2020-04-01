
public class PlanWow extends CalculadoraTarifa{

	public PlanWow(Llamada llamada) {
		super(llamada);
	}

	@Override
	public double calcularTarifa() {
		return tiempoLlamada*0.2;
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
