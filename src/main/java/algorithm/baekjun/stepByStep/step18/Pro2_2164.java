package main.java.algorithm.baekjun.stepByStep.step18;

//2022-04-12 - 시작 - 완

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pro2_2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out) );

        StringBuffer stringBuffer = new StringBuffer();

        int N = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {
            queue.add(i);
        }

        while(queue.size() > 1){

            if(queue.size()==2){
                queue.poll();
            }else {
                queue.poll();
                queue.add(queue.poll());
            }

        }

        if(queue.size()==1){
            stringBuffer.append(queue.poll());
        }else{
            System.out.println("Something's wrong!");
        }





        bufferedWriter.write(String.valueOf(stringBuffer));
        bufferedWriter.flush();
        bufferedWriter.close();

        bufferedReader.close();

    }


}
