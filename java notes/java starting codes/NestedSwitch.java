package com.Mohit;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Mohit singh");
                break;
            case 2:
                System.out.println("Shivam Shah");
                break;
            case 3:
                System.out.println("Emp Number 3 ");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department entre");
                }
                break;
            default:
                System.out.println("entre a correct empID");

        }

    }
}
