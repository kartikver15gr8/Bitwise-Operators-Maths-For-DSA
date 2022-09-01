package com.BitwiseOperatorsMathsForDSA;

public class ResetIthBit {
    public static void main(String[] args) {
        int number = 86;
        int n = 5;
        System.out.println(resetIthBit(number, n));
    }

    static int resetIthBit(int number, int n) {
        return number & ~(1 << (n - 1));
    }
}
