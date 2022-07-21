package main.java.algorithm.baekjun.stepByStep.step12_step_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro1_10815_timeout {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        int[] sgCards = new int[N];

        for (int i = 0; i < N; i++) {
            sgCards[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(stringTokenizer1.nextToken());

            if(i<=M-2){

                int count = 0;
                for (int j = 0; j < sgCards.length; j++) {

                    if(sgCards[j]==temp){

                        System.out.print(1+" ");
                        count++;
                        break;
                    }

                }
                if(count==0){
                    System.out.print(0+" ");
                }

            }else{

                int count = 0;
                for (int j = 0; j < sgCards.length; j++) {
                    if(sgCards[j]==temp){

                        System.out.print(1);
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.print(0);
                }
            }
        }
    }
}
