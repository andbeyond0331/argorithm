package main.java.algorithm.baekjun.stepByStep.step15;

// 전에 풀었지만 백트래킹 공부 처음부터 다시 하기 위해 다시 푼다.
// N과 M(4)
// 2022-08-04 10:37~10:42 성공!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro4_15652_1_solved {

    public static int[] arr;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];


        dfs(N, M, 0);
        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth) {
        if(M==depth){
            for (int item: arr
                 ) {
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if(depth==0){
                arr[depth] = i+1;
                dfs(N, M, depth+1);
            }else{
                if(i+1>=arr[depth-1]){
                    arr[depth] = i+1;
                    dfs(N, M, depth+1);
                }
            }
        }
        return;
    }
}
