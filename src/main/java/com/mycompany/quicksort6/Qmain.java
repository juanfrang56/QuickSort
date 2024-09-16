/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quicksort6;



/**
 *
 * @author juanf
 */
public class Qmain {

  public static void main(String[] args) {
        // Creamos un array de prueba
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Array original:");
        show(array); // Mostramos el array original

        // Ordenamos usando QuickSort
        System.out.println("\nOrdenando con QuickSort:");
        QuickSort.sort(array); // Llamamos a QuickSort.sort()

        // Creamos otro array para InsertionSort
        int[] array2 = {10, 7, 8, 9, 1, 5};
        System.out.println("\nOrdenando con InsertionSort:");
        InsertionSort.sort(array2); // Llamamos a InsertionSort.sort()
    }

    // Método privado para imprimir el estado del array
    private static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Nueva línea al final
    }
}