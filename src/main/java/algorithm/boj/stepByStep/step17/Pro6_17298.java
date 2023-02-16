package main.java.algorithm.boj.stepByStep.step17;

//2022-04-11 시작 -  2022-04-12 시간 초과 버전 완

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Pro6_17298 {

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



        for (int i = 0; i < list.size(); i++) {
            Stack<Integer> stack = new Stack();

            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) < list.get(j)){
                    stack.push(j);
                    break;
                }

            }
            if(stack.size()!=0 && list.get(i)<list.get(stack.peek())){

                list.set(i,list.get(stack.pop()));
            }else if(stack.size()==0){
                list.set(i,-1);
            }

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
