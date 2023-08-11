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
    
    /***
     * it dividing an array into two parts: a sorted part and an unsorted part
     * The goal is to take elements from the unsorted part and insert them 
     * into their correct positions within the sorted part
     * 
     * Here's how the algorithm works step by step:
     * 
     * 1- Imagine you have an array like this: [20, 35, -15, 7, 55, 1, -22]
     * 
     * 2- Start with the assumption that the first element (20) is already 
     * in its correct sorted position, making it the initial sorted part
     * 
     * 3- Begin iterating through the unsorted part of the array, one element at a time
     * Take the first element from the unsorted part and temporarily store it
     * 
     * 4- Compare the stored element with the elements in the sorted part,
     * starting from the rightmost element of the sorted part
     * Shift the larger elements to the right to make space for the stored element
     * 
     * 5- Continue shifting elements in the sorted part until you find the correct position
     * for the stored element (i.e., an element in the sorted part is smaller than the stored element, 
     * or you reach the beginning of the sorted part)
     * 
     * 6- Place the stored element in its correct position within the sorted part
     * 
     * 7- Repeat steps 3 to 6 for the remaining elements in the unsorted part
     * 
     * 8- Once all elements are processed, the entire array is sorted
     * 
     * Step-by-Step Example:
     * 
     * 1st iteration 
     * 1- A = [20,35,-15,7,55,1,-22]    y=1 , lastsorted = A[y-1] = 20 ;  A[y-1] > A[y]?  (no , no change)
     * 
     * 2nd iteration
     * 1- A = [20,35,-15,7,55,1,-22]     y=2 , lastsorted = A[y-1] = 35 ;  A[y-1] > A[y]?  (yes , temp = A[y] , A[y] = A[y-1])
     * 2- A = [20,35,35,7,55,1,-22]     A[y-2] > temp? (yes , A[y-1] = A[y-2])
     * 3- A = [20,20,35,7,55,1,-22]     because we reach the begin of the array then A[y-2] = temp
     * 4- A = [-15,20,35,7,55,1,-22]
     * 
     * 3rd iteration 
     * 1- A = [-15,20,35,7,55,1,-22]     y=3 , lastsorted = A[y-1] = 35 ;  A[y-1] > A[y]?  (yes , temp = A[y] , A[y] = A[y-1])
     * 2- A = [-15,20,35,35,55,1,-22]     A[y-2] > temp? (yes , A[y-1] = A[y-2])
     * 3- A = [-15,20,20,35,55,1,-22]     A[y-3] > temp? (no , A[y-2] = temp)
     * 4- A = [-15,7,20,35,55,1,-22]                                 
     * 
     * then repeat the process to the rest of the array to sorted it all 
     * 
     * No additional memory is used; the sorting is done in-place
     * Its time complexity is O(n^2)
     * Insertion Sort is stable, meaning it maintains the relative order of equal elements
     * 
     */
    
    /**
     * Sorts the given integer array in ascending order using the insertion sort
     * algorithm.
     *
     * @param list The integer array to be sorted.
     */
    public static void sortAscending(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i;
            for (; j > 0 && list[j - 1] > temp; j--) {
                list[j] = list[j - 1];
            }
            list[j] = temp;
        }
    }

    /**
     * Sorts the given integer array in descending order using the insertion
     * sort algorithm.
     *
     * @param list The integer array to be sorted.
     */
    public static void sortDescending(int[] list) {
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
