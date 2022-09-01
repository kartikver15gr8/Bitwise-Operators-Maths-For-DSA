package com.BitwiseOperatorsMathsForDSA;

public class FindXORFromZeroToA {
    public static void main(String[] args) {
        int a = 4;
        System.out.println(xorFromZeroToA(a));
    }

    static int xorFromZeroToA(int a) {
//        int x = 0;
//        int ans = 0;
//        while (x <= a) {
//            ans ^= x;
//            x++;
//        }
//        return ans;

        // Another solution based upon the observation is below and is very optimized
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
