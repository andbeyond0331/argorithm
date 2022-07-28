package main.java.algorithm.baekjun.stepByStep.step18_greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 2022-07-28 14:23~16:31... 2시간 넘음 ㅠㅠ todo 내일 다시 보기
// 회의실 배정

public class Pro2_1931 {

    public static int[][] times;
    public static int[][] sorted;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        times = new int[N][2];
        sorted = new int[N][2];
        int count = 0;
        int last = 0;

        for (int i = 0; i < N; i++) {


            StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");

            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            times[i][0] = start;
            times[i][1] = end;

        }
//        divide(times, 0,N-1, 0);
//        for (int i = 0; i < sorted.length; i++) {
//            System.out.println("sorted i : " + i + ",  " + sorted[i][0] + ", "+ sorted[i][1] );
//        }
        divide(times, 0,N-1, 1);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println("sorted i : " + i + ",  " + sorted[i][0] + ", "+ sorted[i][1] );
        }
        System.out.println("첫번째 끝나는 시간 : " + last);

        for (int i = 0; i < sorted.length; i++) {

            if(last <= sorted[i][0]){
                System.out.println("last <= sorted["+i+"][0] : " +last+"<="+ sorted[i][0]);
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
    public static void forStart(int[][] arr, int number){
        if(number==arr.length-1){
            return;
        }
//        if()
    }

    public static void divide(int[][] arr, int left, int right, int start){
        if(left==right){
            return;
        }

        int mid = (left+right)/2;

        divide(arr, left, mid, start);
        divide(arr, mid+1, right, start);
        merge(arr, left, mid, right, start);
    }

    public static void merge(int[][] arr, int left, int mid, int right, int start){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){
            if(arr[l][start]<arr[r][start]){
                sorted[idx][0] = arr[l][0];
                sorted[idx][1] = arr[l][1];
                l++;
                idx++;
            }else if( arr[l][start]==arr[r][start]){

                if(arr[l][0]<arr[r][0]){
                    sorted[idx][0] = arr[l][0];
                    sorted[idx][1] = arr[l][1];
                    l++;
                    idx++;
                }else{
                    idx++;
                    sorted[idx][0] = arr[r][0];
                    sorted[idx][1] = arr[r][1];
                    r++;
                    idx++;

                }



//                if(arr[l][0]<arr[r][0]){
//
//                }else{
//                    idx++;
//                    sorted[idx][0] = arr[r][0];
//                    sorted[idx][1] = arr[r][1];
//                    r++;
//                    idx++;
//                    sorted[idx][0] = arr[l][0];
//                    sorted[idx][1] = arr[l][1];
//                    l++;
//                    idx++;
//
//                }

            }else{
                sorted[idx][0] = arr[r][0];
                sorted[idx][1] = arr[r][1];
                r++;
                idx++;
            }

        }
        if(l>mid){
            while(r<=right){
                sorted[idx][0] = arr[r][0];
                sorted[idx][1] = arr[r][1];
                r++;
                idx++;
            }
        }else{
            while(l<=mid){
                sorted[idx][0] = arr[l][0];
                sorted[idx][1] = arr[l][1];
                l++;
                idx++;
            }
        }

        for (int i = left; i <= right; i++) {
//            System.out.println("left = " + left);
//            System.out.println("right = " + right);
//            System.out.println("i = " + i);
//            System.out.println("["+i+"]["+0+"] : " + sorted[i][0]);
//            System.out.println("["+i+"]["+1+"] : " + sorted[i][1]);
            arr[i][0] = sorted[i][0];
            arr[i][1] = sorted[i][1];
        }
    }
}
