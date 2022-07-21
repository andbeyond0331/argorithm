package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-03-21 시작 메모리 초과 아닌 버전

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pro2_2751_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        list.sort(Comparator.naturalOrder());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i)).append("\n");
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();


    }
}
