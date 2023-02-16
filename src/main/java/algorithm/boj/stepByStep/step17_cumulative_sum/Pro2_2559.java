package main.java.algorithm.boj.stepByStep.step17_cumulative_sum;

//2022-08-04 16:06~16:18 가뿐했쥬?
// 수열

import java.io.*;
import java.util.StringTokenizer;

public class Pro2_2559 {

    static int[] nNums;
    static int[] prefixSum;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int max = -10000001;
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
            if(i==K-1){
                max = Math.max(max, prefixSum[i]);
            }else if(i>K){
                int temp = prefixSum[i]-prefixSum[i-K];
                max = Math.max(max, temp);
            }
        }
        stringBuilder.append(max);


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
