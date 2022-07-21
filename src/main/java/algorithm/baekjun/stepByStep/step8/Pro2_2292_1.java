package main.java.algorithm.baekjun.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2_2292_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        long cell = Integer.parseInt(bufferedReader.readLine());

        long result = 1;
        long nums_pileup = 1;

        while(cell>nums_pileup){
            nums_pileup+= 6*result;
            result++;
        }


        System.out.println(result);


        bufferedReader.close();


    }
}
