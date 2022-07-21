package main.java.algorithm.baekjun.stepByStep.step17;

//2022-04-12 시간 초과 해결 버전 시작

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Pro6_17298_1 {

    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer stringBuffer = new StringBuffer();
        
        int N = Integer.parseInt(bufferedReader.readLine());



        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        }


        Stack<Integer> stack = new Stack();
        for (int i = 0; i < list.size(); i++) {


            while(!stack.empty() && list.get(stack.peek()) < list.get(i)){

                list.set(stack.pop(), list.get(i));

            }

            stack.push(i);



        }

        while(!stack.empty()){
            list.set(stack.pop(), -1);
        }

        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i)).append(" ");
        }

            bufferedWriter.write(String.valueOf(stringBuffer));
            bufferedWriter.flush();
            bufferedWriter.close();





        bufferedReader.close();

        


    }

}
