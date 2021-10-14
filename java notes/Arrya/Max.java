package com.Mohit;

public class Max {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,43,54};
        System.out.println(max(arr));
    }
    static int  max(int[] arr){
        if (arr.length == 0){
            return -1;

        }
        int maxVal = arr[0];
        for (int i=1; i<= arr.length; i++){
           if(arr[i] > maxVal){
               maxVal = arr[i];
           }

        }
        return maxVal;
    }
}
