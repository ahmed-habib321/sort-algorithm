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
    
    /***
     * it dividing an array into two parts: a sorted part and an unsorted part 
     * Initially, the sorted part is empty, and the unsorted part includes the entire array
     * 
     * Here's how the algorithm works:
     * 
     * 1- Start by considering the entire array as unsorted
     * 2- Find the largest element in the unsorted part of the array and remember its index
     * 3- Swap the largest element found with the last element in the unsorted part
     * 4- Now, the last element of the unsorted part is in its correct position, and the sorted part has grown by one element
     * 5- Repeat steps 2-4 for the remaining unsorted part of the array until the entire array is sorted
     *  
     *
     * Selection sort is an in-place algorithm, meaning it doesn't require extra memory
     * time complexity is O(n^2)
     * unstable sorting algorithm
     * 
     */
    
    
    /**
     * Sorts the given integer array in ascending order using the Selection Sort
     * algorithm.
     *
     * @param list The array to be sorted.
     */
    public static void sortAscending(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (list[j] > list[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(list, maxIndex, i);
        }
    }

    /**
     * Sorts the given integer array in descending order using the Selection
     * Sort algorithm.
     *
     * @param list The array to be sorted.
     */
    public static void sortDescending(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            int minIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            swap(list, minIndex, i);
        }
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param array The array in which elements will be swapped.
     * @param i The index of the first element to be swapped.
     * @param j The index of the second element to be swapped.
     */
    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
