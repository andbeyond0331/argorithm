package main.java.algorithm.boj.stepByStep.step15;

// 전에 풀었지만 백트래킹 공부 처음부터 다시 하기 위해 다시 푼다.
// 스도쿠
// 2022-08-04 12:16~13:47 어렵다..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro6_2580_1_solved {

    static int[][] puzzle = new int[9][9];
    static StringBuilder stringBuilder = new StringBuilder();
    static int[] cols = new int[9];
    static int[] rows = new int[9];
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                puzzle[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if(puzzle[i][j]==0){
                    cols[i]++;
                    rows[j]++;
                    count++;
                }
            }
        }
        dfs(0,0);




    }

    public static void dfs(int x, int y) {
        if(y == 9){
            dfs(x+1, 0);
            return;
        }
        if(x == 9){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(String.valueOf(puzzle[i][j])+" ");
                }
                System.out.print("\n");
            }
            System.exit(0);
        }

        if(puzzle[x][y]==0){
            for (int i = 1; i <= 9; i++) {
                if(in(x,y,i)){
                    puzzle[x][y]=i;
                    dfs(x,y+1);
                }
            }
            puzzle[x][y]=0;
            return;
        }
        dfs(x,y+1);

    }

    public static boolean in(int x, int y, int num){

        for (int i = 0; i < 9; i++) {
            if(puzzle[x][i]==num){
                return false;
            }
            if(puzzle[i][y]==num){
                return false;
            }
        }
        int x1 = (x/3)*3;
        int y1 = (y/3)*3;

        for (int i = x1; i < x1+3; i++) {
            for (int j = y1; j < y1+3; j++) {
                if(puzzle[i][j]==num){
                    return false;
                }
            }

        }


        return true;
    }

}
