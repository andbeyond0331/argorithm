package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-21

import java.io.*;
import java.util.*;

public class Pro10_9375_solved {

    static int[][] dp;


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < T; i++) {

            int n = Integer.parseInt(bufferedReader.readLine());

            Map<String, Integer> map = new LinkedHashMap<>(); // 의상 종류 , 인덱스

            Map<Integer, Integer> name = new LinkedHashMap<>(); // 인덱스, 수량

            int idx = 0;

            for (int j = 0; j < n; j++) {

                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

                String clothName = stringTokenizer.nextToken();
                String clothType = stringTokenizer.nextToken();

                if(name.isEmpty() || !map.containsKey(clothType)){
                    map.put(clothType, idx);
                    name.put(idx, 1);
                    idx++;
                }else if(map.containsKey(clothType)){
                    int temp = name.get(map.get(clothType));
                    name.replace(map.get(clothType),temp+1);
                }

            }
            int[] arr = new int[name.size()];

            for (String clothType: map.keySet()
                 ) {
                arr[map.get(clothType)] = name.get(map.get(clothType));
            }
            int answer = 1;

            for (int j = 0; j < arr.length; j++) {
                answer *= arr[j]+1;
            }

            stringBuilder.append(answer-1).append("\n");
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
