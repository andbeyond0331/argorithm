package main.java.algorithm.baekjun.Class.level2.solved.Pro18111;

//2022-08-06 12:53~13:09 땅 높이 순서대로 담기 - 성공!
// 마인크래프트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int B;
    static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        B = Integer.parseInt(stringTokenizer.nextToken());

        int max = -1;
        int min = 257;

        int[] ground = new int[N*M];
        sorted = new int[N*M];
        int ground_idx = 0;

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < M; j++) {
                int a = Integer.parseInt(stringTokenizer.nextToken());
//                System.out.println(a);
                max = Math.max(max, a);
                min = Math.min(min, a);
                ground[ground_idx++] = a;
            }
        }
        System.out.println("Arrays.toString(ground) = " + Arrays.toString(ground));

        divide(ground, 0, M*N-1);
        System.out.println("Arrays.toString(sorted) = " + Arrays.toString(sorted));
        int answer = -1;
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
        if(min!=max){
            List<Integer> list = new ArrayList<>();
            List<Integer> heights = new ArrayList<>();
            while(min<=max){
                int time = 0;
                int b = B;
                for (int i = N*M-1; i >=0; i--) {
                    if(time>=0){
                        if(max>sorted[i]){
                            if(b>=max-sorted[i]){
//                                System.out.println("i = " + i);
//                                System.out.println("j = " + j);
//                                System.out.println(time + " : time");
//                                System.out.println("max = " + max);
//                                System.out.println("=======11111=====");
                                b-=max-sorted[i];
                                time+=max-sorted[i];
                            }else{
//                                System.out.println("i = " + i);
//                                System.out.println("j = " + j);
//                                System.out.println(time + " : time");
//                                System.out.println("max = " + max);
//                                System.out.println("======222222======");
                                time=-1;
                            }
                        }else if(max<sorted[i]){
//                            System.out.println("i = " + i);
//                            System.out.println("j = " + j);
//                            System.out.println(time + " : time");
//                            System.out.println("max = " + max);
//                            System.out.println("======33333333======");
                            b+=sorted[i]-max;
                            time+=2*(sorted[i]-max);

                        }
                    }else{
//                        System.out.println("i = " + i);
//                        System.out.println("j = " + j);
//                        System.out.println(time + " : time");
//                        System.out.println("max = " + max);
//                        System.out.println("======444444======");
                        break;
                    }
                }
                if(time>=0){
                    list.add(time);
                    heights.add(max);
//                System.out.println("time = " + time);
//                System.out.println("max = " + max);
//                System.out.println("answer = " + answer);
                    if(answer==-1){
                        answer = time;
                    }else{

                        answer = Math.min(answer, time);
                    }

                }
                max--;


            }
            List<Integer> finalHeights = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==answer){
                    finalHeights.add(heights.get(i));
                }
            }
            finalHeights.sort(Comparator.reverseOrder());

            System.out.print(answer);
            System.out.print(" ");
            System.out.print(finalHeights.get(0));


        }else{
            System.out.print(0);
            System.out.print(" ");
            System.out.print(min);
        }



    }

    public static void divide (int[] arr, int left, int right){
        if(left==right){
            return;
        }
        int mid = (left+right)/2;
        divide(arr, left, mid);
        divide(arr, mid+1, right);
        merge(arr, left, mid, right);
    }
    static void merge(int[] arr, int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<=right){
            if(arr[l]>=arr[r]){
                sorted[idx] = arr[r];
                r++;
                idx++;
            }else{
                sorted[idx] = arr[l];
                l++;
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
        for (int i = left; i <= right ; i++) {
            arr[i] = sorted[i];
        }
    }
}
