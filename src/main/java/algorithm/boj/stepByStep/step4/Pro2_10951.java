package main.java.algorithm.boj.stepByStep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2_10951 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while( (line = br.readLine()) != null ){

            int A = Integer.parseInt(line.substring(0,line.indexOf(" ")));
            int B = Integer.parseInt(line.substring(line.indexOf(" ")+1));

            System.out.println(A+B);

        }

    }

}
