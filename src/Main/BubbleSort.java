/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class BubbleSort {
    
    /***
     * How it works 
     * 
     * [20,35,-15,7,55,1,-22]
     * it partition the array to sorted part and unsorted part 
     * we start by getting the index of the unsorted partition which is the last item that been sorted 
     * it first no item has been put in it's correct place then the index of the unsorted will be the last
     * in our case 6
     * (ASC)
     * now we start by looking for the greater number by comparing each element say x with 
     * the element that it's follows say y 
     * if x > y then it switch place and the x become in the front of y 
     * and repeat until that number reaches the last index 
     * 
     * 1- [20,35,-15,7,55,1,-22]    x = 20 , y=35;  x > y?  (no , no change)
     * 2- [20,35,-15,7,55,1,-22]    x = 35 , y=-15;  x > y?  (yes , swap)
     * 3- [20,-15,35,7,55,1,-22]    x = 35 , y=7;  x > y?  (yes , swap)
     * 4- [20,-15,7,35,55,1,-22]    x = 35 , y=55;  x > y?  (no , no change)
     * 5- [20,-15,7,35,55,1,-22]    x = 55 , y=1;  x > y?  (yes , swap)
     * 6- [20,-15,7,35,1,55,-22]    x = 55 , y=-22;  x > y?  (yes , swap)
     * 7- [20,-15,7,35,1,-22,55]
     * 
     * and like this the the unordered part of the array become 5 because the last element is 
     * put in it's correct position 
     * 
     * then repeat the process to the rest of the array to sorted it all 
     * 
     * in-place algorithm no extra memory used
     * complexity : O(n^2)
     * stable : yes if the comparing is < or > 
     *          if it's <= ot >= it becomes unstable 
     * 
     */

    public static void sortASC(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (list[j] > list[j + 1]) {
                    swap(list, j, j + 1);
                }
                //trace(j,list);  
            }
        }
    }

    public static void sortDSC(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (list[j] < list[j + 1]) {
                    swap(list, j, j + 1);
                }
                //trace(j,list);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void trace(int position, int[] array) {
        String currentstate = "Array =[";
        for (int i : array) {

            currentstate += i + "";
            if (array[array.length - 1] != i) {
                currentstate += ",";
            }
        }
        currentstate += "] , position = " + position;
        System.out.println(currentstate);
    }

}
