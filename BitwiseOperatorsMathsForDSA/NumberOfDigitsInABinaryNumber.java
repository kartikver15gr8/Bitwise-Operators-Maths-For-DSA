package com.BitwiseOperatorsMathsForDSA;

public class NumberOfDigitsInABinaryNumber {
    public static void main(String[] args) {
        int number = 4587845;
        int base = 10;      // Base: 16--> Hexadecimal, 10--> Decimal, 8--> Octal, 2--> Binary
        int ans = (int) (Math.log(number) / Math.log(base))+1;
        System.out.println(ans);
    }
}
