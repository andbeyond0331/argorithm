
package main.java.algorithm.baekjun.stepByStep.step12_sort;

// 2022-07-26 시도 - 시간초과 해결 ver - 실패
//  2022-07-27 재시도 - 병합 정렬도 실패라니... to:do 다시 시도하기

import java.io.*;
import java.util.*;

public class Pro10_18870_2 {

    public static int[] sorted;

    //좌표 압축

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        List<Integer> list2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();


        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < N; i++) {

            int temp = Integer.parseInt(stringTokenizer.nextToken());
            if(!list.contains(temp)){
                list.add(temp);
            }
            list2.add(temp);
        }
        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }

        sorted = new int[newArr.length];

        divide(newArr, 0, newArr.length-1);

        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < sorted.length; i++) {
            list3.add(sorted[i]);
        }


        for (int i = 0; i < N; i++) {
            stringBuilder.append(list3.indexOf(list2.get(i))).append(" ");
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void divide(int[] arr, int left, int right){
        if(left==right){
            return;
        }
        int mid = (left + right) / 2;

        divide(arr, left, mid);
        divide(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){

        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r <= right){

            if(arr[l]<=arr[r]){
                sorted[idx] = arr[l];
                l++;
                idx++;
                sorted[idx] = arr[r];
                r++;
                idx++;
            }else {
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
            }else if(r>right){
                while(l<=mid){
                    sorted[idx] = arr[l];
                    l++;
                    idx++;
                }
            }

        }

        for (int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }



}
