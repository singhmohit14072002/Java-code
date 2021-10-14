package com.Mohit;

public class Shadowing {
    static int x = 90; // this will be shadowing at line 8
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // the class variable at line 4 is shadowed by this
        // scope will begin when value is initialised
        System.out.println(x); // 40
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}