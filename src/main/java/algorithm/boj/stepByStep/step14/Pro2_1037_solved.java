package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-20 시작

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Pro2_1037_solved {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int amount = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            list.add(temp);
        }
        list.sort(Comparator.naturalOrder());

        bufferedWriter.write(String.valueOf(list.get(0)*list.get(list.size()-1)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
