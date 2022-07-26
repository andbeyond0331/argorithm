package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2022-07-25 갑자기 다시 풀어보기

public class Pro2_10870_1 {

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int a = 0;
        int b = 1;



        System.out.println(Main(n, a, b));



    }

    public static int Main(int n, int a, int b){
        if(n==0){
            return 0;
        }else if(n==1) {
            return b;
        }else{
                return Main(n-1, b, a+b);

        }
    }


}
