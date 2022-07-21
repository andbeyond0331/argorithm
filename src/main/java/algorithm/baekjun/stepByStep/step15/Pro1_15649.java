package main.java.algorithm.baekjun.stepByStep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1_15649 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {

                if(i%j==0){
                    sum+=j;
                }
            }
        }

        System.out.println(sum);

    }
}
