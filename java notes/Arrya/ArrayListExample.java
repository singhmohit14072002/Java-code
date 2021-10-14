package com.Mohit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//
//        list.add(67);
//        list.add(85);
//        list.add(877);
//
//
//        System.out.println(list.contains(67)); // check list is present or not
//
//         list.set(0,99); // update
//        list.remove(2); // if we want to remove the list
//
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here syntax index will not work here

        }
        System.out.println(list);
    }
}
