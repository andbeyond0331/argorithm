package main.java.algorithm.boj.stepByStep.step22_binarySearch;

// 2022-07-30 09:40~
// 가장 증가하는 부분 수열2 - todo 이건 꼭 내 힘만으로 풀어보자

import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Pro7_12015 {

    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        long N = Integer.parseInt(bufferedReader.readLine());

        Set<Long> set = new TreeSet<>();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < N; i++) {
            set.add(Long.valueOf(stringTokenizer.nextToken()));
        }

        if(N == 1){
            stringBuilder.append(0);
        }else{
            if(set.size()==2){
                stringBuilder.append(1);
            }else{
                stringBuilder.append(set.size());

            }


        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }


}
