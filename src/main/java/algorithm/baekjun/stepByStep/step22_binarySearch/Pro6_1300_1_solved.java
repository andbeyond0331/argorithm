package main.java.algorithm.baekjun.stepByStep.step22_binarySearch;

// 2022-07-30 08:11~09:38
// K번째 수
// ㅠㅠㅠㅠ 성공..

import java.io.*;

import static java.lang.Math.min;

public class Pro6_1300_1_solved {

    public static long[] sorted;


    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        long N = Integer.parseInt(bufferedReader.readLine());
        long K = Integer.parseInt(bufferedReader.readLine());

        long min = 1;
        long max = N*N;
        long mid;


        while(min<max){

            mid = (min + max) / 2;
            long count = 0;

            for (int i = 1; i <= N; i++) {
                count+= min(mid / i, N);
            }

            if(count >= K){
                max = mid;
            }else{
                min = mid+1;
            }


        }

        stringBuilder.append(min);




        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void divide(long[] longs, long left, long right){
        if(left==right){
            return;
        }

        long mid = (right + left) / 2;
        divide(longs, left, mid);
        divide(longs, mid+1, right);
        merge(longs, left, mid, right);
    }

    public static void merge(long[] longs, long left, long mid, long right){
        long l = left;
        long r = mid+1;
        long idx = left;

        while(l<=mid && r<=right){
            if(longs[(int)l]<longs[(int)r]){
                sorted[(int)idx] = longs[(int)l];
                l++;
                idx++;
            }else if(longs[(int)l]==longs[(int)r]){
                sorted[(int)idx] = longs[(int)l];
                l++;
                idx++;
                sorted[(int)idx] = longs[(int)r];
                r++;
                idx++;
            }else{
                sorted[(int)idx] = longs[(int)r];
                r++;
                idx++;
            }
        }
        if(l>mid){
            while(r<=right){
                sorted[(int)idx] = longs[(int)r];
                r++;
                idx++;
            }
        }else{
            while(l<=mid){
                sorted[(int)idx] = longs[(int)l];
                l++;
                idx++;
            }
        }
        for (int i = (int) left; i <= right; i++) {
            longs[i] = sorted[i];
        }
    }

}
