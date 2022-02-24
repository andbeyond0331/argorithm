package main.java.argorithm.baekjun.stepByStep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro3_1110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int comN = N;
        int newInt = 0;
        int count = 0;

        if( comN == 0 ) {
            count++;
        }

        while ( newInt != N ) {


            if ( 0<comN && comN <10 ) {

                newInt = 10*comN + comN;
                comN = newInt;

            } else {

                newInt = comN%10*10 + (comN/10 + comN%10)%10;
                comN = newInt;

            }

            System.out.println("count : " + count + ", comN : " + comN + ", newInt : "  + newInt);

            count++;


        }

        System.out.println(count);

    }
}
