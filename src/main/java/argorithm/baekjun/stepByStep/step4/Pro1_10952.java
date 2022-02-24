package main.java.argorithm.baekjun.stepByStep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pro1_10952 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int A = Integer.parseInt(line.substring(0,line.indexOf(" ")));
        int B = Integer.parseInt(line.substring(line.indexOf(" ")+1));

        System.out.println(A+B);

        while((A*B)!=0){

            line = br.readLine();

            A = Integer.parseInt(line.substring(0,line.indexOf(" ")));
            B = Integer.parseInt(line.substring(line.indexOf(" ")+1));

            if((A*B)!=0){
                System.out.println(A+B);
            }

        }


    }
    
}
