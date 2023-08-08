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
     * How it works 
     * 
     * [20,35,-15,7,55,1,-22]
     * it partition the array to sorted part and unsorted part 
     * we start by assuming that the first element is in it's correct position 
     * which makes the sorted part is the first element 
     * now we take the first element in the unsorted part and we shift it in the sorted part
     * to find it's correct place to insert it in 
     * (ASC)
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
     * in-place algorithm no extra memory used
     * complexity : O(n^2)
     * stable algorithm
     * 
     */
    
    public static void sortASC(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i;
            for (; j > 0 && list[j - 1] > temp; j--) {
                list[j] = list[j - 1];
            }
            list[j] = temp;
        }

    }
    
    public static void sortDSC(int[] list) {
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
