package main.java.algorithm.boj.stepByStep.step22_binarySearch;

// 2022-07-29 12:48~13:50
// 랜선 자르기 - 이분탐색 ver (시간 초과 해결하기) - 실패 처음부터 다시하기(2에서)

import java.io.*;
import java.util.StringTokenizer;

public class Pro3_1654_1 {

    public static long amount;
    public static boolean flag;
    public static long result;

    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long K = Integer.parseInt(stringTokenizer.nextToken());
        long N = Integer.parseInt(stringTokenizer.nextToken());


        amount = 0;
        flag = false;

        long sum = 0;
        long[] com = new long[(int) K];

        result = 0;

        for (int i = 0; i < K; i++) {
            long temp = Integer.parseInt(bufferedReader.readLine());
            sum+=temp;
            com[i] = temp;

        }
        long stan = sum/N;

        if(K == 1){
            result = com[0];
        }else{

            can( com, N, 0, stan);
        }


        stringBuilder.append(result);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
    // k개의 숫자들 중 n 나눴을 때 합쳐서 N개 될 수 있는지 알아보는 함수
    public static void can( long[] com, long n, long left, long right) { //n == N, compare == stan
        long mid = (left+right)/2;
        if(left==right || mid==0){
            return;
        }
        if(flag(n, com, 0, mid, false)){

            can(com, n, mid+1, right);

        }else{
            can(com, n, left, mid);
        }
    }

    public static boolean flag(long n, long[] com, int idx, long mid, boolean fl){
        if(idx==com.length){
            amount=0;
            return fl;
        }
        amount += com[idx]/mid;
        idx++;
        if(amount>=n){
            amount=0;
            fl = true;
            result = mid;
            return fl;
        }
        return flag(n, com, idx, mid, fl);
    }
}
