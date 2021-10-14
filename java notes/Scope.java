package com.Mohit;

public class Scope {
    public static void main(String[] args) {
   // in scope we are not access outside the function only access inside th function..
        int a = 10; // already initialised  outside the block in the same method, hence you cannot initialised again
        int b = 20;

        {
            a = 78; // already initialised  outside the block in the same method, hence you cannot initialised again
            int c = 99;
            // value initialised in this block, will remain in block
        }
     //   System.out.println(c); // cannot use outside the block

    }
    static void random(int marks){
        int num = 75;
        System.out.println(num);
        System.out.println(marks);

    }
}
