/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author Ahmed
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] list = {1, 2, -5, 3, -8, 9};
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < (list.length - i); j++) {
                if (j + 1 != list.length && list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}
