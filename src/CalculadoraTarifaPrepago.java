public class CalculadoraTarifaPrepago implements CalculadoraTarifa{
	
	Llamada llamada;
	LineaPrepago linea=new LineaPrepago();
	
	public CalculadoraTarifaPrepago(Llamada llamada1,LineaPrepago linea) {
		llamada=llamada1;
		this.linea=linea;
	}
	
	public double calcularTarifa(Llamada llamada) {
		double tarifa=llamada.getTiempoLlamada()*linea.getTarifaHorarioSuperReducido(); //asumimos que esta en horario super reducido
		if (llamada.getHoraLlamada()>7) { //verificamos si esta en horario normal
			tarifa=llamada.getTiempoLlamada()*linea.getTarifaHorarioNormal();
		}
		if (llamada.getHoraLlamada()>21) { //verificamos si esta en horario reducido
			tarifa=llamada.getTiempoLlamada()*linea.getTarifaHorarioReducido();
		}
		return tarifa;
	}
	
	
}
