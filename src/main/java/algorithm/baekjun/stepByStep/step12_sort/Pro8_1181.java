
package main.java.algorithm.baekjun.stepByStep.step12_sort;

// 2022-03-22 시작 -미완

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Pro8_1181 {

    //단어 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String word = bufferedReader.readLine();
            if(!words.contains(word)){
                words.add(word);
            }
        }
        List<String> wordsLength = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
//            if()
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedReader.close();


    }
}
