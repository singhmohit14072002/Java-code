package com.Mohit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
                int[] arr = {5,4,3,2,1};
                bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i=0; i<arr.length; i++){
                swapped = false;
           // for each step, max items will come at the last respective index
            for (int j=1; i<arr.length - i; j++) {
                    // compare
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                 }

            }
            // if you did not  swap for a particular value of i it means the array is sorted hece stop them
            if (!swapped) {
                break;  
            }
        }
    }
}
