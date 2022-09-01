package com.BitwiseOperatorsMathsForDSA;

public class IthBitOfANumber {
    public static void main(String[] args) {
        int n = 4;
        int number = 1010110;
        System.out.println(ithBit(number, n));
    }

    static int ithBit(int number, int n) {
        return number & (1 << (n - 1));
    }
}
