package com.Mohit;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[]  ros; //  declaration of array. ros is getting defined in the stack
        ros = new int[5];// initialisation  actually here object is being created in the memory(heap)
        System.out.println(ros);

        String[] arr  = new String[4];
        System.out.println(arr[0 ]);

//        for (String element : arr ){
//            System.out.println(element);
//        }
    }
}
