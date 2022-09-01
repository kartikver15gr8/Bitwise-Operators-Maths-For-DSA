package com.BitwiseOperatorsMathsForDSA;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("10010","10011"));
    }
    static String addBinary(String a, String b) {
        int carry=0;
        StringBuilder builder1 = new StringBuilder(a);
        StringBuilder builder2 = new StringBuilder(b);
        StringBuilder result = new StringBuilder();
        builder1.reverse();
        builder2.reverse();
        int i = 0, sum;
        while (i < a.length() || i < b.length()) {

            sum = carry;
            if (i < a.length()) sum += builder1.charAt(i) - '0';
            if (i < b.length()) sum += builder2.charAt(i) - '0';
            if (sum == 0) {
                carry = 0;
                result.append('0');
            }
            if (sum == 1) {
                carry = 0;
                result.append('1');
            }
            if (sum == 2) {
                carry = 1;
                result.append('0');
            }
            if (sum == 3) {
                carry = 1;
                result.append('1');
            }
            i++;
        }

        if (carry == 1) {
            result.append('1');
        }
        result.reverse();
        return result.toString();

    }
}
