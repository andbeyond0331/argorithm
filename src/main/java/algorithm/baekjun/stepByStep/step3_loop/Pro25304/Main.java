package main.java.algorithm.baekjun.stepByStep.step3_loop.Pro25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            count+=a*b;
        }
        if(count!=X){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
