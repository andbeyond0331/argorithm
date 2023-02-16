package main.java.algorithm.boj.stepByStep.step21_divide_and_conquer;

// 행렬 곱셈
// 2022-08-05 12:30~12:57 분할정복 이용 안 하고 성공

import java.io.*;
import java.util.StringTokenizer;

public class Pro6_2740_solved {

    static StringBuilder stringBuilder;
    static int[][] arr;
    static int[][] A;
    static int[][] B;


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        stringBuilder = new StringBuilder();
        
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        A = new int[N][M];

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        M = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        B = new int[M][K];
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        arr = new int[N][K];
        for (int j = 0; j < N; j++) {
            for (int k = 0; k < K; k++) {
                for (int i = 0; i < M; i++) {
                    arr[j][k] += (A[j][i] * B[i][k]);
                    System.out.println("A["+j+"]["+i+"] = " + A[j][i]);
                    System.out.println("B["+i+"]["+k+"] = " + B[i][k]);
                }
                System.out.println("arr["+j+"]["+k+"] = " + arr[j][k]);
                stringBuilder.append(arr[j][k]).append(" ");
            }
            stringBuilder.append("\n");
        }




        
        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();


    }

}
