package com.Mohit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int salary = 254000;
//        if (salary>10000){
//            salary = salary + 2000;
//        }else{
//            salary = salary + 1000;
//        }


//  multiple if-else statement

if (salary > 10000){
    salary =+ 2000;
}else if (salary > 20000){
    salary += 3000;
}else {
    salary += 1000;
}
        System.out.println(salary);
    }
}
