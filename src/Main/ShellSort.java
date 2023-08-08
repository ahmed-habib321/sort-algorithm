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
    
    
    /***
     * How it works 
     * 
     * it is basically the insertion sort with variable gap 
     * the gap is getting smaller until it reach to 1 then it becomes insertion sort
     * it's like it does some preliminary work using gap greater than 1 and this work 
     * put the elements in the array closer to their sorted position and then 
     * in the last iteration when the gap becomes 1 it does insertion sort 
     * this will reduce the amount of shifting required 
     * 
     * in-place algorithm no extra memory used
     * complexity : depend on the way of calculating the gap check wikipedia to more info
     * unstable algorithm
     * 
     */ 

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
