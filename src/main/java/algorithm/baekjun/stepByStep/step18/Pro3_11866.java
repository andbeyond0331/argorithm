package main.java.algorithm.baekjun.stepByStep.step18;

//2022-04-12 - 시작 - 끝

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pro3_11866 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out) );

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("<");


        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {
            queue.add(i);
        }

        while(queue.size()>1){




            for (int i = K; i > 0; i--) {
                if(i == 1){
                    stringBuffer.append(queue.poll()).append(", ");
                }else{
                    queue.add(queue.poll());
                }
            }

        }

        if(queue.size()==1){
            stringBuffer.append(queue.poll()).append(">");
        }





        bufferedWriter.write(String.valueOf(stringBuffer));
        bufferedWriter.flush();
        bufferedWriter.close();

        bufferedReader.close();

    }


}
