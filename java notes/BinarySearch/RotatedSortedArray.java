package com.Mohit;

public class RotatedSortedArray {
    public static void main(String[] args) {
//    int[] arr   = {4,5,6,7,0,1,2};
//        System.out.println(findPivot(arr));
    }
    static  int search(int[] nums, int target) {
       int pivot = findPivot(nums);

       // if did not find the pivot its
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
          if (nums[pivot] == target){
              return pivot;
        }
         if (target >= nums[0]){
             return binarySearch(nums,target , 0, pivot-1);
         }
         return binarySearch(nums , target , pivot+1, nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
           while (start <= end){
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

     static  int  findPivot(int[] arr){
        int  start = 0;
        int end = arr.length -1;
        while (start <= end ){
            // 4 cases over here
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
//            if (arr[mid] <= arr[start]){
//                end = mid -1;
//            }else {
//                start = mid + 1;
//            }

            // for duplicate
            //if element at mid , start , end are equal just skip the duplicate
            if (arr[mid] == arr[start] && arr[mid] == arr[end] ){
                // skip the duplicate

                //what if these elements at start and end were the pivot ??
                // check if start if pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // end is pivot or not
                if (arr[end] < arr[end -1]){
                    return end -1;
                }
                end--;
            }
            //left side is sorted then right side is pivot

            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end] )){
                start = mid +1;
            }else {
                end = mid - 1;
            }


        }
        return  -1;
    }
}
