/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ahmed
 */
/**
 * A class that implements the Bucket Sort algorithm to sort an array of integers.
 */
public class BucketSort {
    /**
     * Sorts an array of integers using the Bucket Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    public void sort(int[] arr) {
        // Create an array of lists (buckets) for organizing elements.
        List<Integer>[] buckets = new List[10];

        // Initialize each bucket as an ArrayList.
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Distribute elements from the input array into buckets.
        for (int i = 0; i < arr.length; i++) {
            int bucketIndex = hash(arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket individually using Collections.sort().
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Merge sorted buckets back into the original array.
        int currentIndex = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[currentIndex++] = value;
            }
        }
    }

    /**
     * Hashes an integer value to determine which bucket it should belong to.
     *
     * @param value The integer value to be hashed.
     * @return The index of the bucket to which the value belongs.
     */
    private int hash(int value) {
        return value / 10;
    }
}
