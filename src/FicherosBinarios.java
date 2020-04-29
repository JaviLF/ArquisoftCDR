import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FicherosBinarios {
	
	public void guardarLlamada(Llamada llamada) {
		File file;
		FileOutputStream fileOutputStream;
		ObjectOutputStream objectOutputStream;
		
		file = new File("FicherosBinarios.bin");
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(llamada);			
		} catch (FileNotFoundException ex) {
			System.out.println("Save error");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void cargarLlamada() {
		File file;
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream;
		
		file = new File("FicherosBinarios.bin");
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			boolean end = false;
			while(!end) {
				Object data = objectInputStream.readObject();
				Llamada linea =  (Llamada)data;
				System.out.println("Numero: " + linea.getNumeroLlamante());
				System.out.println("Usuario: " + linea.getNumeroLlamado());
				
				end = true;
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println("no file exception error");
		} catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	
}