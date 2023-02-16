
package main.java.algorithm.boj.stepByStep.step12_sort;

// 2022-07-26 시도

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro9_10814 {

    //나이순 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());  // 회원 수

        List<List<Object>> list = new ArrayList<>();
        int[] ages = new int[N];
        int[] names = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            List<Object> mini = new ArrayList<>();
            int age = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken();
            mini.add(age);
            mini.add(i);
            mini.add(name);
            list.add(mini);
        }

        for (int i = 0; i < list.size(); i++) {

        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
