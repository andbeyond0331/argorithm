package main.java.algorithm.baekjun.stepByStep.step18_greedy;

// 2022-07-29 08:55~09:20 좀 생각하고 풀기 ㅠㅠ 그래도 성공!
// ATM

import java.io.*;
import java.util.StringTokenizer;

public class Pro3_11399_solved {

    public static int[] sorted;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[N];

        sorted = new int[N];
        int count = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        divide(nums, 0, N-1);
//        count+=sorted[0];
        if(N==1){
            count+=nums[0];
        }else{
            for (int i = N; i > 0; i--) {
                count+=i*(sorted[N-i]);
            }
        }



        stringBuilder.append(count);


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void divide(int[] arr, int left, int right){
        if(left==right){
            return;
        }

        int mid = (left+right)/2;

        divide(arr, left, mid);
        divide(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){
            if(arr[l]<arr[r]){
                sorted[idx] = arr[l];
                l++;
                idx++;
            }else if(arr[l]==arr[r]){
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
        if(l>mid){
            while(r<=right){
                sorted[idx] = arr[r];
                r++;
                idx++;
            }
        }else{
            while(l<=mid){
                sorted[idx] = arr[l];
                l++;
                idx++;
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }


    }
}
