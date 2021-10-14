package com.Mohit;

import java.util.Arrays;

public class VariableLength {
    public static void main(String[] args) {
        // variable length argument length is not constant its varies
        fun(54 , 6464, 6464, 6464 ,46464 ,4646,44 ,646);
        // it print the array of the length
        multiple(2, 5, "kunal" , "mohit");
    }

    static void multiple(int a , int b, String ...v){  // variable length argument always at the end

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
