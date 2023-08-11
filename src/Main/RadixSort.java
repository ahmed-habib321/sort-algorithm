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
    
    public static void radixsort(int[] input , int radix , int width){
        for (int i = 0; i < width; i++) {
            radixsinglesort(input,i,radix);
        }
    }

    private static void radixsinglesort(int[] input, int position, int radix) {
        int numitem = input.length;
        int[] countarray = new int[radix];
        
        for (int value : input) {
            countarray[getdigit(position,value,radix)]++;
        }
        for (int i = 1; i < radix; i++) {
            countarray[i] += countarray[i-1];
        }
        int [] temp = new int[numitem];
        for (int tempindex = numitem-1; tempindex >=0; tempindex--) {
            temp[--countarray[getdigit(position, input[tempindex], radix)]] = input[tempindex];
        }
        
        System.arraycopy(temp, 0, input, 0, numitem);
    }

    private static int getdigit(int position, int value, int radix) {
        return (value / (int) Math.pow(radix, position)) % radix;
    }
}
