package com.Mohit;

public class OrderAgnosticBS {
    public static void main(String[] args) {
     //int[] arr = {2,3 ,4,5, 6,34,45,56,77, 88,98,787 };
    int[] arr = {99,98,97,44,43,22,3};
        int target = 3;

        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans );
    }

    static int orderAgnosticBS(int[] arr, int target ){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] == target){

                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                    if ( target > arr[mid]){
                        end = mid -1;

                    }else  {
                        start = mid + 1;
                    }
                }


        }
        return -1;
    }
} 
