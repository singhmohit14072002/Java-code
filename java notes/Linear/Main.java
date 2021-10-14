package com.Mohit;

public class Main {

    public static void main(String[] args) {
        int[] nums = {12, 34, 45, 6, 54};
        int target = 34;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search in the array return hr index if item found
    //otherwise if item npt found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loops
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if its is == target
            int element = arr[index];
            if (element == target) {
                return index; // if we want to return the element simply replace the index into  element
            }
        }
        // this line will execute if none of the target statement above have executed
        //hence the target not found
        return -1;
    }

}
