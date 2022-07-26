package main.java.algorithm.baekjun.stepByStep.step9_geometry;

import java.io.*;

// 2022-03-17 도전 - 모르겠음 
// TO: 2022-03-17 문제 이해하기 22/07/25 해결
// 2022-07-25 재도전 - 해결

public class Pro10_3053_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int R = Integer.parseInt(bufferedReader.readLine());

        double pi = Math.PI;
        double euclid = pi*(double)R*(double)R;
        double taxi = ((double)2*(double)R)*((double)2*(double)R)/(double)2;

        stringBuilder.append(euclid).append("\n");
        stringBuilder.append(taxi).append("\n");

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();






    }
}
