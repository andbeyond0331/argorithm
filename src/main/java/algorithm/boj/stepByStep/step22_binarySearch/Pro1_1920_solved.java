package main.java.algorithm.boj.stepByStep.step22_binarySearch;

// 2022-07-29 10:34~11:01 성공!
// 수 찾기

import java.io.*;
import java.util.StringTokenizer;

public class Pro1_1920_solved {

    public static int[] sorted;
    public static boolean temp;

    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();


        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer ns = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] field = new int[N];
        int M = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer ms = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] targets = new int[M];

        sorted = new int[N];

        for (int i = 0; i < N; i++) {
            field[i] = Integer.parseInt(ns.nextToken());
        }
        for (int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(ms.nextToken());
        }
        divide(field, 0, N-1);

        for (int i = 0; i < M; i++) {
            temp = false;
            BS(sorted, targets[i], 0, sorted.length-1);

            if(temp){
                stringBuilder.append("1").append("\n");
                temp = !temp;
            }else{
                stringBuilder.append("0").append("\n");
            }

        }




        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void BS(int[] arr, int target, int left, int right){
        if(target==arr[left]){
            temp = true;
            return ;
        }
        if(left==right){

            return;

        }
        int mid = (left+right)/2;
        if(arr[mid]==target){
            temp = true;
            return;
        }else if(arr[mid]<target){
            BS(arr, target, mid+1, right);
        }else{

            BS(arr, target, left, mid);
        }

    }

    public static void divide(int[] arr, int left, int right){
        if(left == right){
            return;
        }
        int mid = (left+right)/2;

        divide(arr, left, mid);
        divide(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid , int right){
        int l = left;
        int r = mid+1;
        int idx =left;

        while(l<=mid && r<=right){
            if(arr[l]<arr[r]){
                sorted[idx] = arr[l];
                l++;
                idx++;
            }else if(arr[l] == arr[r]){
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
        }
        if(r>right){
            while(l<=mid){
                sorted[idx] = arr[l];
                l++;
                idx++;
            }
        }else{
            while(r<=right){
                sorted[idx] = arr[r];
                r++;
                idx++;
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }
}
