package com.BitwiseOperatorsMathsForDSA;

public class CheckANumberIfItIsPowerOfTwo {
    public static void main(String[] args) {
        int n = 1024;
//        System.out.println(powerOfTwo(n));
        System.out.println(powerOfTwo(n));
    }
    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    static boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        if (isOdd(n)) {
            return false;
        }
        while (n >= 2) {
            if (isOdd(n)) {
                return false;
            }
            n = n >> 1;
        }
        return true;
        // Another solution without using loop

//    static boolean powOfTwo(int n) {
//        boolean ans = (n & (n - 1)) == 0;
//        if (n == 0) {
//            return false;
//        }
//        return ans;
//    }
    }
}


