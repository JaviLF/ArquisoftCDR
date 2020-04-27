import java.util.ArrayList;
import java.util.List;

public class LineaWow extends Linea{
	List<String> numerosAmigos = new ArrayList<String>();
	//public String[] numerosAmigos;
	private double tarifa;
	
	public LineaWow() {
		numero="0000";
		plan="wow";
		nombrePropietario="Pepe";
		tarifa=0.99;
	}
	public LineaWow(String numero, String nombrePropietario) {
		this.numero=numero;
		plan="wow";
		this.nombrePropietario=nombrePropietario;
		tarifa=0.99;
	}
	
	public void agregarNumeroAmigo(String numeroAux) {
		if(numerosAmigos.size()<4) {
			numerosAmigos.add(numeroAux);
		}
	}
	public boolean esNumeroAmigo(String numeroAux){
		boolean resp = false;
		if (numerosAmigos.contains(numeroAux))
			resp=true;
		return resp;
	}
	public double getTarifa(String numeroAux) {
		if (esNumeroAmigo(numeroAux))
			return 0.0;
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
}
