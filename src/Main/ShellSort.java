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
    
    /**
     * Shell Sort is an advanced version of insertion sort that introduces the concept of a variable gap
     * 
     * Initially, a larger gap is used, gradually reducing to 1, which eventually turns the algorithm into a basic insertion sort
     * 
     * The process involves performing some preliminary sorting with larger gaps, which moves elements closer to their sorted positions
     * 
     * In the final iteration, when the gap becomes 1, a regular insertion sort is executed
     * 
     * This approach significantly reduces the amount of shifting required during sorting
     * 
     * In-place algorithm: It doesn't require extra memory for sorting
     * Complexity: The efficiency depends on how the gap is calculated
     *             Refer to Wikipedia for detailed information
     * Unstable algorithm: The relative order of equal elements might change after sorting
     * 
     */ 
    
    
    /**
     * Sorts the given integer array in ascending order using the Shell Sort
     * algorithm.
     *
     * @param arr The integer array to be sorted.
     */
    public static void sortAscending(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                for (; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    /**
     * Sorts the given integer array in descending order using the Shell Sort
     * algorithm.
     *
     * @param arr The integer array to be sorted.
     */
    public static void sortDescending(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                for (; j >= gap && arr[j - gap] < temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

}
