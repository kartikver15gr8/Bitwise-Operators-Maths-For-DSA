package com.BitwiseOperatorsMathsForDSA;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(magicNumber(n));
    }

    static int magicNumber(int n) {
        int ans = 0;
        int base = 5;
        int power = 1;

//        while (n > 0) {
//            int lastBit = n & 1;
//            if (lastBit == 1) {
//                ans += Math.pow(5, power);
//            }
//            n = n >> 1;
//            power++;
//        }

        // Another solution

        while (n > 0) {
            int lastBit = n & 1;
            ans += lastBit * base;
            base = base * 5;
            n = n >> 1;
        }

        return ans;
    }
}
