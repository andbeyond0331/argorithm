package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-21 - 2차 시도

// TODO: 2022-07-21 모듈러 /  동적 계획법 / 페르마의 소정리

import java.io.*;
import java.util.StringTokenizer;

public class Pro8_11051_1_solved_repeat_needed {

    static int[][] dp;

    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        dp = new int[N + 1][K + 1];

        int answer = BC(N,K);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    static int BC(int n, int k){

        if(dp[n][k] > 0){
            return dp[n][k];
        }

        if(k == 0 || k == n){
            return dp[n][k] = 1;
        }

        return dp[n][k] = (BC(n-1, k-1) + BC(n - 1, k))%10007;
    }
}