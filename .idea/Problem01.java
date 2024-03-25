/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static long getSumOfPrimes(int n){
        // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
        //          Test your solution
        //          Analyze its space and time

        long sum = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);  // Assume all numbers are prime initially

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Calculate the sum of primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        long sumOfPrimes = getSumOfPrimes(n);
        System.out.println("The return of the sum of primes between 1 and " + n + ": " + sumOfPrimes);
    }

    //time complexity: O(n log log n)
// space complexity: O(n)