package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-21

import java.io.*;
import java.util.StringTokenizer;

public class Pro10_9375 {

    static int[][] dp;


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < T; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());

            dp = new int[M + 1][N + 1];

            stringBuilder.append(BC(M , N)).append("\n");

        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    static int BC (int n, int m){

        if(dp[n][m] > 0){
            return dp[n][m];
        }

        if( m == n || m == 0 ){
            return dp[n][m] = 1;
        }

        return dp[n][m] = (BC( n-1, m - 1) + BC( n - 1, m));
    }
}
