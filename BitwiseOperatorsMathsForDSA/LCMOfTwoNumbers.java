package com.BitwiseOperatorsMathsForDSA;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(LCMOfTwoIntegers(3, 7));
        System.out.println(HcfOrGcd(3,7));
    }

    static int LCMOfTwoIntegers(int a, int b) {
        return (a * b) / HcfOrGcd(a, b);
    }
    static int HcfOrGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return HcfOrGcd(b % a, a);
    }
}
