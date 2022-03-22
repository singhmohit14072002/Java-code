package com.company.Questions;
 // dice problem asked by amazon,,,

public class Dice {
    public static void main(String[] args) {
        dice("" , 4);
    }

    static void dice (String p , int  target) {

        if(target == 0) { // base condition of the this
            System.out.println(p);
            return;
        }

        for (int i=1; i<=6 && i <=target; i++){
            dice(p+i, target-i);
        }
    }
}
