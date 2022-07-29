package main.java.algorithm.baekjun.stepByStep.step22_binarySearch;

// 2022-07-29 16:48~
// K번째 수

import java.io.*;

public class Pro6_1300 {

    public static long[] sorted;


    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        long N = Integer.parseInt(bufferedReader.readLine());
        long K = Integer.parseInt(bufferedReader.readLine());

        sorted = new long[(int)(N*N)];

        long[] B = new long[(int)(N*N)];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N ; j++) {
                B[(int)(N*(i-1)+j-1)] = i*j;
            }
        }

        divide(B, 0, N*N-1);

        stringBuilder.append(sorted[(int)(K-1)]);




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
