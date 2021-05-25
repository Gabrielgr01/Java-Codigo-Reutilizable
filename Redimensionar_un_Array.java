// Redimensiona (+1 espacio) y agrega un nuevo elemento a un array.
// Ver la sección de 'CMV' para la implementación del visualizador

// ........................................................................................................................
// Utilizando la libreria "Arrays":
import java.util.Arrays;

int[] array1 = {};
int nuevoElemento = _valor_; // visualizador.ingreseInt("Ingrese el nuevo elemento del Array");
array1 = Arrays.copyOf(array1, array1.length + 1);
array1[array1.length - 1] = nuevoElemento;

// ........................................................................................................................
// Otra forma sin importar la librería Arrays:
// para int[]:
public int[] redimencioneArreglo (int[] arregloOriginal, int elementoAgregar){
  int[] arregloNuevo = new int[arregloOriginal.length + 1]; // se crea el arreglo nuevo con un espacio más que el original
  for (int i = 0; i < arregloOriginal.length; i++){ //copia los elementos del arreglo original en el arreglo nuevo
    arregloNuevo[i] = arregloOriginal[i];
  }
  arregloNuevo[arregloNuevo.length-1] = elementoAgregar; // se agrega el elemento deseado al final del arreglo
  return arregloNuevo;
}

// para char[]:
public char[] redimencioneArregloChar (char[] arregloOriginal, char elementoAgregar){
  char[] arregloNuevo = new char[arregloOriginal.length + 1]; // se crea el arreglo nuevo con un espacio más que el original
  for (int i = 0; i < arregloOriginal.length; i++){ //copia los elementos del arreglo original en el arreglo nuevo
    arregloNuevo[i] = arregloOriginal[i];
  }
  arregloNuevo[arregloNuevo.length-1] = elementoAgregar; // se agrega el elemento deseado al final del arreglo
  return arregloNuevo;
}

// Nota: es lo mismo para un arreglo de cualquier tipo, nada más cambiar el tipo de los arreglos usado en código.
