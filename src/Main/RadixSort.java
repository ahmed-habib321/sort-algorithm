/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class RadixSort {

    
    /*
     * 
     * makes assumptions about the date that they are must have same radix and width 
     * because of this data must be integers or strings 
     * 
     * radix (base) 987 -> 10-based , 1010 -> binary , abc -> 26-based
     * width : length (1234 -> width = 4)
     * sort based on each individual digit or letter position
     * 
     * counting sort is often used as the sort algorithm for radix sort (must be stable)
     * 
     * [1330,8792,1594,4725,4586,5729]  sort the base 1
     * [1330,8792,1594,4725,4586,5729]  sort the base 10
     * [4725,5729,1330,4586,8792,1594]  sort the base 100
     * [1330,4586,1594,4725,5729,8792]  sort the base 1000
     * [1330,1594,4586,4725,5729,8792]  now it's sorted
     * 
     * O(n) 
     * 
     * in-place 
     * 
     * stable algorithm
     */
    
    
    /**
     * Performs radix sort on an array of integers.
     *
     * @param input The array of integers to be sorted.
     * @param radix The base of the numbers (e.g., 10 for decimal).
     * @param width The maximum number of digits in the input integers.
     */
    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    /**
     * Sorts the input array based on a specific digit position using counting
     * sort.
     *
     * @param input The array of integers to be sorted.
     * @param position The digit position to sort by (from right to left).
     * @param radix The base of the numbers (e.g., 10 for decimal).
     */
    private static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        // Count the occurrences of each digit at the specified position
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // Adjust the countArray to have cumulative counts
        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] temp = new int[numItems];
        // Place elements in their correct positions based on the digit at the specified position
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            int digit = getDigit(position, input[tempIndex], radix);
            temp[--countArray[digit]] = input[tempIndex];
        }

        // Copy the sorted values back to the input array
        System.arraycopy(temp, 0, input, 0, numItems);
    }

    /**
     * Retrieves the digit at a specific position in a given number.
     *
     * @param position The position of the digit to retrieve (from right to
     * left).
     * @param value The number from which to retrieve the digit.
     * @param radix The base of the numbers (e.g., 10 for decimal).
     * @return The digit at the specified position.
     */
    private static int getDigit(int position, int value, int radix) {
        return (value / (int) Math.pow(radix, position)) % radix;
    }
}
