package main.java.algorithm.baekjun.stepByStep.step12_sort;

// 2022-03-22 시간초과해결용

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pro4_2108_1 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        List<Integer> list = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();

        float avgDou = 0.0F;

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
            if(!mid.contains(list.get(i))){
                mid.add(list.get(i));
            }
            avgDou+=(float)list.get(i);
        }

        list.sort(Comparator.naturalOrder());
        mid.sort(Comparator.naturalOrder());

        StringBuilder stringBuilder = new StringBuilder();

        int avg = 0;

        avg = Math.round(avgDou/(float)N);

        int middle = list.get(N/2);

        int often = 0;

        int range = list.get(N-1)-list.get(0);

        if(mid.size()==list.size()){
            if(list.size()>1){
                often = list.get(1);
            }else{
                often = list.get(0);
            }
        }else{

            int[][] count = new int[mid.size()][2];
            List<int[]> oftenElements = new ArrayList<>();

            for (int i = 0; i < mid.size(); i++) {
                List shorter = list;
                shorter.removeAll(Collections.singleton(mid.get(i)));
                int countElement = list.size()-shorter.size();

                count[i][0] = mid.get(i);
                count[i][1] = countElement;
                if(countElement>1){
                    int[] input = {count[i][0], count[i][1]};
                    oftenElements.add(input);
                }else if(countElement==1 && count[i][1]!=1){
                    int[] input = {count[i][0], count[i][1]};
                    oftenElements.add(input);
                }
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
