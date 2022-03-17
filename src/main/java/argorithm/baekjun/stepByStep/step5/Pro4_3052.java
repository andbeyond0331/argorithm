package main.java.argorithm.baekjun.stepByStep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pro4_3052 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            System.out.println("arr["+i+"] : " + arr[i]);
            System.out.println("arr["+i+"]%42 : " + arr[i]%42);

        }

        List remainders = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if(!remainders.contains((arr[i]%42))){

                remainders.add((arr[i]%42));
            }
        }
        for (int i = 0; i < remainders.size(); i++) {
            System.out.println("in for loop : " + remainders.get(i));
        }

        System.out.println(remainders.size());

        bufferedReader.close();
    }
}
