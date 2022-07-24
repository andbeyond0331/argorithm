package main.java.algorithm.baekjun.stepByStep.step11;

// 2022-03-21 시작 - 실패
// 2022-07-22 재도전

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Pro4_1018_1 {

    public static int min = 64;
//    public static int N;

    public static boolean[][] arr;

    public static void main(String[] args) throws IOException {

        // 체스판 다시 칠하기

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String temp = bufferedReader.readLine();

            for (int j = 0; j < M; j++) {
                if(temp.charAt(j) == 'B'){
                    arr[i][j] = false;
                }else{
                    arr[i][j] = true;
                }
            }
        }

        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                dfs(i,j);
            }
        }

        System.out.println(Math.abs(min));




    }

    static void dfs(int num, int idx){

        boolean color = arr[num][idx];
        int count = 0;

        for (int i = num; i < num+8; i++) {
            for (int j = idx; j < idx+8; j++) {
                if(arr[i][j] != color){
                    count++;
                }
                color = (!color);
            }
            color = (!color);
        }


        count = Math.min(count, 64-count);

        min = Math.min(min, count);
    }



}
