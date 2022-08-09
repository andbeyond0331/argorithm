package main.java.algorithm.baekjun.stepByStep.step12_sort;

// 2022-03-22 시작

import java.io.*;

public class Pro3_10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N+1];
        int[] B = new int[N+1];


        int[] count = new int[10001];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        for (int i = 1; i <= N; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            A[i] = num;
            count[num]++;
        }

        int[] countSum = new int[10001];

        countSum[0] = count[0];
        for (int i = 1; i <=10000; i++) {
            countSum[i] = countSum[i-1]+count[i];
        }


        for (int i = N; i >= 1 ; i--) {
            B[countSum[A[i]]] = A[i];
            countSum[A[i]]--;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < B.length; i++) {
            stringBuilder.append(B[i]).append("\n");
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();


    }
}
