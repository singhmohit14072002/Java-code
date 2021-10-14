package com.Mohit;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr   = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    private static int  countRotations(int[] arr) {
        int pivot = findPivot(arr);

        return pivot +1;
     }
    // use for Duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if (arr[mid] <= arr[start]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
        return -1;
    }

    static  int  findPivotDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases over here
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
//            if (arr[mid] <= arr[start]){
//                end = mid -1;
//            }else {
//                start = mid + 1;
//            }

            // for duplicate
            //if element at mid , start , end are equal just skip the duplicate
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicate

                //what if these elements at start and end were the pivot ??
                // check if start if pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // end is pivot or not
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted then right side is pivot

            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return -1;
    }
}
