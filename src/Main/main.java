/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.Arrays;

/**
 *
 * @author Ahmed
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = {9, 5, 2, 6, 8, 1, 7};

        RadixSort.radixSort(list, 10, 1);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
