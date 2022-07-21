package main.java.algorithm.baekjun.stepByStep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1_10818 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int N = Integer.parseInt( br.readLine() );

        String str = br.readLine();

        String[] strArr = str.split(" ");

        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {

            intArr[i] = Integer.parseInt( strArr[i] );

        }

        int max = -1000001;
        int min = 1000001;

        for (int i = 0; i < intArr.length; i++) {

            if ( intArr[i] < min) {
                min = intArr[i];
            }
            if ( intArr[i] > max ) {
                max = intArr[i];
            }

        }

        System.out.println( min + " " + max);

    }

}
