package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-21 - 머리 맑을 때 다시 시도
// TODO: 2022-07-21 머리 맑을 때 다시 시도 

import java.io.*;
import java.util.StringTokenizer;

public class Pro12_2004 {

    static int[][] dp;

    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        dp = new int[N + 1][M + 1];

        int forCount = BC( N , M);

        int answer = 0;


            if(forCount%125==0){
                answer = answer+3;
            }else if(forCount%25==0){
                answer = answer+2;
            }else if(forCount%5==0){
                answer++;
            }


        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    static int BC ( int n, int m ) {

        if(dp[ n ][ m ] > 0){
            return dp[ n ][ m ];
        }
        if(m == n || m == 0){
            return dp[ n ][ m ] = 1;
        }
        return dp[ n ][ m ] = BC(n - 1, m - 1) + BC(n - 1, m);
    }


}
