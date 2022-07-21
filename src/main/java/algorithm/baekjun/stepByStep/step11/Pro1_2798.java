package main.java.algorithm.baekjun.stepByStep.step11;

// 2022-03-21 시작

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Pro1_2798 {

    public static void main(String[] args) throws IOException {

        // 블랙잭
        // 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓느다.
        // 딜러가 숫자 M을 크게 외친다.

        // N장의 카드 중 3장의 카드 고름
        // 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가까워야 함

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 카드의 개수
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 3장의 합이 M을 넘지 않아야 함

        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(stringTokenizer1.nextToken()));
        }

        list.sort(Comparator.naturalOrder());

        List<Integer> sum = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                for (int k = j+1; k < list.size(); k++) {
                    sum.add(list.get(i)+list.get(j)+list.get(k));
                }
            }
        }

        sum.sort(Comparator.naturalOrder());

        int result=0;

        for (int i = M; i > 0; i--) {
            if(sum.get(sum.size()-1)>M){
                sum.remove(sum.size()-1);
            }else if(sum.get(sum.size()-1)<=M){
                result = sum.get(sum.size()-1);
                break;
            }
        }

        stringBuilder.append(String.valueOf(result));

        bufferedWriter.write(String.valueOf(stringBuilder));


        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();



    }

}
