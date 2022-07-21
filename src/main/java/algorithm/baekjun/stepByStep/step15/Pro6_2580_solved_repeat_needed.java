package main.java.algorithm.baekjun.stepByStep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro6_2580_solved_repeat_needed {

    public static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[9][9];


        for (int i = 0; i < 9; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());

            }
        }


        dfs(0, 0);



    }

    public static void dfs(int x, int y) {
        if (y == 9) {
            dfs(x+1, 0);
            return;
        }
        if ( x == 9){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.exit(0);
        }
        if(arr[x][y]==0){
            for (int i = 1; i <= 9; i++) {
                if(horse(x,y,i)){
                    arr[x][y] = i;
                    dfs(x,y+1);
                }
            }
            arr[x][y] = 0;
            return;


        }
        dfs(x, y+1);


    }

    public static boolean horse(int x, int y, int value) {

        for (int i = 0; i < 9; i++) {
            if(arr[x][i] == value){
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if(arr[i][y] == value){
                return false;
            }
        }

        int divideX = (x/3)*3;
        int divideY = (y/3)*3;

        for (int i = divideX; i < divideX+3; i++) {
            for (int j = divideY; j < divideY + 3; j++) {
                if(arr[i][j] == value){
                    return false;
                }
            }
        }

        return true;
    }
}
