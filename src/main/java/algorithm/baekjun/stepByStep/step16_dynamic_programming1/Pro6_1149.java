package main.java.algorithm.baekjun.stepByStep.step16_dynamic_programming1;

// 2022-07-31 10:17~
// RGB 거리

import java.io.*;
import java.util.StringTokenizer;

public class Pro6_1149 {

    public static long[] arr;


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
//        System.out.println(T + ": T");
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        arr = new long[T];

        long max = -1001;
        long realMax = -1001;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(stringTokenizer.nextToken());

            arr[i] = N;

        }

        stringBuilder.append(realMax);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }






}
