package main.java.algorithm.boj.Class.level3.Pro2579;

// 2022-08-06 19:02~19:15
// 계단 오르기 - todo 다음에 다시.. 나 왜이렇게 이런 문제가 안 풀리지..

import java.io.*;

public class Main {

    static boolean[] visited;
    static int T;
    static int max;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();


        T = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[T];
        visited = new boolean[T];
        max = -1;
        sum = 0;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bufferedReader.readLine());

            arr[i] = N;

        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    static void step(int a){
        if(a>T){
            return;
        }
        if(a==0){
            step(1);
            step(2);
        }
    }

}
