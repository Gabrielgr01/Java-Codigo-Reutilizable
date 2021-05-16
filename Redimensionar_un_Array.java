// Redimensiona (1 espacio) y agrega un nuevo elemento a un array.
// Ver la sección de 'CMV' para la implementación del visualizador

import java.util.Arrays;

int[] array1 = {};
int nuevoElemento = _valor_; // visualizador.ingreseInt("Ingrese el nuevo elemento del Array");
array1 = Arrays.copyOf(array1, array1.length + 1);
array1[array1.length - 1] = nuevoElemento;
