package main.java.algorithm.boj.stepByStep.step15;

// 전에 풀었지만 백트래킹 공부 처음부터 다시 하기 위해 다시 푼다.
// N과 M(1)
// 2022-08-04 09:23~10:00 todo 이 개념 블로그에 정리하기!

import java.io.*;
import java.util.StringTokenizer;

public class Pro1_15649_1_solved {

    static boolean[] visited;
    static int[] arr;

    static int N;
    static int M;

    static StringBuilder stringBuilder;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        visited = new boolean[N];
        arr = new int[M];

        stringBuilder = new StringBuilder();

        dfs(N, M, 0);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();



    }

    public static void dfs(int n, int m, int depth){
        if(depth==M){
            for (int item : arr){
                stringBuilder.append(item).append(" ");
            }
            stringBuilder.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                dfs(n, m, depth+1);
                visited[i] = false;
            }
        }
        return;
    }




}
