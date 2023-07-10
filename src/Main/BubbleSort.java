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

    public static void sortASC(int[] list) {
        for (int i = list.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                
                if (list[j] > list[j + 1]) {
                    swap(list, j, j+1);
                }
                //trace(j,list);
                
            }
        }
    }
    
    public static void sortDSC(int[] list) {
        for (int i = list.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                
                if (list[j] < list[j + 1]) {
                    swap(list, j, j+1);
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
    
    public static void trace(int position, int[] array){
        String currentstate = "Array =[";
        for (int i : array) {
            
            currentstate += i+"";
            if (array[array.length-1]!=i) {
            currentstate += ",";    
            }
        }
        currentstate +="] , position = " + position;
        System.out.println(currentstate);
    }

}
