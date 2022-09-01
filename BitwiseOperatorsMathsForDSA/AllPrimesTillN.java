package com.BitwiseOperatorsMathsForDSA;

public class AllPrimesTillN {
    public static void main(String[] args) {
        int n = 40;
        boolean[] numbers = new boolean[n + 1];
//        primeTillN(n);
        System.out.println("All prime numbers till " + n + " are:");
        primeTillN(n, numbers);
    }



    // Optimized Solution
    static void primeTillN(int n, boolean[] numbers) {
        for (int i = 2; i * i <= n; i++) {
            if (!numbers[i]) {
                for (int j = i*2; j <= n; j += i) {
                    numbers[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!numbers[i]) {
                System.out.print(i + " ");
            }
        }


        // Bruteforce Solution

        //    static void primeTillN(int n) {
//        for (int j = 2; j <= n; j++) {
//            if (isPrime(j)) {
//                System.out.println(j);
//            }
//        }
//    }
//    static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i*i <= n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//}
    }
}
