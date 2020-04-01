
public interface Llamada {
	
	public Linea lineaSaliente=new Linea();
	public Linea lineaEntrante=new Linea();
	
	public int horaLlamada = 0;
	public int tiempoLlamada= 0;
	
	public double calcularTarifa();
	
	
	
	public int getHoraLlamada();
	public int getTiempoLlamada();
}
