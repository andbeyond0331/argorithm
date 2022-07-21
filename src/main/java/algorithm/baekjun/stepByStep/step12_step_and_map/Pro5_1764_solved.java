package main.java.algorithm.baekjun.stepByStep.step12_step_and_map;

import java.io.*;
import java.util.*;

public class Pro5_1764_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int N = Integer.parseInt(stringTokenizer.nextToken()); //듣도 못한 사람
        int M = Integer.parseInt(stringTokenizer.nextToken()); //보도 못한 사람

        Set<String> nhieh = new TreeSet<>();
        Set<String> nhies = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            nhieh.add(bufferedReader.readLine());
        }
        for (int i = 0; i < M; i++) {
            String temp = bufferedReader.readLine();
            nhies.add(temp);
            if(!nhieh.contains(temp)){
                nhieh.remove(temp);
            }

        }


        Iterator<String> iterator = nhieh.iterator();

        StringBuffer stringBuffer = new StringBuffer();


        while(iterator.hasNext()) {
            String temp = iterator.next();
            if(!nhies.contains(temp)){
                iterator.remove();
                nhieh.remove(temp);
            }
        }
        Iterator<String> iterator1 = nhieh.iterator();

        stringBuffer.append(nhieh.size()).append("\n");
        while(iterator1.hasNext()){
            stringBuffer.append(iterator1.next()).append("\n");
        }


        bufferedWriter.write(String.valueOf(stringBuffer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
