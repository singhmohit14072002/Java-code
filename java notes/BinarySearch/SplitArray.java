package com.Mohit;

public class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
      int start = 0;
      int end = 0;
      for (int i=0; i<nums.length; i++){
          start = Math.max(start , nums[i]); //  in the end loop will contain
          end += nums[i];
      }
      // binary search
        while (start < end){
            // try
            int mid = start +(end -start)/2;

            // calculate how many pieces divided this in with max sum
            int sum =0;
            int pieces = 1;
            for(int num : nums){
             if (sum + num > mid ){
                 // you can not add in this sub array make new on
                 sum = num;
                 pieces++;
             }else {
                 sum += num;
             }
            }

            if (pieces > m){
                start = mid +1;

            }else {
                end = mid;
            }

        }
        return end; // here start == end
    }
}
