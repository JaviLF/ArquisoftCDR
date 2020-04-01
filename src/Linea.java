
public class Linea{
	private int numero;
	private String plan;
	private String nombrePropietario;
	
	

	public Linea() {
		
	}
	public Linea(int numero,String plan, String nombrePropietario) {
		this.numero=numero;
		this.plan=plan;
		this.nombrePropietario=nombrePropietario;	
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getNombreUsuario() {
		return nombrePropietario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombrePropietario = nombreUsuario;
	}
	
	public String getLinea() {
		return String.format("Numero:%s - Plan:%s - Nombre Propietario:%s", this.numero, this.plan,this.nombrePropietario); 
	}

	
	

}
