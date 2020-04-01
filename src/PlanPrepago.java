import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PlanPrepago extends CalculadoraTarifa{

	public PlanPrepago(Llamada llamada) {
		super(llamada);
	}

	@Override
	public double calcularTarifa() {
		if(getHoraLlamada()>2200&&getHoraLlamada()<0500) {
			return tiempoLlamada*0.5;
		}
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
