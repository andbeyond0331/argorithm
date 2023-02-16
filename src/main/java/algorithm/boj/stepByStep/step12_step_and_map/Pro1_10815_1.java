package main.java.algorithm.boj.stepByStep.step12_step_and_map;
//시간초과 해결 ver -> 해결 못함

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro1_10815_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer stringBuffer = new StringBuffer();

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        List<Integer> sgCards = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            sgCards.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(stringTokenizer1.nextToken());
            if(sgCards.contains(temp)){
                stringBuffer.append(1).append(" ");
            }else{
                stringBuffer.append(0).append(" ");

            }
        }
//
        bufferedWriter.write(String.valueOf(stringBuffer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
