package com.BitwiseOperatorsMathsForDSA;

public class EuclideanAlgorithmToFindGCD {
    public static void main(String[] args) {
        System.out.println("The HCF or GCD of the given two numbers is:");
        System.out.println(gcdOrHcf(45,7));
    }

    static int gcdOrHcf(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcdOrHcf(b % a, a);
    }
}
