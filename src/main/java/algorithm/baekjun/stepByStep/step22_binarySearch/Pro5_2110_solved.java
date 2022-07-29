package main.java.algorithm.baekjun.stepByStep.step22_binarySearch;

// 2022-07-29 15:34~16:46 성공!!!
// 공유기 설치

import java.io.*;
import java.util.StringTokenizer;

public class Pro5_2110_solved {

    public static long[] sortedHouse;


    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long N = Integer.parseInt(stringTokenizer.nextToken()); // 집 개수
        long C = Integer.parseInt(stringTokenizer.nextToken()); // 공유기 개수

        long[] houses = new long[(int)N];
        sortedHouse = new long[(int)N];

        long result = 0;

        long totalDistance = 0;

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            houses[i] = temp;
            totalDistance += temp;
        }

        divide(houses, 0, N-1);

        long min = 1;
        long max = totalDistance;

        long mid = 0;

        while(min<max){
            mid = (min + max) / 2;

            int count = 0;

            int last = 0;

            for (int i = 0; i < sortedHouse.length; i++) {
                if(i == 0){
                    count++;
                }else{
                    if(sortedHouse[i]-sortedHouse[last]>=mid){
                        last = i;
                        count++;
                    }
                }
            }

            if(count<C){
                max = mid;

            }else{
                    min = mid+1;
                    result = mid;

            }
        }

        stringBuilder.append(result);


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
                sortedHouse[(int)idx] = longs[(int)l];
                l++;
                idx++;
            }else if(longs[(int)l]==longs[(int)r]){
                sortedHouse[(int)idx] = longs[(int)l];
                l++;
                idx++;
                sortedHouse[(int)idx] = longs[(int)r];
                r++;
                idx++;
            }else{
                sortedHouse[(int)idx] = longs[(int)r];
                r++;
                idx++;
            }
        }
        if(l>mid){
            while(r<=right){
                sortedHouse[(int)idx] = longs[(int)r];
                r++;
                idx++;
            }
        }else{
            while(l<=mid){
                sortedHouse[(int)idx] = longs[(int)l];
                l++;
                idx++;
            }
        }
        for (int i = (int) left; i <= right; i++) {
            longs[i] = sortedHouse[i];
        }
    }

}
