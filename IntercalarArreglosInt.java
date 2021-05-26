// .................... LIBRERIAS ....................
    import javax.swing.JOptionPane;

// .................... VARIABLES GLOBALES ....................
    private static int[] arreglo1;
    private static int[] arreglo2;
    private static int[] arreglo3;
    
// .................... FUNCIONES ....................
    public static int[] instancieArreglo (int[] arreglo) {
        int tamañoAleatorio;
        int valorAleatorio;
        
        // numero aleatorio entre 5 y 20
        int maxTam = 20;
        int minTam = 5;
        int rangoTam = maxTam - minTam + 1;
        tamañoAleatorio = (int)(Math.random() * rangoTam) + minTam;
        
        arreglo = new int[tamañoAleatorio];
        for (int i = 0; i < tamañoAleatorio; i++) {
            // numero aleatorio entre 1 y 99
            int maxVal = 20;
            int minVal = 5;
            int rangoVal = maxVal - minVal + 1;
            valorAleatorio = (int)(Math.random() * rangoVal) + minVal;
            
            arreglo[i] = valorAleatorio;
        }
        return arreglo;
    }
    
    public static int[] ordeneAscendente (int[] arregloDesordenado){
        int recorrer = arregloDesordenado.length;
        while (recorrer > 1){
            for (int i = 0; i < recorrer-1; i++){
                if (arregloDesordenado[i] > arregloDesordenado[i+1]){
                    int temporal = arregloDesordenado[i+1];
                    arregloDesordenado[i+1] = arregloDesordenado[i];
                    arregloDesordenado[i] = temporal;
                }
            }
            recorrer -= 1;
        }
        
        return arregloDesordenado; // ahora está ordenado
    }
    
    public static int[] redimencioneArregloInt (int[] arregloOriginal, int elementoAgregar){
      int[] arregloNuevo = new int[arregloOriginal.length + 1]; // se crea el arreglo nuevo con un espacio más que el original
      for (int i = 0; i < arregloOriginal.length; i++){ //copia los elementos del arreglo original en el arreglo nuevo
        arregloNuevo[i] = arregloOriginal[i];
      }
      arregloNuevo[arregloNuevo.length-1] = elementoAgregar; // se agrega el elemento deseado al final del arreglo
      return arregloNuevo;
    }
    
    public static int[] intercaleArreglos (int[] arreglo1, int[] arreglo2){
        int [] arregloIntercalado = {};
        
        int i = 0;
        int j = 0;
        while (i < arreglo1.length || j < arreglo2.length){
            if (i < arreglo1.length && j < arreglo2.length){
                if (arreglo1[i] == arreglo2[j]) {
                    arregloIntercalado = redimencioneArregloInt (arregloIntercalado, arreglo1[i]);
                    arregloIntercalado = redimencioneArregloInt (arregloIntercalado, arreglo2[i]);
                    i++;
                    j++;
                } else if (arreglo1[i] < arreglo2[j]){
                    arregloIntercalado = redimencioneArregloInt (arregloIntercalado, arreglo1[i]);
                    i++;
                } else {
                    arregloIntercalado = redimencioneArregloInt (arregloIntercalado, arreglo2[j]);
                    j++;
                }
            } else if (i < arreglo1.length && j == arreglo2.length-1) {
                arregloIntercalado = redimencioneArregloInt (arregloIntercalado, arreglo1[i]);
                i++;
            } else if (i == arreglo1.length && j < arreglo2.length) {
                arregloIntercalado = redimencioneArregloInt (arregloIntercalado, arreglo2[j]);
                j++;
            }
        }
        
        return arregloIntercalado;
    }
    
// .................... MAIN ....................
    public static void main (String a[]) {
        arreglo1 = instancieArreglo(arreglo1);
        arreglo2 = instancieArreglo(arreglo2);
        
        arreglo1 = ordeneAscendente(arreglo1);
        arreglo2 = ordeneAscendente(arreglo2);
        
        arreglo3 = intercaleArreglos(arreglo1, arreglo2);
        
        String mensaje = "";
        mensaje += "Arreglo1: ";
        for (int i = 0; i < arreglo1.length - 1;i++){
            mensaje += Integer.toString(arreglo1[i])+", ";
        }
        mensaje += Integer.toString(arreglo1[arreglo1.length - 1]);
        
        mensaje += "\nArreglo2: ";
        for (int i = 0; i < arreglo2.length - 1;i++){
            mensaje += Integer.toString(arreglo2[i])+", ";
        }
        mensaje += Integer.toString(arreglo2[arreglo2.length - 1]);
        
        mensaje += "\nArreglo3: ";
        for (int i = 0; i < arreglo3.length - 1;i++){
            mensaje += Integer.toString(arreglo3[i])+", ";
        }
        mensaje += Integer.toString(arreglo3[arreglo3.length - 1]);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
