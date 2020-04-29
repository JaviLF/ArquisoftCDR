import java.io.Serializable;

public class LineaPostpago extends Linea implements Serializable{
	private double tarifa;
	
	public LineaPostpago() {
		numero="0000";
		plan="postpago";
		nombrePropietario="Pepe";
		tarifa=0.99;
	}
	public LineaPostpago(String numero, String nombrePropietario) {
		this.numero=numero;
		plan="postpago";
		this.nombrePropietario=nombrePropietario;
		tarifa=0.99;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
}
