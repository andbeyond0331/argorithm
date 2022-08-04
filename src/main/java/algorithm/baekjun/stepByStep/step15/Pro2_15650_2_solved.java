package main.java.algorithm.baekjun.stepByStep.step15;

// 전에 풀었지만 백트래킹 공부 처음부터 다시 하기 위해 다시 푼다.
// N과 M(2)
// 2022-08-04 10:01~10:25

import java.io.*;
import java.util.StringTokenizer;

public class Pro2_15650_2_solved {


    static StringBuilder stringBuilder;

    static boolean[] visited;
    static int[] arr;


    public static void main (String [] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringBuilder = new StringBuilder();

        visited = new boolean[N];
        arr = new int[M];

        dfs(N, M, 0);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();






    }

    public static void dfs(int N, int M, int depth){
        if(depth==M){
            for (int item:arr) {
                stringBuilder.append(item).append(" ");
            }
            stringBuilder.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                visited[i] = true;
                if(depth==0){
                    arr[depth] = i+1;
                    dfs(N, M, depth+1);

                }else{
                    if(i+1>arr[depth-1]){
                        arr[depth] = i+1;
                        dfs(N, M, depth+1);
                    }

                }
                visited[i] = false;

            }
        }
        return;

    }


}
