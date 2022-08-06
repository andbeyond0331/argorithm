package main.java.algorithm.baekjun.Class.level2.Pro10845;

//2022-08-06 09:43~
// 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int temp = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
            String a = stringTokenizer.nextToken();
            if(a.equals("push")){
                int temper = Integer.parseInt(stringTokenizer.nextToken());
                temp = temper;
                queue.add(temper);
            }else if(a.equals("pop")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(queue.poll());
                }
            }else if(a.equals("size")){
                System.out.println(queue.size());
            }else if(a.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(a.equals("front")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{

                    System.out.println(queue.peek());
                }
            }else if(a.equals("back")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(temp);
                }
            }

        }
    }
}
