package com.BitwiseOperatorsMathsForDSA;

public class EvenOrOddCheckUsingOperators {
    public static void main(String[] args) {
        int n = 84;
        System.out.println(isEven(n));
    }

    static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
