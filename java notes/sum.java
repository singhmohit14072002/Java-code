package com.Mohit;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("enter number 1: ");
        num1 = in.nextInt();
        System.out.print("enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;

    }


     static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("enter number 1: ");
        num1 = in.nextInt();
        System.out.print("enter number 2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("the sum = " + sum);
    }
}
