package main.java.algorithm.baekjun.Class.level2.solved.Pro18111;

//2022-08-06 11:27~ 원본
// 마인크래프트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_0 {

    static int B;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        B = Integer.parseInt(stringTokenizer.nextToken());

        int max = -1;
        int min = 257;

        int[][] ground = new int[N][M];

        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < M; j++) {
                int a = Integer.parseInt(stringTokenizer.nextToken());
//                System.out.println(a);
                max = Math.max(max, a);
                min = Math.min(min, a);
                ground[i][j] = a;
            }
        }
//        for (int i = 0; i < ground.length; i++) {
//            System.out.println(Arrays.toString(ground[i]));
//        }
        int answer = -1;
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
        if(min!=max){
            List<Integer> list = new ArrayList<>();
            List<Integer> heights = new ArrayList<>();
            while(min<=max){
                int time = 0;
                int b = B;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if(time>=0){
                            if(max>ground[i][j]){
                                if(b>=max-ground[i][j]){
//                                System.out.println("i = " + i);
//                                System.out.println("j = " + j);
//                                System.out.println(time + " : time");
//                                System.out.println("max = " + max);
//                                System.out.println("=======11111=====");
                                    b-=max-ground[i][j];
                                    time+=max-ground[i][j];
                                }else{
//                                System.out.println("i = " + i);
//                                System.out.println("j = " + j);
//                                System.out.println(time + " : time");
//                                System.out.println("max = " + max);
//                                System.out.println("======222222======");
                                    time=-1;
                                }
                            }else if(max<ground[i][j]){
//                            System.out.println("i = " + i);
//                            System.out.println("j = " + j);
//                            System.out.println(time + " : time");
//                            System.out.println("max = " + max);
//                            System.out.println("======33333333======");
                                b+=ground[i][j]-max;
                                time+=2*(ground[i][j]-max);

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

    public static void work (int[][] arr, int height, int b){

    }
}
