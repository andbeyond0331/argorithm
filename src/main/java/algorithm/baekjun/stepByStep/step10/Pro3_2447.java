package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro3_2447 {

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Main(N));

    }

    public static int Main(int n){


        return Main(n-1);
    }


}
