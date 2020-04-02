
public class Llamada {
	
	public Linea lineaSaliente=new Linea();
	public Linea lineaEntrante=new Linea();
	
	public int horaLlamada = 0;
	public double tiempoLlamada= 0;
	
	public double calcularTarifa() {
		double tarifa=0;
		if(lineaSaliente.getPlan()=="prepago") {
			CalculadoraTarifa calc=new CalculadoraTarifaPrepago();
			tarifa= calc.calcular(this);
		}
		if(lineaSaliente.getPlan()=="postpago") { //falta implementar aun
			CalculadoraTarifa calc=new CalculadoraTarifaPostpago();
			tarifa= calc.calcular(this);
		}
		if(lineaSaliente.getPlan()=="wow") { //falta implementar aun
			CalculadoraTarifa calc=new CalculadoraTarifaWow();
			tarifa= calc.calcular(this);
		}
		return tarifa;
	}
	public void setHoraLlamada(int horaLlamada) {
		this.horaLlamada=horaLlamada;
	}
	public int getHoraLlamada() {
		return horaLlamada;
	}
	public void setTiempoLlamada(double tiempoLlamada) {
		this.tiempoLlamada=tiempoLlamada;
	}
	public double getTiempoLlamada() {
		return tiempoLlamada;
	}
	public void setLineaSaliente(Linea lineaSaliente) {
		this.lineaSaliente=lineaSaliente;
	}
	public Linea getLineaSaliente() {
		return lineaSaliente;
	}
	public Linea getLineaEntrante() {
		return lineaEntrante;
	}
	public void setLineaEntrante(Linea lineaEntrante) {
		this.lineaEntrante=lineaEntrante;
	}
}
