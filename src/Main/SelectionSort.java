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
     * How it works 
     * 
     * [20,35,-15,7,55,1,-22]
     * it partition the array to sorted part and unsorted part 
     * we start by getting the index of the unsorted partition which is the last item that been sorted 
     * it first no item has been put in it's correct place then the index of the unsorted will be the last
     * in our case 6
     * (ASC)
     * now we start by looking for the greatest number in the array
     * then when the array ends we will have the position of the greatest element in the unsorted part 
     * we swap it's position with the last unsorted index 
     * now the last element is in it's correct place 
     * 
     * 1- A = [20,35,-15,7,55,1,-22]    max = 0 , x=1;  A[max] > A[x] i.e 20>35 ?  (no , max = x)
     * 2- A = [20,35,-15,7,55,1,-22]    max = 1 , x=2;  A[max] > A[x] i.e 35>-15 ?  (yes , no change)
     * 3- A = [20,35,-15,7,55,1,-22]    max = 1 , x=3;  A[max] > A[x] i.e 35>7 ?  (yes , no change)
     * 4- A = [20,35,-15,7,55,1,-22]    max = 1 , x=4;  A[max] > A[x] i.e 35>55 ?  (no , max = x)
     * 5- A = [20,35,-15,7,55,1,-22]    max = 4 , x=5;  A[max] > A[x] i.e 55>1 ?  (yes , no change)
     * 6- A = [20,35,-15,7,55,1,-22]    max = 4 , x=6;  A[max] > A[x] i.e 55>-22 ?  (yes , no change)
     * 
     * now we traverse the array and we has that the greatest element is at index 4 
     * now swap it with the last unsorted element 
     * 
     * A = [20,35,-15,7,-22,1,55]
     * 
     * and like this the the unordered part of the array become 5 because the last element is 
     * put in it's correct position 
     * 
     * then repeat the process to the rest of the array to sorted it all 
     *
     * in-place algorithm no extra memory used 
     * complexity : O(n^2)
     * unstable
     * 
     * 
     */

    public static void sortASC(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (list[j] > list[max]) {
                    max = j;
                }
            }
            swap(list, max, i);
        }

    }

    public static void sortDSC(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            int min = 0;
            for (int j = 1; j <= i; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            swap(list, min, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
