
package com.mycompany.quicksort6;

/**
 *
 * @author juanf
 */
public class QuickSort {

    // 
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1); // Llamamos al método quickSort
        show(arr); // Mostramos el array después de ordenarlo
    }

    // Método recursivo que implementa el algoritmo QuickSort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Llamamos a partition() para obtener el índice del pivote
            quickSort(arr, low, pi - 1);  // Ordenamos la sublista izquierda
            quickSort(arr, pi + 1, high); // Ordenamos la sublista derecha
        }
    }

    // Método que particiona el array y devuelve el índice del pivote
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Elegimos el pivote como el último elemento
        int i = low - 1; // i rastrea el índice de los elementos más pequeños que el pivote
        for (int j = low; j < high; j++) {
            if (less(arr[j], pivot)) { // Compara si el valor es menor o igual que el pivote
                i++;
                exch(arr, i, j); // Intercambia los valores si corresponde
            }
        }
        exch(arr, i + 1, high); // Coloca el pivote en su posición correcta
        return i + 1; // Devuelve el índice del pivote
    }

    // Método privado de ayuda que compara dos valores
    private static boolean less(int a, int b) {
        return a <= b; // Devuelve true si a es menor o igual que b
    }

    // Método privado de ayuda que intercambia dos elementos en el array
    private static void exch(int[] arr, int i, int j) {
        int temp = arr[i]; // Guardamos temporalmente el valor de arr[i]
        arr[i] = arr[j]; // Asignamos el valor de arr[j] a arr[i]
        arr[j] = temp; // Asignamos el valor temporal a arr[j]
    }

    // Método privado para imprimir el estado del array
    private static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Nueva línea al final
    }
}
