package com.BitwiseOperatorsMathsForDSA;

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        int n = 48;
        System.out.println(positionOfRightMostSetBit(n));
    }

    static int positionOfRightMostSetBit(int n) {
//        int ans = -1;
//        while (n > 0) {
//            if ((n & 1) == 0) {
//                ans++;
//                n = n >> 1;
//            } else if ((n & 1) == 1){
//                ans++;
//                return (int) Math.pow(2,ans);
//            }
//        }
//        return (int) Math.pow(2,ans);

        // The below is the solution using concepts of Maths

        return -n & n;
    }
}
