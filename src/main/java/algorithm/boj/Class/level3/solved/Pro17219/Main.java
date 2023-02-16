package main.java.algorithm.boj.Class.level3.solved.Pro17219;

// 2022-08-06 18:51~18:57 성공!
// 비밀번호 찾기

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();

        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
            map.put(stringTokenizer.nextToken(), stringTokenizer.nextToken());

        }
        for (int i = 0; i < M; i++) {
            String site = bufferedReader.readLine();
            stringBuilder.append(map.get(site)).append("\n");
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }


}
