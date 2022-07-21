package main.java.algorithm.baekjun.stepByStep.step17;

//2022-04-11 시작 - 완

import java.io.*;
import java.util.Stack;

public class Pro5_1874 {

    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer stringBuffer = new StringBuffer();
        
        int n = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> stack = new Stack();

        int start = 0;


        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(bufferedReader.readLine());

            if(number > start){
                for (int j = start + 1; j <= number; j++) {
                    stack.push(j);
                    stringBuffer.append("+").append("\n");


                }
                start = number;
            }else if( stack.peek() != number ){
                System.out.println("NO");
                return;
            }
            stack.pop();
            stringBuffer.append("-").append("\n");




        }

            bufferedWriter.write(String.valueOf(stringBuffer));
            bufferedWriter.flush();
            bufferedWriter.close();





        bufferedReader.close();

        


    }

}
