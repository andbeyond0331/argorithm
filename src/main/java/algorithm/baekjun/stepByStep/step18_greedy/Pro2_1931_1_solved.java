package main.java.algorithm.baekjun.stepByStep.step18_greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2022-07-29 재시도 08:53 드디어 성공!!! 중간에 로직 살짝 오해해서 벌어진 일 ㅠㅠ 꼼꼼히 손코딩해보고 제출하기!
// 회의실 배정

public class Pro2_1931_1_solved {

    public static int[] starts;
    public static int[] ends;
    public static int[] sortedS;
    public static int[] sortedE;
    public static int[] sortedS2;
    public static int[] sortedE2;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        starts = new int[N];
        ends = new int[N];
        sortedS = new int[N];
        sortedE = new int[N];
        sortedS2 = new int[N];
        sortedE2 = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            starts[i]=Integer.parseInt(stringTokenizer.nextToken());
            ends[i]=Integer.parseInt(stringTokenizer.nextToken());
        }

        divide(starts, ends, 0, N-1);
        divide2(sortedS, sortedE, 0, N-1);
//
        System.out.println("sortedS : " + Arrays.toString(sortedS));
        System.out.println("sortedE : " + Arrays.toString(sortedE));
        System.out.println("sortedS2 : " + Arrays.toString(sortedS2));
        System.out.println("sortedE2 : " + Arrays.toString(sortedE2));

        int last = 0;
        int count = 0;

        for (int i = 0; i < sortedE2.length; i++) {
            if (last<=sortedS2[i]) {
                System.out.println("last<=sortedS2["+i+"] : " + last + "<=" + sortedS2[i]);
                last = sortedE2[i];
                count++;
            }
        }

        stringBuilder.append(count);



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void divide(int[] arrS, int[] arrE, int left, int right){
        if(left == right){
            return;
        }
        int mid = (left + right)/2;

        divide(arrS, arrE, left, mid);
        divide(arrS, arrE, mid+1, right);
        merge(arrS, arrE, left, mid, right);
    }

    public static void divide2(int[] arrS, int[] arrE, int left, int right){
        if(left == right){
            return;
        }
        int mid = (left + right)/2;

        divide2(arrS, arrE, left, mid);
        divide2(arrS, arrE, mid+1, right);
        merge2(arrS, arrE, left, mid, right);
    }

    public static void merge(int[] arrS, int[] arrE, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){

            if(arrE[l]<arrE[r]){
                sortedE[idx] = arrE[l];
                sortedS[idx] = arrS[l];
                l++;
                idx++;
            }else if( arrE[l] == arrE[r]){
                if(arrS[l]<arrS[r]){
                    sortedE[idx] = arrE[l];
                    sortedS[idx] = arrS[l];
                    l++;
                    idx++;
                }else{
                    sortedE[idx] = arrE[r];
                    sortedS[idx] = arrS[r];
                    r++;
                    idx++;
                }
            }else{
                sortedE[idx] = arrE[r];
                sortedS[idx] = arrS[r];
                r++;
                idx++;
            }
        }
        if(l>mid){
            while(r<=right){

                    sortedE[idx] = arrE[r];
                    sortedS[idx] = arrS[r];
                    r++;
                    idx++;


            }
        }else{
            while(l<=mid){
                if(l==mid){
                    sortedE[idx] = arrE[l];
                    sortedS[idx] = arrS[l];
                    l++;
                    idx++;
                }else{

                        sortedE[idx] = arrE[l];
                        sortedS[idx] = arrS[l];
                        l++;
                        idx++;

                }

            }
        }

        for (int i = left; i <= right; i++) {
            arrE[i] = sortedE[i];
            arrS[i] = sortedS[i];
        }
    }

    public static void merge2(int[] arrS, int[] arrE, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){

            if(arrE[l]<arrE[r]){
                sortedE2[idx] = arrE[l];
                sortedS2[idx] = arrS[l];
                l++;
                idx++;
            }else if( arrE[l] == arrE[r]){
                if(sortedS[l]<sortedS[r]){
                    sortedE2[idx] = arrE[l];
                    sortedS2[idx] = arrS[l];
                    l++;
                    idx++;
                }else{
                    sortedE2[idx] = arrE[r];
                    sortedS2[idx] = arrS[r];
                    r++;
                    idx++;
                }
            }else{
                sortedE2[idx] = arrE[r];
                sortedS2[idx] = arrS[r];
                r++;
                idx++;
            }
        }
        if(l>mid){
            while(r<=right){

                    sortedE2[idx] = arrE[r];
                    sortedS2[idx] = arrS[r];
                    r++;
                    idx++;


            }
        }else{
            while(l<=mid){

                    sortedE2[idx] = arrE[l];
                    sortedS2[idx] = arrS[l];
                    l++;
                    idx++;


            }
        }

        for (int i = left; i <= right; i++) {
            arrE[i] = sortedE2[i];
            arrS[i] = sortedS2[i];
        }
    }

}
