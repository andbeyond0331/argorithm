package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2022 - 07 - 25 갑자기 다시 풀어보기

public class Pro1_10872_1 {

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());



        System.out.println(Main(n));



    }

    public static int Main(int n) {
        if(n == 0){
            return 1;
        }else if(n == 1){
            return n*1;
        }else{
            return n*Main(n-1);
        }
    }


}
