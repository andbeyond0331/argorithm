package main.java.algorithm.baekjun.stepByStep.step18_greedy;

import java.io.*;
import java.util.StringTokenizer;

// 2022-07-28 14:23~15:16
// 회의실 배정

public class Pro3_11399 {

    public static int[][] times;
    public static int[][] sorted;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        times = new int[N][2];
        sorted = new int[N][2];
        int count = 1;
        int last = 0;

        for (int i = 0; i < N; i++) {


            StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");

            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            times[i][0] = start;
            times[i][1] = end;

        }
        divide(times, 0,N-1);
        last = sorted[0][1];
//        System.out.println("첫번째 끝나는 시간 : " + last);

        for (int i = 1; i < sorted.length; i++) {

            if(last <= sorted[i][0]){
//                System.out.println("last <= sorted["+i+"][0] : " +last+"<="+ sorted[i][0]);
                last = sorted[i][1];
                count++;
            }
        }

        stringBuilder.append(count);


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void divide(int[][] arr, int left, int right){
        if(left==right){
            return;
        }

        int mid = (left+right)/2;

        divide(arr, left, mid);
        divide(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[][] arr, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){
            if(arr[l][1]<arr[r][1]){
                sorted[idx] = arr[l];
                l++;
                idx++;
            }else if( arr[l][1]==arr[r][1]){
                sorted[idx] = arr[l];
                l++;
                idx++;
                sorted[idx] = arr[r];
                r++;
                idx++;
            }else{
                sorted[idx] = arr[r];
                r++;
                idx++;
            }

            if(l>mid){
                while(r<=right){
                    sorted[idx] = arr[r];
                    r++;
                    idx++;
                }
            }

            if(r>right){
                while(l<=mid){
                    sorted[idx] = arr[l];
                    l++;
                    idx++;
                }
            }
        }

        for (int i = left; i < right; i++) {
            arr[i] = sorted[i];
        }
    }
}
