package main.java.algorithm.boj.stepByStep.step18;

//2022-04-12 - 시작 - 완

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Pro1_18258 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out) );

        StringBuffer stringBuffer = new StringBuffer();

        int N = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int back = 0;

        for (int i = 0; i < N; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            String order = stringTokenizer.nextToken();

            if(order.equals("push")){
                int addTarget = Integer.parseInt(stringTokenizer.nextToken());
                queue.add(addTarget);
                back = addTarget;

            }else if(order.equals("pop")){
                if(queue.isEmpty()){
                    stringBuffer.append("-1").append("\n");
                }else{
                    stringBuffer.append(queue.poll()).append("\n");
                }
            }else if(order.equals("size")){
                stringBuffer.append(queue.size()).append("\n");
            }else if(order.equals("empty")){
                if(queue.isEmpty()){
                    stringBuffer.append(1).append("\n");
                }else{
                    stringBuffer.append(0).append("\n");
                }

            }else if(order.equals("front")){
                if(queue.isEmpty()){
                    stringBuffer.append(-1).append("\n");
                }else{

                    stringBuffer.append(queue.peek()).append("\n");
                }
            }else {
                if(queue.isEmpty()){
                    stringBuffer.append(-1).append("\n");
                }else{
                    stringBuffer.append(back).append("\n");
                }
            }

        }

        bufferedWriter.write(String.valueOf(stringBuffer));
        bufferedWriter.flush();
        bufferedWriter.close();

        bufferedReader.close();

    }


}
