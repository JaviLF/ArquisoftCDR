
public abstract class CalculadoraTarifa implements Llamada{
	
	private Llamada llamada;
	
	
	public CalculadoraTarifa(Llamada llamada) {
		setLlamada(llamada);
	}
	
	public Llamada getLlamada() {
		return llamada;
	}
	
	public void setLlamada(Llamada llamada) {
		this.llamada=llamada;
	}
	

}
