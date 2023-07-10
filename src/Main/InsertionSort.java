/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class InsertionSort {

    public static void sortASC(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i;
            for (; j > 0 && list[j - 1] > temp; j--) {
                list[j] = list[j - 1];
            }
            list[j] = temp;
        }

    }
    
    public static void sortDSC(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i;
            for (; j > 0 && list[j - 1] < temp; j--) {
                list[j] = list[j - 1];
            }
            list[j] = temp;
        }

    }

}
