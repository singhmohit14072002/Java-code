package com.Mohit;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //       int n = in.nextInt();
//        boolean ans = isPrime(n);
//        System.out.println(ans);


//        System.out.println(isArmstrong(n));
        for (int i = 100; i<1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }

        }
    }
    //Q; PRINT ALL 3 DIGITS ARMSTRONG NUMBER

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10 ;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }
         return sum == original;
        }


    //Q:print prime or not
    static boolean isPrime(int n){
      if (n <= 1){
          return false;
      }
      int c = 2;
      while (c * c <= n) {
          if (n % c == 0) {
              return false;
          }
          c++;
      }
      if (c * c > n){
          return true;
      }
      return false;
    }
}
