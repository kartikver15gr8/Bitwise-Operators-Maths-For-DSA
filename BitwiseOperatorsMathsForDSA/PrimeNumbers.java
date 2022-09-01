package com.BitwiseOperatorsMathsForDSA;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

        // Same approach using 'While' loop
//        int c = 2;
//        while (c * c <= n) {        // Here we put the condition as "c*c<=n" because we only want to run the loop √n times.
//            if (n % c == 0) {
//                return false;
//            }
//            c++;
//        }
//        return true;
    }
}
