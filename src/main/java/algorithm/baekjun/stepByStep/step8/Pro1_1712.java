package main.java.algorithm.baekjun.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro1_1712 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");

        long[] arr = new long[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        double countLaptop = 0;
        if((arr[2]-arr[1])!=0){
            countLaptop = (double)arr[0]/(double)(arr[2]-arr[1]);
        }

        if( countLaptop <= 0 ) {
            System.out.println(-1);
        }else{

            System.out.println((long)countLaptop+1);
        }


        bufferedReader.close();


    }
}
