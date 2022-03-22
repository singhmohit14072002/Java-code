package com.company.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

      //  System.out.println(count(3,3));
     //   path("" , 3, 3);
      //  System.out.println(pathRet("",3,3));

        boolean[][] board = {

                {true,true,true},
                {true,false,true},
                {true,true,true}

        };

        pathRestrictions("",board,0,0);

    }
    static int count(int r, int c) { // taking row amd colum

        if (r ==1 || c == 1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r,c-1);

        return left + right;

    }

    // path till down in maze
   static void path(String p, int r , int c) {
     // base condition when  and c become 1 just peint it
       if (r ==1 && c == 1){
           System.out.println(p);
           return;
       }
       if (r > 1) {
           path(p+'D', r-1, c);
       }
       if (c > 1) {
           path(p+'R', r, c-1);
       }
   }
 //  now doing same thing using array list

    static ArrayList<String> pathRet(String p, int r , int c) {
        // base condition when  and c become 1 just peint it
        if (r ==1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
           list.addAll( pathRet(p+'D', r-1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p+'R', r, c-1));
          }
        return list;
    }

 //  for diagonal
    static ArrayList<String> pathRetDiagonal(String p, int r , int c) {
        // base condition when  and c become 1 just p0int it
        if (r ==1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c> 1) {
            list.addAll(pathRetDiagonal(p+'D', r-1, c-1));
        }

        if (r > 1 ) {
            list.addAll(pathRetDiagonal(p+'v', r-1, c));
        }
        if (c > 1) {
            list.addAll(pathRetDiagonal(p+'h', r, c-1));
        }
        return list;
    }

    //  Q.2  Maze with obstacles

    static void pathRestrictions(String p, boolean[][] maze ,int r , int c) {
        // base condition when  and c become 1 just point it
        if (r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r < maze.length-1) {
            pathRestrictions(p+'D', maze,r+1, c);
        }
        if (c < maze[0].length-1) {
            pathRestrictions(p+'R',maze, r, c+1);
        }
    }



}
