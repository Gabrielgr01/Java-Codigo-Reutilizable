import java.io.FileReader;

public class LeerChar {
	public static void main (String a[]) {
		int caracter;
		try {
			FileReader in = new FileReader("Archivo1.txt");
			while ((caracter = in.read()) != -1) { // Mientras no sea el final del archivo
				System.out.println((char) caracter);
			}
		}
		catch (Exception e){
			System.out.println("No se encontró el archivo.");
		}
	}
}
