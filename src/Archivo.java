import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivo {
	
	public void guardarLlamada(Llamada llamada) {
		try {
			File f = new File("llamadas.txt");
			FileWriter fw;
			BufferedWriter bw;
			if(f.exists()){
				fw = new FileWriter(f,true);
				bw = new BufferedWriter(fw);
				bw.newLine();
				bw.write(llamada.getNumeroLlamante() + "%" + llamada.getNumeroLlamado() + "%" + llamada.getHoraLlamada() + "%" + llamada.getTiempoLlamada());
			}else {
				fw = new FileWriter(f);
				bw = new BufferedWriter(fw);
				bw.write(llamada.getNumeroLlamante() + "%" + llamada.getNumeroLlamado() + "%" + llamada.getHoraLlamada() + "%" + llamada.getTiempoLlamada());
			}
			bw.close();
			fw.close(); 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void imprimirLlamadas() {
		try {
			File f = new File("llamadas.txt");
			if(f.exists()) {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				String linea;
				while((linea = br.readLine()) != null) {
					String [] contacto = linea.split("%");
					Llamada p = new Llamada();
					p.setNumeroLlamante(contacto[0]);
					p.setNumeroLlamado(contacto[1]);
					p.setHoraLlamada(Integer.parseInt(contacto[2]));
					p.setTiempoLlamada(Double.parseDouble(contacto[3]));
					System.out.println(p.getNumeroLlamante());
					System.out.println(p.getNumeroLlamado());
					System.out.println(p.getHoraLlamada());
					System.out.println(p.getTiempoLlamada());
					System.out.println("******************");
				}
				br.close();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}