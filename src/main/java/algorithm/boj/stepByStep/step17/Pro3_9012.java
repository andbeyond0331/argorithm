package main.java.algorithm.boj.stepByStep.step17;

//2022-04-11 시작 - 완성했지만 스택으로 푸는 법 알아내기

import java.io.*;
import java.util.Stack;

public class Pro3_9012 {

    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer stringBuffer = new StringBuffer();


        int T = Integer.parseInt(bufferedReader.readLine());



        for (int i = 0; i < T; i++) {
            String answer = "";

            Stack<Long> stack = new Stack<>();

            String target = bufferedReader.readLine();
            int left = 0;
            int right = 0;

            for (int j = 0; j < target.length(); j++) {
                if(target.substring(j,j+1).equals("(")){
                    left++;
                }else{
                    right++;
                }

                if(left<right){
                    answer = "NO";
                    break;
                }else{
                    answer = "YES";
                }

                if(left!=right){
                    answer = "NO";
                }
            }



            stringBuffer.append(answer).append("\n");


        }

        bufferedWriter.write(String.valueOf(stringBuffer));

        bufferedWriter.flush();
        bufferedWriter.close();



        bufferedReader.close();

        


    }

}
