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
     * Quick sort is a Recursive divide and conquer algorithm 
     * 
     * partitioning step :
     * 
     * it choose a pivot element to partition the array into two parts 
     * the left part has the elements that are less than the pivot 
     * and the right part has the elements that are greater than the pivot 
     *  
     * that means that the pivot element will be in it's correct sorted position
     * but the left and the right arrays are still not sorted
     * 
     * in the end of the partitioning step we will have series of 1 element arrays
     * 
     * and because every element will be a pivot element 
     * that means that each element will be in it's correct postiton
     * 
     * 
     * 
     * in-place algorithm 
     * 
     * O(n log(n) )-base2
     * 
     * unstable algorithm
     *                    
     * 
     */
    
    
    
    public static void quicksort(int[] input , int start , int end){
        if (end-start<2) {
            return;
        }
        
        int pivot = partition(input,start,end);
        quicksort(input, start, pivot);
        quicksort(input, pivot+1,end);
    }
    
    public static void quicksort(int[] input){
        quicksort(input,0,input.length);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;
        
        while (i<j) {  
            
            while (i<j && input[--j] >= pivot);
            
            if (i<j) {
                input[i] = input[j];
            }
            
            while (i<j && input[++i] <= pivot);
            
            if (i<j) {
                input[j] = input[i];
            }
            
        }
        input[j] = pivot;
        return j ;
    }
    
}
