package main.java.algorithm.boj.stepByStep.step12_step_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Pro3_1620_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer firstLine = new StringTokenizer(bufferedReader.readLine()," ");
        int N = Integer.parseInt(firstLine.nextToken()); //포켓몬 마릿수
        int M = Integer.parseInt(firstLine.nextToken()); //문제 갯수

        Map<String, String> numPok = new HashMap<>();
        Map<String, String> pokNum = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String pokemon = bufferedReader.readLine();
            numPok.put(String.valueOf(i+1), pokemon);
            pokNum.put(pokemon, String.valueOf(i+1));
        }
        for (int i = 0; i < M; i++) {
            String problem = bufferedReader.readLine();
            if('0'<=problem.charAt(0)&&'9'>=problem.charAt(0)){
                System.out.println(numPok.get(problem));
            }else{
                System.out.println(pokNum.get(problem));
            }
        }
    }
}
