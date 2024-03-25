/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis
    public class TestAlgorithm {

        public static void main(String[] args) {
            int[] sortedArray = {1, 2, 11, 12, 14, 16, 23};
            int key = 12;
            int low = 0;
            int high = sortedArray.length - 1;

            int index = BinarySearch.runBinarySearchIteratively(sortedArray, key, low, high);

            if (index != Integer.MAX_VALUE) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found.");
            }

            // Time Complexity Analysis:
            //O(log n), where n is the number of elements in the array.
            //This is because each iteration halves the search space, leading to a logarithmic relationship between the number of iterations and the array size.
            // Space Complexity Analysis:
            // O(1), meaning the space used is constant and doesn't increase with the input size.
        }
    }
