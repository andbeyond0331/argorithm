package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-20 시간 초과 ( 1차 시도 )

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pro5_2981_timeout {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

         int N = Integer.parseInt(bufferedReader.readLine());
         List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(bufferedReader.readLine()));
        }

        nums.sort(Comparator.naturalOrder());

        for (int i = 2; i < nums.get(nums.size()-1)/2; i++) {
            int temp = 0;
            for (int j = 0; j < nums.size(); j++) {
                if(j==0){

                    temp = nums.get(j)%i;
                }else if (j==nums.size()-1 && nums.get(j)%i==temp){
                    sb.append(i).append(" ");
                }else{
                    if(nums.get(j)%i!=temp){
                        break;
                    }
                }

            }
        }



        bufferedWriter.write(String.valueOf(sb));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
