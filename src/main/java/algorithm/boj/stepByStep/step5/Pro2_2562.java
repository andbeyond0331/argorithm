package main.java.algorithm.boj.stepByStep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2_2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int[] arr = new int[9];

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {

            arr[i] = Integer.parseInt(bufferedReader.readLine());

        }

        for (int i = 0; i < 9; i++) {

            if ( arr[i] > max ) {
                max = arr[i] ;
                index = i+1;
            }

        }


        System.out.println(max+"\n" + index);




    }

}
