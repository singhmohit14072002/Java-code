package com.Mohit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Q: take input of two number print the sum
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
