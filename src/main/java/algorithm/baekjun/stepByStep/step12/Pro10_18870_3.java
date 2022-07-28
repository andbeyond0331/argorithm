
package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-07-26 시도 - 시간초과 해결 ver - 실패
//  2022-07-27 재시도 - 병합 정렬도 실패라니...
//  2022-07-28 재재시도 걍 처음부터 다시 생각

import java.io.*;
import java.util.*;

public class Pro10_18870_3 {

    //좌표 압축

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        int[][] ints = new int[N][2];
        Set<Integer> set = new TreeSet<>();// 순서대로 중복 없이 원래 배열들을 넣어두기

        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            ints[i][0] = temp;
            ints[i][1] = -1;
            set.add(temp);
        }

        // ins에는 좌표,-1 원래 순서로 들어가 있음
        // set에는 중복 없이 순서대로 들어가 있음

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            int temp = it.next();

            for (int i = 0; i < ints.length; i++) {
                if(ints[i][0]==temp){
                    ints[i][1] = count;
                }
            }
            count++;
        }

        for (int i = 0; i < N; i++) {
            stringBuilder.append(ints[i][1]).append(" ");
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }





}
