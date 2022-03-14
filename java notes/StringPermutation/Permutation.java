package com.company.string;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {

// permutationList("" , "abc");
        ArrayList<String> ans = permutationList("", "abc");
        System.out.println(ans);
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {  // base condition for that String
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));


        }
    }

    // to tanking array list

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();// base condition for that String
            list.add(p);
            return list;

        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationList(first + ch + second, up.substring(1)));


        }

        return ans;
    }
}
