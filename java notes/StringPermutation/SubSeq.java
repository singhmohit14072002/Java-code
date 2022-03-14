package com.company.string;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {

        subseq("" , "abc");
        System.out.println(subret("" , "abc"));

    }
    static void subseq(String p, String up){
        if (up.isEmpty()){  // base condition for that String
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));
    }

    // using ArrayList

    static ArrayList<String> subret(String p, String up){
        if (up.isEmpty()){  // base condition for that String
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

      ArrayList<String> left =  subret(p,up.substring(1));
        ArrayList<String> right = subret(p+ch,up.substring(1));

        left.addAll(right);
        return left;
    }


}
