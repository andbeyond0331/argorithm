package main.java.algorithm.baekjun.stepByStep.step22_binarySearch;

// 2022-07-29 11:02~11:17 쉬는 시간 12:11부터 다시 ~12:48
// 랜선 자르기 - 이분탐색 아닌 ver (시간 초과 뜸)

import java.io.*;
import java.util.StringTokenizer;

public class Pro3_1654 {

    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long K = Integer.parseInt(stringTokenizer.nextToken());
        long N = Integer.parseInt(stringTokenizer.nextToken());

        long sum = 0;
        long[] com = new long[(int) K];

        long result = 0;

        for (int i = 0; i < K; i++) {
            long temp = Integer.parseInt(bufferedReader.readLine());
            sum+=temp;
            com[i] = temp;

        }
        long stan = sum/N;
        System.out.println("stan = " + stan);

        for (long i = stan; i > 0; i--) {
            int temp = 0;
            for (int j = 0; j < K; j++) {
                temp+=com[j]/i;
                System.out.println("temp+=com["+j+"]/"+i+" : " +temp+"+="+com[j]/i);
            }
            if(temp>=N){
                result = i;
                break;
            }

        }

        stringBuilder.append(result);




        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
//    // k개의 숫자들 중 n 나눴을 때 합쳐서 N개 될 수 있는지 알아보는 함수
//    public static int can(int n){
//
//    }

}
