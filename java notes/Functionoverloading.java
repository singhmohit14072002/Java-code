package com.Mohit;

public class Functionoverloading {
    public static void main(String[] args) {


        // function overloading : when two or more  function having same name is function overloading
        // name can be same but argument should be different

        fun(45);
        fun("kunal");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);

    }
}
