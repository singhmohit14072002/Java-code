package com.Mohit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Q: Describe fruit
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("king of mango");
//            case "Apple" -> System.out.println("A sweet red fruit");
//           case "orange" -> System.out.println("round fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please entre a  valid fruit");
//        }

        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("please entre valid date ");
                break;
        }


    }
}
