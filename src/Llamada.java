import java.io.Serializable;

public class Llamada implements Serializable{
	
	private String numeroLlamante;
	private String numeroLlamado;

	private int horaLlamada = 0;
	private double tiempoLlamada= 0;
	private double tarifa=0;
	
	public double calcularTarifa(CalculadoraTarifa calculadora) {
		tarifa=calculadora.calcularTarifa(this);
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
	public void setNumeroLlamante(String numeroLlamante) {
		this.numeroLlamante=numeroLlamante;
	}
	public String getNumeroLlamante() {
		return numeroLlamante;
	}
	public void setNumeroLlamado(String numeroLlamado) {
		this.numeroLlamado=numeroLlamado;
	}
	public String getNumeroLlamado() {
		return numeroLlamado;
	}
	
}
