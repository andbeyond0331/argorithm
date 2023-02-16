package main.java.algorithm.boj.stepByStep.step9_geometry;

import java.io.*;
import java.util.StringTokenizer;

// 2022-03-17 도전

public class Pro8_3009 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer first = new StringTokenizer(bufferedReader.readLine()," ");
        StringTokenizer second = new StringTokenizer(bufferedReader.readLine()," ");
        StringTokenizer third = new StringTokenizer(bufferedReader.readLine()," ");

        int[] xs = new int[3];
        int[] ys = new int[3];

        xs[0] = Integer.parseInt(first.nextToken());
        ys[0] = Integer.parseInt(first.nextToken());
        xs[1] = Integer.parseInt(second.nextToken());
        ys[1] = Integer.parseInt(second.nextToken());
        xs[2] = Integer.parseInt(third.nextToken());
        ys[2] = Integer.parseInt(third.nextToken());

        if(xs[0]==xs[1]){
            stringBuilder.append(String.valueOf(xs[2])).append(" ");
        }else if(xs[0]==xs[2]){
            stringBuilder.append(String.valueOf(xs[1])).append(" ");
        }else{
            stringBuilder.append(String.valueOf(xs[0])).append(" ");
        }

        if(ys[0]==ys[1]){
            stringBuilder.append(String.valueOf(ys[2]));
        }else if(ys[0]==ys[2]){
            stringBuilder.append(String.valueOf(ys[1]));
        }else{
            stringBuilder.append(String.valueOf(ys[0]));
        }





        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
