package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-21

import java.io.*;

public class Pro11_1676_solved {

    int[][] dp;

    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        int answer  = 0;

        for (int i = 1; i < N+1; i++) {
            if(i%125==0){
                answer = answer+3;
            }else if(i%25==0){
                answer = answer+2;
            }else if(i%5==0){
                answer++;
            }
        }

//        StringBuilder stringBuilder = new StringBuilder();





        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }


}
