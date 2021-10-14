package com.Mohit;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 25;
//        System.out.println(arr[1]);
//
//        // input using for loops
//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        for (int j : arr) { //for every element in array  print the element
//            System.out.println(j + " ");
//        }

        // array of objects
        String[] str = new String[4];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
