package main.java.algorithm.baekjun.stepByStep.step15;

// 2022-08-09 11:04~12:11 드디어 내 힘으로 성공!!!
// 백트래킹  : 스타트와 링크 재재재도전

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro8_14889_3 {

    static int[][] player;

    static boolean[] visited;
    static int min = 38001;
    static int N;
    static int[] arr;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        player = new int[N][N];
        visited = new boolean[N];
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                player[i][j] = Integer.parseInt(stringTokenizer.nextToken());

            }
        }

        dfs(0);
        System.out.println(min);

    }

    public static void dfs(int depth){
        if(min==0){
            return;
        }
        if(depth==N/2){
            int start = 0;
            int link = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(visited[i] && visited[j]){
                        start+=player[i][j];
                    }else if(!visited[i] && !visited[j]){
                        link +=player[i][j];
                    }
                }
            }
            min = Math.min(min, Math.abs(start-link));
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!visited[i]){
                if(depth==0){
                    arr[depth] = i+1;
                    visited[i] = true;

                    dfs(depth+1);
                }else{
                    if(i+1>arr[depth-1]){
                        arr[depth] = i+1;
                        visited[i] = true;

                        dfs(depth+1);
                    }

                }

                visited[i] = false;

            }
        }
    }



}