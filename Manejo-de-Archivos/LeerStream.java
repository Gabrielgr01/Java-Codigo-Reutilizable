import java.util.Scanner;
import java.io.FileInputStream;

public class LeerStream {
    public static void main (String a[]){
        try{
            int stream;
            FileInputStream fi=new FileInputStream("datos.txt");
            while ((stream = fi.read()) != -1){
                System.out.print((char) stream);
            }
        }
        catch(Exception e){
					System.out.print("Hubo un error leyendo el stream.");
				}
    }
}
