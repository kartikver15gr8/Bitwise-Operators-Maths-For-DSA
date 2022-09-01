package com.BitwiseOperatorsMathsForDSA;

public class FindNumberOfSetBits {
    public static void main(String[] args) {
        int n = 1024;
        System.out.println(totalSetBits(n));
        System.out.println(Integer.toBinaryString(n));
    }
    static int totalSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;

        // Another solution of the same problem can be:
//        int ans = 0;
//        while (n > 0) {
//            ans++;
//            n -= (n & -n);
//        }
//        return ans;
    }
}
