/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class QuickSort {
    /**
     * Quick Sort is a recursive divide-and-conquer algorithm used for sorting arrays
     * 
     * Here's how it works:
     * 
     * 1- Choose a 'pivot' element from the array
     * 
     * 2- Rearrange the array so that all elements less than the pivot are on its left,
     *    and all elements greater than the pivot are on its right
     *    The pivot itself will be in its final sorted position
     * 
     * 3- Now, the left and right portions of the array are not sorted yet, 
     *    but each element is in its correct sorted part
     * 
     * 4- Apply steps 1-3 recursively to the left and right portions of the array 
     *    until the entire array is sorted 
     *    This is done by treating each chosen element as a pivot and partitioning the sub-arrays
     * 
     * 
     * The algorithm works in-place, meaning it doesn't require extra memory for sorting
     * 
     *  time complexity is O(n log(n)) in the average and best cases 
     *  However, in the worst case, it can be O(n^2), which is rare but possible
     * 
     * unstable algorithm
     *                    
     * 
     */
    
    
    /**
     * Sorts the given portion of the array using the QuickSort algorithm.
     *
     * @param input The array to be sorted.
     * @param start The starting index of the portion to be sorted.
     * @param end The ending index of the portion to be sorted (exclusive).
     */
    public static void quicksort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivot = partition(input, start, end);
        quicksort(input, start, pivot);
        quicksort(input, pivot + 1, end);
    }

    /**
     * Sorts array using the QuickSort algorithm.
     *
     * @param input The array to be sorted.
     */
    public static void quicksort(int[] input) {
        quicksort(input, 0, input.length);
    }

    /**
     * Partitions the array portion around a pivot element.
     *
     * @param input The array to be partitioned.
     * @param start The starting index of the portion to be partitioned.
     * @param end The ending index of the portion to be partitioned (exclusive).
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
