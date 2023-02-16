package main.java.algorithm.boj.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro6_2775_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine()); //테스트 케이스 수

        for (int i = 0; i < T; i++) {

            int k = Integer.parseInt(bufferedReader.readLine()); // 층수
            int n = Integer.parseInt(bufferedReader.readLine()); // 호수 // result == k층 n호에는 몇 명이 사는가

            // 0층 n호 -> for문으로 n까지 합
            // 1층 n호 ->

            int count = 0;
            int[] arr = new int[n];
            for (int j = 0; j <= k; j++) {


                if(j==0){
                    for (int l = 0; l < arr.length; l++) {
                        arr[l] = l+1;
                        System.out.println("0층 " + l + "호 : " + (l+1) + "명");
                    }
                }else{
                    for (int l = 1; l <= n; l++) {
                        if(l!=1){
                            arr[l-1] += arr[l-2];
                            System.out.println(j+"층 " + (l-1) + "호 : " + arr[l-1] + "명");
                        }
                    }
                }


            }

            System.out.println(arr[n-1]);
        }

        bufferedReader.close();


    }
}
