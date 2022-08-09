package main.java.algorithm.baekjun.stepByStep.step12_sort;

//// 2022-07-25 재시도 - 시간초과

import java.io.*;
import java.util.*;

public class Pro4_2108_4 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));



        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] ints = new int[N];
        int idx = 0;
        int sum = 0;

        int[] numbers = new int[8001]; // 수
        int count = 0; // 최대 개수

        List<Integer> list = new ArrayList<>(); // 최빈값 구하기 위한 list

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

                if(idx==0){
                    ints[0] = temp;
                }else{
                    for (int j = idx-1; j >=0 ; j--) {
                        if(temp>=ints[j]){

                            ints[j+1]=temp;
                            break;
                        }else{
                            ints[j+1] = ints[j];
                            ints[j] = temp;
                        }
                    }
                }
                idx++;
            }
            for (int i = 0; i < ints.length; i++) {
                System.out.println("ints : " + ints[i]);
            }

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]==count){
                    System.out.println("numbers["+i+"] : " + count);
                    list.add(i-4000);
                }
            }
            list.sort(Comparator.naturalOrder());

            int avg  = 0;

            if(sum/N >=0){
                avg = sum/N;
            }else{
                avg = sum/N-1;
            }

            int amount = 0;

            if(list.size()>1){
                amount = list.get(1);
            }else{
                amount = list.get(0);
            }




            stringBuilder.append(avg).append("\n");
            stringBuilder.append(ints[N/2]).append("\n");
            stringBuilder.append(amount).append("\n");
            stringBuilder.append(ints[ints.length-1]-ints[0]);



        }


        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();







    }
}
