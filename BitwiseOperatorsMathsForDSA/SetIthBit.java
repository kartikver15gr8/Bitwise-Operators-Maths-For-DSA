package com.BitwiseOperatorsMathsForDSA;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 4 ;
        int number = 86;
        System.out.println(setIthBit(number, n));
    }

    static int setIthBit(int number, int n) {
        return number | (1 << (n - 1));
    }
}
