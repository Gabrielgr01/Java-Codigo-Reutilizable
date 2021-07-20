import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * File methods:
 * canRead() -> Tests wheather file is readable or not
 * canWrite() -> Tests wheather file is writable or not
 * createNewFile() -> Creates an empty file
 * delete() -> Deletes a file
 * exists() -> Tests wheather file exists or not
 * getName() -> Returns the name of the file
 * getAbsolutePath() -> Returns the absolute pathname of the file
 * Length() -> Returns the size of the file in bytes
 * List() -> Returns the array of the file in the directory
 * Mkdir() -> Creates a directory
 */
public class Archivo
{
    
    /**
     * Crea un archivo en al direccion especificada como parametro
     * @param filePath = directorio del archivo (incuido el nombre)
     */
    public void createFile (String filePath){
        try{
            File newFile = new File(filePath);
            if(newFile.createNewFile()){
                System.out.println("File created: "+newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    /**
     * Crea un archivo en al direccion especificada como parametro
     * @param filePath = directorio del archivo (incuido el nombre)
     */
    public void fileInformation(String filePath){
        File myFile = new File(filePath);
        if (myFile.exists()) {
            System.out.println("File name: "+myFile.getName());
            System.out.println("Absolute path: "+ myFile.getAbsolutePath());
            System.out.println("Writeable: "+myFile.canWrite());
            System.out.println("Readable: "+myFile.canRead());
            System.out.println("File size in bytes: "+myFile.length());
        } else {
            System.out.println("File does not exists");
        }
    }
    
    /**
     * Agrega o reescribe un mensaje en un archivo
     * @param msg = mensaje a escribir
     * @param filePath = directorio del archivo (incuido el nombre)
     * @param append = 'true' para agregar contenido al final del txt, 'false' para reescribir el contenido del txt
     */
    public void writeToFile(String msg, String filePath, boolean append){
        try{
            FileWriter myWriter = new FileWriter(filePath, append);
            myWriter.write(msg);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    /**
     * Lee el contenido del archivo especificado
     * @param filePath = directorio del archivo (incuido el nombre)
     */
    public String readFromFile(String filePath){
        String fileData = "";
        try{
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                fileData += data+"\n";
            }
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return fileData;
    }
    
    
    /**
     * Lee la linea especificada del archivo
     * @param index = indice de la linea a leer
     * @param filePath = directorio del archivo (incuido el nombre)
     */
    public String readLine(int index, String filePath){
        String lineData = "";
        try{
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile);
            for(int i = 0; i < index; i++){
                myReader.nextLine();
            }
            lineData = myReader.nextLine();
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return lineData;
    }
    
    /**
     * Elimina el archivo especificado
     * @param filePath = directorio del archivo (incuido el nombre)
     */
    public void deleteFile(String filePath){
        File myFile = new File(filePath);
        if (myFile.exists()) {
            myFile.delete();
            System.out.println("File successfully deleted.");
        } else {
            System.out.println("File does not exists");
        }
    }
    
    /**
      * Para probar los métodos: 
      **/
    // public static void main (String a[]){
        // String path = "ArchivoPrueba.txt";
        // Archivo archivo = new Archivo();
        
        // String fileData = "";
        // //archivo.deleteFile(path);
        
        // archivo.createFile(path);
        // archivo.fileInformation(path);
        // fileData = archivo.readFromFile(path);
        // System.out.println(fileData);
        
        // archivo.writeToFile("Hola mundo!", path, true);
        // archivo.writeToFile("\n", path, true);
        // archivo.fileInformation(path);
        // fileData = archivo.readFromFile(path);
        // System.out.println(fileData);
    // }
}
