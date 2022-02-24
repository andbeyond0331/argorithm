package main.java.argorithm.baekjun.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro4_2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        String[] strings = bufferedReader.readLine().split(" ");

        int A = Integer.parseInt(strings[0]);
        int B = Integer.parseInt(strings[1]);
        int V = Integer.parseInt(strings[2]);

        int day = 0;

        if(V>0){
            for (int i = 0; ; i++) {
                V-=A;
                if(V>0){
                    V+=B;
                }
                day++;
                if(V<=0){
                    break;
                }
            }
        }


        System.out.println(day);

        bufferedReader.close();


    }
}
