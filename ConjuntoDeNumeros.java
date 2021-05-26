// .................... LIBRERIAS ....................
    import javax.swing.JOptionPane;

// .................... FUNCIONES ....................
    public static int[] redimencioneArregloInt (int[] arregloOriginal, int elementoAgregar){
      int[] arregloNuevo = new int[arregloOriginal.length + 1]; // se crea el arreglo nuevo con un espacio más que el original
      for (int i = 0; i < arregloOriginal.length; i++){ //copia los elementos del arreglo original en el arreglo nuevo
        arregloNuevo[i] = arregloOriginal[i];
      }
      arregloNuevo[arregloNuevo.length-1] = elementoAgregar; // se agrega el elemento deseado al final del arreglo
      return arregloNuevo;
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
    
    public static float calculePromedio (int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma +=  numeros[i];
        }
        float promedio = (float) suma/numeros.length;
        
        return promedio;
    }
    
    public static float calculeMediana (int[] numeros){
        float mediana = 0;
        if (numeros.length%2 != 0) { // cuando es impar
            int posMediana = (numeros.length / 2);
            mediana = numeros[posMediana];
        } else { // cuando es par
            int posMediana1 = (numeros.length / 2) - 1;
            int posMediana2 = posMediana1 + 1;
            float promedio = (float) (numeros[posMediana1] + numeros[posMediana2])/2;
            mediana = promedio;
        }
        
        return mediana;
    }
    
    
    public static float calculeDesvEst (int[] numeros){
        float desvEst;
        float sumaRestaCuadrado = 0;
        float promedio = calculePromedio(numeros);
        
        for (int i = 0; i < numeros.length; i++){
            sumaRestaCuadrado = (float) Math.pow(numeros[i] - promedio, 2);
        }
        desvEst = (float) Math.sqrt(sumaRestaCuadrado/numeros.length);
        
        return desvEst;
    }
    
// .................... MAIN ....................
    public static void main (String a[]) {
        int[] numerosIngresados = {};
        int[] numerosOrdenados = {};
        float promedio;
        float mediana;
        float desvEst;
        
        // Lee los numeros ingresados por el usuario
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números va a ingresar?"));
        int numero = 0;
        for (int i = 0; i < n; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));
            numerosIngresados = redimencioneArregloInt(numerosIngresados, numero);
        }
        
        // Ordena los números
        numerosOrdenados = ordeneAscendente (numerosIngresados);
        
        // Agrega los numeros ordenados al mensaje a desplegar
        String mensaje = "Numeros en orden ascendente: ";
        for (int i = 0; i < numerosOrdenados.length-1; i++){
            mensaje += numerosOrdenados[i]+", ";
        }
        mensaje += numerosOrdenados[numerosOrdenados.length-1];
        
        // Promedio
        promedio =  calculePromedio(numerosOrdenados);
        mensaje += "\nPromedio: "+promedio;
        
        // Mediana
        mediana = calculeMediana(numerosOrdenados);
        mensaje += "\nMediana: "+mediana;
        
        // Menor
        mensaje += "\nMenor: "+numerosOrdenados[0];
        
        // Mayor
        mensaje += "\nMayor: "+numerosOrdenados[numerosOrdenados.length - 1];
        
        // Desviación estándar
        desvEst = calculeDesvEst(numerosOrdenados);
        mensaje += "\nDesviación estándar: "+desvEst;
        
        // Despliega el mensaje
        JOptionPane.showMessageDialog(null, mensaje);
    }
