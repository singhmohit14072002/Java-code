package com.Mohit;

public class SearchInRange {
    public static void main(String[] args) {
       int[] arr = {18, 12, -7, 3, 45, 4};

       int target = 3;
        System.out.println(linearSearch(arr, target , 1, 4 ));
    }

        static int linearSearch(int[] arr, int target , int start , int end ) {
            if (arr.length == 0) {
                return -1;
            }
            // run a for loops
            for (int index = start; index <= end; index++) {
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