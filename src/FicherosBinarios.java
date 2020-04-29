import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FicherosBinarios {
	
	public void guardarLinea() {
		File file;
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		
		file = new File("FicherosBinarios.bin");
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			Linea linea = new LineaPostpago();
			linea.setNumero("11111");
			linea.setNombreUsuario("Pepe");
			linea.setPlan("WOW");
			
			objectOutputStream.writeObject(linea);
			
			
		} catch (FileNotFoundException ex) {
			System.out.println("Save error");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void cargarLinea() {
		File file;
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		
		file = new File("FicherosBinarios.bin");
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			while(true) {
				Object data = objectInputStream.readObject();
				Linea linea = (Linea)data;
				System.out.println("Numero: " + linea.getNumero());
				System.out.println("Usuario: " + linea.getNombreUsuario());
				System.out.println("Plan: " + linea.getPlan());
				
			}
			
		} catch (FileNotFoundException ex) {
			
		} catch (IOException | ClassNotFoundException ex) {
			
		}
	}
	
	
}