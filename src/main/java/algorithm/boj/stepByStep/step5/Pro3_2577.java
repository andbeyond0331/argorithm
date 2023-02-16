package main.java.algorithm.boj.stepByStep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro3_2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int[] arr = new int[3];

        int mul = 1;

        for (int i = 0; i <3; i++) {

            arr[i] = Integer.parseInt( bufferedReader.readLine() );
            mul *= arr[i];
        }

        String mulString = String.valueOf(mul);

        String[] strings = mulString.split("");

        for (int i = 0; i < 10; i++) {

            int count = 0;

            for(int j = 0; j < strings.length; j++ ){

                if (String.valueOf(i).equals(strings[j])){
                    count++;
                }

            }

            System.out.println(count);

        }



    }
}
