
package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-07-26 시도 - 시간초과

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Pro10_18870 {

    //좌표 압축

    public static int[] sorted;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[N];
        sorted = new int[N];
        List<Integer> list2 = new ArrayList<>();


        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            nums[i] = temp;
            list2.add(temp);
        }



        divide(nums, 0, N-1);

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < sorted.length; i++) {
            if(!list.contains(sorted[i])){
                list.add(sorted[i]);

            }
        }

        for (int i = 0; i < nums.length; i++) {

            stringBuilder.append(list.indexOf(list2.get(i))).append(" ");
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void divide(int[] nums, int left, int right){

        if( left == right){
            return;
        }
        int mid = (left+right)/2;

        divide(nums, left, mid);
        divide(nums, mid+1, right);
        merge(nums, left, mid, right);

    }

    public static void merge(int[] nums, int left, int mid, int right){

        int l = left;
        int r = mid+1;
        int idx = left;


        while( l<= mid && r <= right){

            if(nums[l]<=nums[r]){

                sorted[idx] = nums[l];
                l++;
                idx++;
            }else {
                sorted[idx] = nums[r];
                r++;
                idx++;
            }

        }
        if(l>mid){
            while(r<=right){
                sorted[idx] = nums[r];
                r++;
                idx++;
            }
        }else{
            while(l<=mid){
                sorted[idx] = nums[l];
                l++;
                idx++;
            }
        }

        for (int i = left; i <=right ; i++) {
            nums[i] = sorted[i];
        }


    }


}
