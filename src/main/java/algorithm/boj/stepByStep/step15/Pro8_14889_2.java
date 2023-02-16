package main.java.algorithm.boj.stepByStep.step15;

// 2022-08-04 14:23~
// 백트래킹  : 스타트와 링크 재재도전 - todo 내일 아침 다시

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro8_14889_2 {

    static int[][] player;

    static boolean[] visited;
    static int min = 38001;
    static int N;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        player = new int[N][N];

        visited = new boolean[N];


        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                player[i][j] = Integer.parseInt(stringTokenizer.nextToken());

            }
        }

        dfs(0, 0, 0);
        System.out.println(min);

    }

    public static void dfs(int num, int idx, int linkIdx){

    }

}