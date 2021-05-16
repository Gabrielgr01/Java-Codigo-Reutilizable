import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 * Contiene los métodos relevantes para la interfáz gráfica / visualizador.
 * 
 * @author Gabriel González
 * (versión)
 */
public class Visualizador extends JOptionPane //hereda a JOptionPane
{
    private final String titulo;
    
    /**
     * constructor.
     * @param elTitulo= el título de la ventana a mostrar
     */
    public Visualizador(String elTitulo)
    {
        titulo = elTitulo;
    }
    
    //metodos para ingresar informacion
    /**
     * @param msg= mensaje que se despliega en cada ventana
     * @return devuelve un numero entero ingresado por el usuario
     */
    public int ingreseInt(String msg){ 
        // Lee valores enteros
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }
    
    /**
     * @param msg= mensaje que se despliega en cada ventana
     * @return devuelve una hilera de texto ingresada por el usuario
     */
    public String ingreseStr(String msg){
        // Lee hileras de texto
        return JOptionPane.showInputDialog(msg);
    }
        
    /**
     * @param lasOpciones = arreglo que contiene las opciones que el usuario puede elegir
     * @param elMensaje= mensaje con indicaciones para el usuario
     * @return devuelve el número de eleccion del usuario
     */
    public int listaOpciones(String[] lasOpciones, String elMensaje){
        int seleccion;
        seleccion = this.showOptionDialog(null, elMensaje, titulo, DEFAULT_OPTION, PLAIN_MESSAGE, null, lasOpciones, null);
        return seleccion; // retorna un numero dependiendo de la opción elegida, las opciones se enumeran a partir de 0
    }
    
    //metodos para desplegar informacion
    /**
     * @param msj = mensaje que despliega la ventana que ve el usuario
     */
    public void muestre(String msj){
        // Despliega un mensaje
        this.showMessageDialog(null,msj,titulo,PLAIN_MESSAGE);
    }
    
    /**
     * @param autores = parametro que contiene el nombre de los creadores del código
     * 
     */
    public void mostrarAutores(String autores)// método para mostrar los créditos del proyecto
    {
        this.showMessageDialog(null, autores, titulo, PLAIN_MESSAGE);
    }
}
