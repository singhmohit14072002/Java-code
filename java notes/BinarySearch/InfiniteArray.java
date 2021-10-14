package com.Mohit;


public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3 ,5,6,7,8,9,12,13,14,15,17,18,19};
        int target = 9;

        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target) {
        // first find the range of the ans
        //first start with a box size 2

        int start = 0;int end = 1;

        //condition for the target to lie int the range
        while (target > arr[end]){
            int temp = end + 1;
            //double the value
            end = end+(end-start + 1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start , end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start  = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
