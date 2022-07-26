
package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-07-26 재시도 - 성공!

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pro8_1181_1_solved {

    //단어 정렬

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] count = new int[50];
        List<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String word = bufferedReader.readLine();
            if(!words.contains(word)){
                words.add(word);
            }
        }

        for (int i = 0; i < 50; i++) {
            List<String> temp =new ArrayList<>();

            for (int j = 0; j < words.size(); j++) {
                if(words.get(j).length()==i+1){
                    temp.add(words.get(j));
                }
            }
            temp.sort(Comparator.naturalOrder());
            for (int j = 0; j < temp.size(); j++) {
                stringBuilder.append(temp.get(j)).append("\n");
            }

        }



//        words.sort(Comparator.naturalOrder());
//
//        for (int i = 0; i < words.size(); i++) {
//            stringBuilder.append(words.get(i)).append("\n");
//        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
