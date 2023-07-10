/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class ShellSort {

    public static void sortASC(int[] list) {
        for (int gap = list.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < list.length; i++) {
                int temp = list[i];
                int j = i;
                for (; j >= gap && list[j - gap] > temp; j -= gap) {
                    list[j] = list[j - gap];
                }
                list[j] = temp;
            }
        }
    }
    
    public static void sortDSC(int[] list) {
        for (int gap = list.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < list.length; i++) {
                int temp = list[i];
                int j = i;
                for (; j >= gap && list[j - gap] < temp; j -= gap) {
                    list[j] = list[j - gap];
                }
                list[j] = temp;
            }
        }
    }
}
