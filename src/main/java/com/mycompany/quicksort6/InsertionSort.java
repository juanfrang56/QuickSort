
package com.mycompany.quicksort6;

/**
 *
 * @author juanf
 */
public class InsertionSort {

    // Método público para ordenar el array usando Insertion Sort
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Mueve los elementos mayores que key a una posición adelante
            while (j >= 0 && less(key, arr[j])) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        show(arr); // Mostramos el array después de ordenarlo
    }

    // Método privado de ayuda que compara dos valores
    private static boolean less(int a, int b) {
        return a < b; // Devuelve true si a es menor que b
    }

    // Método privado para imprimir el estado del array
    private static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Nueva línea al final
    }
}