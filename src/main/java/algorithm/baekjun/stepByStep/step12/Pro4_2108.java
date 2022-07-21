package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-03-22 시작

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pro4_2108 {

    // 통계학
    // 수를 처리하는 것은 통계학에서 상당히 중요한 일이다.
    // 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다.
    // 단, N은 홀수라고 가정하자.
    //
    //산술평균 : N개의 수들의 합을 N으로 나눈 값
    //중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    //최빈값 : N개의 수들 중 가장 많이 나타나는 값
    //범위 : N개의 수들 중 최댓값과 최솟값의 차이

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine()); // 숫자 개수

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        list.sort(Comparator.naturalOrder());

        StringBuilder stringBuilder = new StringBuilder();

        // 산술평균
        int avg = 0; // 첫째자리에서 반올림
        float avgDou = 0.0F;

        for (int i = 0; i < list.size(); i++) {
            avgDou+=(float)list.get(i);
        }
        avgDou=avgDou/(float)N;
        avg = Math.round(avgDou);
        // 중앙값
        int middle = list.get(N/2);
        // 최빈값
        int often = 0;
        // 범위
        int range = list.get(N-1)-list.get(0);

        List<Integer> mid = new ArrayList<>();//중복제거
        for (int i = 0; i < list.size(); i++) {
            if(!mid.contains(list.get(i))){
                mid.add(list.get(i));
            }
        }

        int[][] count = new int[mid.size()][2]; // 최빈값을 위한 count
        for (int i = 0; i < mid.size(); i++) {
            int countElement = 0;
            for (int j = 0; j < list.size(); j++) {
                if(mid.get(i)==list.get(j)){
                    countElement++;
                }
            }

            count[i][0] = mid.get(i);
            count[i][1] = countElement;
        }

        List<int[]> oftenElements = new ArrayList<>();

        int oftenCount = 1;
        int oftenElement = 1;

        for (int i = 0; i < count.length; i++) {
            if(count[i][1]>oftenElement){
                int[] input = {count[i][0], count[i][1]};
                oftenElements.add(input);
            }else if(count[i][1]==oftenElement && count[i][1]!=1){
                int[] input = {count[i][0], count[i][1]};
                oftenElements.add(input);
                oftenCount++;
            }
        }

        System.out.println("oftenElements.size() : " + oftenElements.size());
        for (int i = 0; i < oftenElements.size(); i++) {
            System.out.println(i+"번째 : " + oftenElements.get(i)[0] + "," + oftenElements.get(i)[1]);
        }

        if(oftenElements.size()==1){
            often = oftenElements.get(0)[0];
        }else if(oftenElements.size()>1){
            often = oftenElements.get(1)[0];
        }else if(oftenElements.size()==0) {
            often = mid.get(1);
        }else{
            System.out.println("뭔가 문제가 있음");
        }

        stringBuilder.append(avg).append("\n");
        stringBuilder.append(middle).append("\n");
        stringBuilder.append(often).append("\n");
        stringBuilder.append(range);









        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();


    }
}
