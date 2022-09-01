package com.BitwiseOperatorsMathsForDSA;

import java.util.ArrayList;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(factors(n));
    }


    // Bruteforce solution

//    static String factors(int n) {
//        StringBuilder ans = new StringBuilder();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                ans.append(i + " ");
//            }
//        }
//        return ans.toString();
//    }

    // Optimized solution

    static String factors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans.add(i);
                ans.add(n / i);
            }
        }
        return ans.toString();
    }
}
