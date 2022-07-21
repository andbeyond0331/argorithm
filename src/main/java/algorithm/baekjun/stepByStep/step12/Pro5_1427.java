
package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-03-22 시작 - 해결

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pro5_1427 {

    //소트 인사이드


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = bufferedReader.readLine().split("");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            nums.add(Integer.parseInt(strings[i]));
        }
        nums.sort(Comparator.naturalOrder());

        for (int i = nums.size()-1; i >=0; i--) {
            stringBuilder.append(nums.get(i));
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();


    }
}
