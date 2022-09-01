package com.BitwiseOperatorsMathsForDSA;

public class SingleNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(singleNumberInArray(arr));
    }

    static int singleNumberInArray(int[] arr) {
        int single = 0;
        for (int i : arr) {
            single ^= i;
        }
        return single;
    }
}
