package main.java.algorithm.baekjun.stepByStep.step9;

import java.io.*;
import java.util.StringTokenizer;

// 2022-03-17 도전

public class Pro7_1085 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");

        int[] arr = new int[4];

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        arr[0] = x;
        arr[1] = y;
        arr[2] = w-x;
        arr[3] = h-y;

        int result = 1000;

        for (int i = 0; i < arr.length; i++) {

            if(result > arr[i]){
                result = arr[i];
            }

        }

        stringBuilder.append(String.valueOf(result));





        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
