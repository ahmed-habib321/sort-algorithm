/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class CountingSort {
    /**
     * makes assumptions about the date
     * 
     * doesn't use comparisons 
     * 
     * only work with non-negative discrete values (not float , strings)
     * 
     * values must be within a specific range 
     * 
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=0  A[i]=2 counter = {0,1,0,0,0,0,0,0,0,0}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=1  A[i]=5 counter = {0,1,0,0,1,0,0,0,0,0}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=2  A[i]=9 counter = {0,1,0,0,1,0,0,0,1,0}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=3  A[i]=8 counter = {0,1,0,0,1,0,0,1,1,0}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=4  A[i]=2 counter = {0,2,0,0,1,0,0,1,1,0}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=5  A[i]=8 counter = {0,2,0,0,1,0,0,2,1,0}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=6  A[i]=7 counter = {0,2,0,0,1,0,1,2,1,0}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=7  A[i]=10 counter= {0,2,0,0,1,0,1,2,1,1}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=8  A[i]=4 counter = {0,2,0,1,1,0,1,2,1,1}
     * A = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3}  i=9  A[i]=3 counter = {0,2,1,1,1,0,1,2,1,1}
     * 
     * now we write on the the A array the numbers based on the counter array
     * 
     * 
     * not an in-place algorithm
     * 
     * O(n) can be achieved because we're making assumuptions about the data 
     * 
     * not stable to make it stable we will make some extra steps(done in other class)
     * 
     * use it with caution use it with small ranges
     * 
     * ex : 
     * A [1,20,500,100000] this can be sorted very easy with other algorithms but with counting sort 
     * it will create counter of length 100000 to sort it 
     * 
     */
    
    
    
    
    /**
     * Sorts an array of integers using the Counting Sort algorithm.
     * This algorithm is efficient when the range of input values (max - min + 1)
     * is not significantly larger than the number of elements in the array.
     *
     * @param input The array of integers to be sorted.
     * @param min The minimum value in the range of input values.
     * @param max The maximum value in the range of input values.
     * @throws IllegalArgumentException if the range of input values is invalid.
     */
    public static void countingSort(int[] input, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range: min must be less than or equal to max.");
        }

        int range = max - min + 1;
        int[] counter = new int[range];

        for (int num : input) {
            if (num < min || num > max) {
                throw new IllegalArgumentException("Input value out of range.");
            }
            counter[num - min]++;
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            while (counter[i - min] > 0) {
                input[index++] = i;
                counter[i - min]--;
            }
        }
    }
}
