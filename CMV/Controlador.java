import java.util.Arrays;
/**
 * Controla lo que ocurre en el programa, la interfáz mostrada al usuario
 * 
 * @author Gabriel González
 * (version)
 */
public class Controlador
{
    private final String titulo = "Gestor de contactos";
    private final String[] opciones = {"*Agregar opciones","Ver Creadores","Salir."};
    private final String autores = "Creadores:\n Gabriel Gonzalez. Carne:C0343500";
    private final String[] opcionSiNo = {"Sí","No"};
    
    private Visualizador visualizador;
    private Modelo modelo;
    
    /**
     * constructor.
     * @see clase Visualizador
     * @see clase Modelo
     */
    public Controlador()
    {
        visualizador = new Visualizador(titulo);
        modelo = new Modelo();
    }
    
    
    public void iniciar()
    {
        int opcion;
        do {
            opcion = visualizador.listaOpciones(opciones,"Que desea realizar?");
            switch (opcion) {
                case 0: 
                
                    break;

                case 1: //Ver creadores del proyecto
                    visualizador.mostrarAutores(autores);
                    break;
            }
        }while(opcion == 0 || opcion == 1); //break cuando se selecciona salir
    }

    /**
     * @param parametros = los parametros para que funcione el programa
     * @see clase Controlador
     */
    public static void main(String[] parametros)
    {
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }
}
