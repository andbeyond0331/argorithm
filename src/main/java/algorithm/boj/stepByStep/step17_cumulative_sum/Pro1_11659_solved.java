package main.java.algorithm.boj.stepByStep.step17_cumulative_sum;

//2022-08-04 15:42~16:05 간단한건데 이상한 곳에서 헤맴 ㅠㅠ 그래도 성공
// 구간 합 구하기 4

import java.io.*;
import java.util.StringTokenizer;

public class Pro1_11659_solved {

    static int[] nNums;
    static int[] prefixSum;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        nNums = new int[N];
        prefixSum = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nNums[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(i == 0){
                prefixSum[i] = nNums[i];
            }else{
                prefixSum[i] = prefixSum[i-1]+nNums[i];
            }
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int sum = 0;
            if(a!=1){

                sum = prefixSum[b-1]-prefixSum[a-2];
            }else{
                sum = prefixSum[b-1];
            }
            stringBuilder.append(sum).append("\n");
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
