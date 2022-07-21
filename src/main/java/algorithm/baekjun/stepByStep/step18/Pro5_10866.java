package main.java.algorithm.baekjun.stepByStep.step18;

//2022-04-18 시작 - 완료

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Pro5_10866 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            String first = stringTokenizer.nextToken();
            if(first.equals("push_front")){
                int number = Integer.parseInt(stringTokenizer.nextToken());
                deque.addFirst(number);
            }else if(first.equals("push_back")){
                int number = Integer.parseInt(stringTokenizer.nextToken());
                deque.addLast(number);
            }else if(first.equals("pop_front")){
                if(deque.size()!=0){
                    System.out.println(deque.pollFirst());
                }else{
                    System.out.println(-1);
                }
            }else if(first.equals("pop_back")){
                if(deque.size()!=0){
                    System.out.println(deque.pollLast());
                }else{
                    System.out.println(-1);
                }
            } else if (first.equals("size")) {
                System.out.println(deque.size());
            } else if(first.equals("empty")){
                if(deque.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(first.equals("front")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.peekFirst());
                }
            }else if(first.equals("back")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.peekLast());
                }
            }
        }

        bufferedReader.close();

    }


}
