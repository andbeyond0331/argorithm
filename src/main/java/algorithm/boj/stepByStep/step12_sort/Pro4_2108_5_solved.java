package main.java.algorithm.boj.stepByStep.step12_sort;

//// 2022-07-25 재재시도 - 시간초과 - 드디어 맞음..

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pro4_2108_5_solved {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));



        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
//        int[] ints = new int[N];
//        int idx = 0;
        int sum = 0;

        int[] numbers = new int[8001]; // 수
        int count = 0; // 최대 개수

        List<Integer> mostList = new ArrayList<>(); // 최빈값 구하기 위한 list
        List<Integer> sortList = new ArrayList<>(); // 순서 구하기 위한 list

        if(N==1){
            int temp = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(temp).append("\n");
            stringBuilder.append(temp).append("\n");
            stringBuilder.append(temp).append("\n");
            stringBuilder.append(0);
        }else{
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(bufferedReader.readLine());
                sum+=temp;

                numbers[temp+4000]++;
                if(numbers[temp+4000]>count){
                    count = numbers[temp+4000];
                }

                sortList.add(temp);

                
            }
            for (int i = 0; i < sortList.size(); i++) {
                System.out.println("sortList : " + sortList.get(i));
            }
            sortList.sort(Comparator.naturalOrder());

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]==count){
                    System.out.println("numbers["+i+"] : " + count);
                    mostList.add(i-4000);
                }
            }
            mostList.sort(Comparator.naturalOrder());

            int avg  = 0;


            if((double)sum/(double)N >=0){
                avg = (int) Math.round((double)sum/(double)N);
            }else{
                avg = (int) Math.round((double)sum/(double)N);
            }

            int amount = 0;

            if(mostList.size()>1){
                amount = mostList.get(1);
            }else{
                amount = mostList.get(0);
            }




            stringBuilder.append(avg).append("\n");
            stringBuilder.append(sortList.get(N/2)).append("\n");
            stringBuilder.append(amount).append("\n");
            stringBuilder.append(sortList.get(sortList.size()-1)-sortList.get(0));



        }


        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();







    }
}
