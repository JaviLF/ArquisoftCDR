
public class LineaPrepago extends Linea{
	private double tarifaHorarioNormal;
	private double tarifaHorarioReducido;
	private double tarifaHorarioSuperReducido;
	
	public LineaPrepago() {
		numero="0000";
		plan="prepago";
		nombrePropietario="Pepe";
		tarifaHorarioNormal=1.45;
		tarifaHorarioReducido=0.95;
		tarifaHorarioSuperReducido=0.70;
	}
	public LineaPrepago(String numero1, String nombrePropietario1) {
		numero=numero1;
		plan="prepago";
		nombrePropietario=nombrePropietario1;
		tarifaHorarioNormal=1.45;
		tarifaHorarioReducido=0.95;
		tarifaHorarioSuperReducido=0.70;
	}
	
	public double getTarifaHorarioNormal() {
		return tarifaHorarioNormal;
	}
	public void setTarifaHorarioNormal(double tarifaHorarioNormal) {
		this.tarifaHorarioNormal = tarifaHorarioNormal;
	}
	public double getTarifaHorarioReducido() {
		return tarifaHorarioReducido;
	}
	public void setTarifaHorarioReducido(double tarifaHorarioReducido) {
		this.tarifaHorarioReducido = tarifaHorarioReducido;
	}
	public double getTarifaHorarioSuperReducido() {
		return tarifaHorarioSuperReducido;
	}
	public void setTarifaHorarioSuperReducido(double tarifaHorarioSuperReducido) {
		this.tarifaHorarioSuperReducido = tarifaHorarioSuperReducido;
	}
	//
}
