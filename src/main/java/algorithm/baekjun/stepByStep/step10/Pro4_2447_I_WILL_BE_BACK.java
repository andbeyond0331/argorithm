package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// TO :DO: 2022-07-25 실력 키워서 다시 오쟈

public class Pro4_2447_I_WILL_BE_BACK {

    public static StringBuilder stringBuilder;
    public static int num;

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        num = N;

        System.out.println(Right(N));

    }

    public static int Right(int n){
        if(n==0){
            return 0;
        }


//        if(n)



        return Right(n-1);
    }

    public static int Down(int n ){

        return Down(n-1);
    }


}
