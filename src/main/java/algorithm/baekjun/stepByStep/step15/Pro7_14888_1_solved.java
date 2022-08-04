package main.java.algorithm.baekjun.stepByStep.step15;

// 전에 풀었지만 백트래킹 공부 처음부터 다시 하기 위해 다시 푼다.
// 연산자 끼워넣기
// 2022-08-04 13:48~14:22 성공

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro7_14888_1_solved {

    static int N;
    static int[] numbers;
    static int[] pmmd = new int[4];

    static int min = 1000000001;
    static int max = -1000000001;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer =new StringTokenizer(br.readLine(), " ");

        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(br.readLine(), " ");
        pmmd[0] = Integer.parseInt(stringTokenizer.nextToken());
        pmmd[1] = Integer.parseInt(stringTokenizer.nextToken());
        pmmd[2] = Integer.parseInt(stringTokenizer.nextToken());
        pmmd[3] = Integer.parseInt(stringTokenizer.nextToken());

        dfs(numbers[0], 1);
        System.out.println(max);
        System.out.println(min);

    }

    public static void dfs(int num, int idx){
        if(idx==N){
            max = Math.max(max, num);
            min = Math.min(min, num);
//            System.out.println("num = " + num + ", idx = " + idx);
//            System.out.println("min = " + min);
//            System.out.println("max = " + max);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if(pmmd[i]>0){
                pmmd[i]--;
                switch(i) {
                    case 0:
                        dfs(num + numbers[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - numbers[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * numbers[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / numbers[idx], idx + 1);
                        break;
                }
                pmmd[i]++;

            }
        }
    }



}
