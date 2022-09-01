package com.BitwiseOperatorsMathsForDSA;

public class SqrtOfANumber {
    public static void main(String[] args) {
        int n = 88;
        int precision = 3;
        System.out.printf("%.3f", squareRoot(n, precision));
    }

    static double squareRoot(int number, int precision) {
        int start = 0;
        int end = number;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == number) {
                return mid;
            }
            if (mid * mid > number) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double sqrt = end;


        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (sqrt * sqrt <= number) {
                sqrt += increment;
            }

            sqrt -= increment;
            increment /= 10;
        }
        return sqrt;

    }

    // Using 'Binary Search' to find Square_root of perfect square
//    static int squareRoot(int n) {
//        int start = 1;
//        int end = n;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (mid * mid == n) {
//                return mid;
//            }
//            if (mid * mid > n) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return end;
//    }
}
