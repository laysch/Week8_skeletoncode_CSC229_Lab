/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 15, 25, 15, 90};
            bubbleSort(arr, arr.length);

            System.out.println("Sorted array is:");
            for (int i = 0; i < arr.length; ++i)
                System.out.print(arr[i] + " ");

            // Time Complexity Analysis:
            //The time complexity of bubble sort is O(n^2)
            // Where n is the number of elements in the array.
            // Each element needs to be compared with all other elements (n-1 comparisons) in each pass (n passes).
        }
    }
