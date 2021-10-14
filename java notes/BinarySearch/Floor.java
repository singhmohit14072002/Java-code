package com.Mohit;

public class Floor {
    public static void main(String[] args) {

        int[] arr = {2,3 ,4,5, 6,34,45,56,77, 88,98,787 };
        int target = 56;
        int ans = Floor(arr , target);
        System.out.println(ans);
    }

    // return the index of greatest no >= target
    static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // find the middle element
            //  int mid = (start + end) /2 ; // might be possible that (start + end) exceed the range of integer in java
            int mid = start + (end - start)/2;
            if ( target < arr[mid]){
                end = mid -1;

            }else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                // ans found
                return mid ;
            }

        }
        return end;
}
    }