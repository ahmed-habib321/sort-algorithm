/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class MergeSort {
    
    /**
     * merge sort is a Recursive divide and conquer algorithm
     * that has two phases splitting and merging 
     * splitting phase leads to faster sorting during the merge phase
     * split it logical we don't create new array
     * 
     * 
     * the splitting proccess it's like creating a tree until all arrays have only one element
     * a one element array is sorted by default 
     * then we enter the merging phase 
     * we will take the left element array and merged with it's brother on the right and sort them
     * 
     * after that we will have 2 element arrays that are sorted 
     * we do that recursivly until the we merge all arrays that will give us the original array sorted 
     * 
     * the split phase is in-place means that we don't create temp array 
     * the merge phase isn't in-place means that we create temp array to do the merging
     * 
     * ex :
     * 
     * A = [20,35,-15,7,55,1,-22]       start = 0 , end = 7 , midpoint = start+end /2 = 3
     * means that elements from index 0 to 2 will go into the left array 
     * and the elements from index 3 to 6 will go into the right array
     * 
     * A = [{20,35,-15},{7,55,1,-22}]   start = 0 , end = 3 , midpoint = start+end /2 = 1
     * means that elements from index 0 to 0 will go into the left array 
     * and the elements from index 1 to 2 will go into the right array
     * 
     * A = [{20},{35,-15},{7,55,1,-22}]   
     * now the left most is splitted now we go to the next right 
     * 
     * A = [{20},{35,-15},{7,55,1,-22}]   start = 1 , end = 3 , midpoint = start+end /2 = 2
     * means that elements from index 1 to 1 will go into the left array 
     * and the elements from index 2 to 2 will go into the right array 
     * 
     * A = [{20},{35},{-15},{7,55,1,-22}]   start = 3 , end = 6 , midpoint = start+end /2 = 4
     * means that elements from index 3 to 4 will go into the left array 
     * and the elements from index 5 to 6 will go into the right array
     * 
     * A = [{20},{35},{-15},{7,55},{1,-22}]   start = 3 , end = 4 , midpoint = start+end /2 = 3
     * means that elements from index 3 to 3 will go into the left array 
     * and the elements from index 4 to 4 will go into the right array
     * 
     * A = [{20},{35},{-15},{7},{55},{1,-22}]   start = 5 , end = 6 , midpoint = start+end /2 = 5
     * means that elements from index 5 to 5 will go into the left array 
     * and the elements from index 6 to 6 will go into the right array
     * 
     * A = [{20},{35},{-15},{7},{55},{1},{-22}]
     * 
     *                                          [20,35,-15,7,55,1,-22]
     *                                              /          \
     *                                             /            \
     *                                  [20,35,-15]              [7,55,1,-22]
     *                                      /   \                    /     \
     *                                     /     \                  /       \
     *                                 [20]      [35,-15]      [7,55]      [1,-22]
     *                                            /   \          /  \         /  \  
     *                                        [35]     [-15]  [7]  [55]    [1]   [-22]  
     * 
     * merging process : 
     * 
     * each two sibling for the same father will merge and sorted 
     * we create temp array large enough to hold them 
     *
     *                                          [-22,-15,1,7,20,35,55]
     *                                              /          \
     *                                             /            \
     *                                  [-15,20,35]              [-22,1,7,55]
     *                                      /   \                    /     \
     *                                     /     \                  /       \
     *                                 [20]      [-15,35]      [7,55]      [-22,1]
     *                                            /   \          /  \         /  \  
     *                                        [35]     [-15]  [7]  [55]    [1]   [-22]  
     * 
     * not an in-place algorithm
     * 
     * O(n log(n) )-base 2 we're repeatedly dividing the array in half during the splitting phase
     * 
     * stable algorithm
     */
    
    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1] <= input[mid] ) {
            return;
        }
        int i = start ;
        int j = mid ;
        int tempindex = 0;
        
        int[] temp = new int[end-start];
        
        while (i < mid && j < end) {            
            temp[tempindex++] = input[i] <= input[j] ? input[i++]:input[j++];
        }
        //handle any left over elements in the left array 
        
        System.arraycopy(input, i, input, start + tempindex, mid-i);
        System.arraycopy(temp, 0, input, start, tempindex);
        
        
    }
    
    private static void mergesort(int[] input , int start , int end){
        if(end-start < 2){
        return;
        }
        int mid = Math.floorDiv( (start + end) , 2);
        mergesort(input,start,mid);
        mergesort(input,mid,end);
        merge(input , start , mid , end);
    }
    
    public static void mergesort(int[] input){
        mergesort(input , 0 , input.length);
    }
    
    
    /* 
    to do the desc sort change 
    temp[tempindex++] = input[i] >= input[j] ? input[i++]:input[j++];
    */
    
    
    
}





