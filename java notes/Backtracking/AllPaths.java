package com.company.Backtracking;

import java.util.Arrays;

import static com.company.Backtracking.Maze.pathRestrictions;

public class AllPaths {

    public static void main(String[] args) {



        boolean[][] board = {

                {true,true,true},
                {true,true,true},
                {true,true,true}

        };

       // allPaths("",board,0,0);
        int[][] path = new int[board.length][board[0].length];
        allPathsPrintMatrix("",board,0,0 , path,1);


    }
    // maze for all directions like right , down and up

    static void allPaths(String p, boolean[][] maze ,int r , int c) {
        // base condition when  and c become 1 just point it
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        // make a change

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            allPaths(p + 'U', maze, r - 1, c);
        }

        if (c > 0) {
            allPaths(p + 'L', maze, r, c - 1);
        }

        // this line is where the function will be over
        //so before the function gets removed , also remove the changes that were made by that function
        maze[r][c] = true;
        // reverse the change  that call is backtracking

    }

    // print the matrix and paths

    static void allPathsPrintMatrix(String p, boolean[][] maze ,int r , int c , int[][] path, int steps) {
        // base condition when  and c become 1 just point it
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            for (int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        // make a change

        maze[r][c] = false;
        path[r][c] = steps;

        if (r < maze.length - 1) {
            allPathsPrintMatrix(p + 'D', maze, r + 1, c , path, steps+1);

        }
        if (c < maze[0].length - 1) {
            allPathsPrintMatrix(p + 'R', maze, r, c + 1, path, steps+1);
        }

        if (r > 0) {
            allPathsPrintMatrix(p + 'U', maze, r - 1, c, path, steps+1);
        }

        if (c > 0) {
            allPathsPrintMatrix(p + 'L', maze, r, c - 1, path, steps+1);
        }

        // this line is where the function will be over
        //so before the function gets removed , also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
        // reverse the change  that call is backtracking

    }
}



