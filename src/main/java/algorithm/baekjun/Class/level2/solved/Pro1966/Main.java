package main.java.algorithm.baekjun.Class.level2.solved.Pro1966;

//2022-08-06 11:03~11:26
// 큐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            List<Integer> list = new ArrayList<>();
            int[] arr = new int[N];
            Queue<Integer> queue = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(stringTokenizer.nextToken());
                list.add(arr[j]);
                queue.add(arr[j]);
                if(j==M){
//                    System.out.println("confirm M : " + i);
                    queue.add(0);

                }
            }
            list.sort(Comparator.reverseOrder());
            int count = 0;
            while(!queue.isEmpty()){

                if(queue.peek()!=list.get(0)){

                    queue.add(queue.poll());
                }else{
                    list.remove(0);
//                    System.out.println("confirm : " + queue.poll());
                    queue.poll();
//                    if(queue.isEmpty()){
//
//                    }
                    count++;
                    if(queue.peek()==0){
                        System.out.println(count);
                        break;
                    }
                }
            }

        }

    }
}
