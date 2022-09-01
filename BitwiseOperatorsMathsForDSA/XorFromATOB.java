package com.BitwiseOperatorsMathsForDSA;

public class XorFromATOB {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int ans = xor(b) ^ xor(a);
        System.out.println(ans);
    }

    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }if (a % 4 == 1) {
            return 1;
        }if (a % 4 == 2) {
            return a+1;
        }
        return 0;
    }
}
