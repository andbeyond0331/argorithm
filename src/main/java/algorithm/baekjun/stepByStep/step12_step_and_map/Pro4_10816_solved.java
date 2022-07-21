package main.java.algorithm.baekjun.stepByStep.step12_step_and_map;

import java.io.*;
import java.util.*;

public class Pro4_10816_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer stringBuffer = new StringBuffer();

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        Map<Integer,Integer> sgCards = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            if(sgCards.containsKey(temp)){
                int count = sgCards.get(temp);

                sgCards.replace(temp, count+1);

            }else{
                sgCards.put(temp,1);
            }

        }

        int M = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(stringTokenizer1.nextToken());
            if(sgCards.containsKey(temp)){
                stringBuffer.append(sgCards.get(temp)).append(" ");
            }else{
                stringBuffer.append(0).append(" ");
            }
        }
        bufferedWriter.write(String.valueOf(stringBuffer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
