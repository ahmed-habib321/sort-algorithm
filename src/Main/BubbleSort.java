/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class BubbleSort {
    
    /**
     * 
     * how Bubble Sort works:
     * 
     * 1-Divide the list into two parts: the sorted part and the unsorted part
     * Initially, the sorted part is empty, and the unsorted part contains all the elements
     * 
     * 2-Compare each element in the unsorted part with its adjacent element
     * If the current element is greater than the next element, swap them
     * 
     * 3-Repeat this process for all elements in the unsorted part, moving from left to right
     * 
     * 4-After one pass through the unsorted part, 
     * the largest element will "bubble up" to the correct position at the end of the list
     * 
     * 5-Reduce the size of the unsorted part by one 
     * (since the largest element is now in its correct place)
     * 
     * 6-Repeat those steps for the remaining unsorted part until the entire list is sorted
     * 
     * 
     * Step-by-Step Example:
     * 
     * [20, 35, -15, 7, 55, 1, -22] (Initial list)
     * [20, 35, -15, 7, 55, 1, -22] (Comparing 20 and 35, no swap)
     * [20, -15, 35, 7, 55, 1, -22] (Swap -15 and 35)
     * [20, -15, 7, 35, 55, 1, -22] (Swap 7 and 35)
     * [20, -15, 7, 35, 1, 55, -22] (Swap 1 and 55)
     * [20, -15, 7, 35, 1, -22, 55] (Swap -22 and 55, first pass complete)
     * 
     * Now, the largest element (55) is in its correct place at the end of the list
     * The unsorted part has reduced by one, and we repeat the process for the remaining unsorted part 
     * 
     * Continue these steps until the entire list is sorted 
     * 
     * Properties of Bubble Sort:
     * 
     * In-Place Algorithm: Bubble Sort doesn't require extra memory and sorts the list within the same array
     * 
     * Time Complexity: Bubble Sort has a time complexity of O(n^2), making it less efficient for large lists
     * 
     * Stability: Bubble Sort is stable, meaning that the relative order of equal elements will not change after sorting
     * 
     */

    /**
     * Sorts the given integer array in ascending order
     *
     * @param array The array of integers to be sorted.
     */
    public static void sortAscending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * Sorts the given integer array in descending order
     *
     * @param array The array of integers to be sorted.
     */
    public static void sortDescending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * Swaps two elements in an integer array.
     *
     * @param array The array in which elements are to be swapped.
     * @param i     The index of the first element to be swapped.
     * @param j     The index of the second element to be swapped.
     */
    private static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
