import java.io.File;

public class CrearArchivo {
	public static void main (String a[]){ 
		File archivo1 = new File ("Archivo1.txt");
		try {
			boolean crear = archivo1.createNewFile();
			if (crear) {
				System.out.println("Se creó el archivo.");
			}
			else {
				System.out.println("Ya existe un archivo con el mismo nombre.");
			}
		}
		catch (Exception e){
			System.out.println("Ocurrió un problema para grabar en el dispositivo.");
		}
	}
}
