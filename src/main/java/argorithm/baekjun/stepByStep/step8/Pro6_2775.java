package main.java.argorithm.baekjun.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro6_2775 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {

            int k = Integer.parseInt(bufferedReader.readLine()); // 층수
            int n = Integer.parseInt(bufferedReader.readLine()); // 호수

            int count = 0;
            int[] arr = new int[n];

            for (int j = 1; j < n+1; j++) {
                arr[j-1] = j;
            }

            for (int j = 1; j < k+1; j++) { //층수

                for (int l = 2; l < n; l++) { //호수
                    arr[l] += l;
                    System.out.println("j : " + j + ", l : " + l + ", arr[l] : "+arr[l]);
                }
            }
        }

        bufferedReader.close();


    }
}
