package com.BitwiseOperatorsMathsForDSA;

public class NewtonRaphsonMathod {
    public static void main(String[] args) {
        /* This method is to calculate the square root of a number
            in an optimized way
         */

        /* According to this method
                                     where 'x' is the assumed root
            "Root = (x+(n/x))/2"     and 'Root' is the actual root
                                     we need to find
         */
        int n = 40;
        System.out.println(sqRoot(n));
    }

    static float sqRoot(int n) {
        float x = n;
        float ans = 0;
        while (x * x > n) {
            ans = (x + (n / x)) / 2;
            x = ans;
        }
        return x;
    }
}
