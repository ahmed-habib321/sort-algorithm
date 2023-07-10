/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class SelectionSort {

    public static void sortASC(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (list[j] > list[max]) {
                    max = j;
                }
            }
            swap(list, max, i);
        }

    }

    public static void sortDSC(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            int min = 0;
            for (int j = 1; j <= i; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            swap(list, min, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
