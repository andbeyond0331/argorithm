package main.java.algorithm.boj.stepByStep.step9_geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro3_11653 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        if(N!=1){
            for(int i=2; i<N+1; i++){
                while(N%i==0){
                    N/=i;
                    System.out.println(i);
                }
            }
        }


        bufferedReader.close();

    }
}
