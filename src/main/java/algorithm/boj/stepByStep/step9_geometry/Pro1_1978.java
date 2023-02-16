package main.java.algorithm.boj.stepByStep.step9_geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1_1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int amount = Integer.parseInt(bufferedReader.readLine());

        int result = 0;

        String[] strings = bufferedReader.readLine().split(" ");

        int[] ints = new int[strings.length];

        int index = 0;
        for (String num: strings
             ) {

            ints[index] = Integer.parseInt(num);
            index++;

        }

        for (int nums:ints
             ) {
            int count = 0;
            for (int i = 1; i < nums+1; i++) {
                if(nums%i==0){
                    count++;
                }
            }
            if(count==2){
                result++;
            }
        }

        System.out.println(result);

        bufferedReader.close();

    }
}
