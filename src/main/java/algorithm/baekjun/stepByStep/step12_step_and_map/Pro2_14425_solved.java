package main.java.algorithm.baekjun.stepByStep.step12_step_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pro2_14425_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer firstLine = new StringTokenizer(bufferedReader.readLine()," ");
        int N = Integer.parseInt(firstLine.nextToken());
        int M = Integer.parseInt(firstLine.nextToken());

        Set<String> nSet = new LinkedHashSet<>();
        Set<String> mSet = new LinkedHashSet<>();
        for (int i = 0; i < N; i++) {
            nSet.add(bufferedReader.readLine());
        }
        int count = 0;
        for (int i = 0; i < M; i++) {
            if(nSet.contains(bufferedReader.readLine())){
                count++;
            }
        }

        System.out.println(count);
    }
}
