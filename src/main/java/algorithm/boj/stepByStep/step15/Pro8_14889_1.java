package main.java.algorithm.boj.stepByStep.step15;

// 2022-08-02 12:12~
// 백트래킹  : 스타트와 링크 재도전 - 실패 todo 백트래킹 공부 다시

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro8_14889_1 {

    public static int N;
    public static int[][] playersPower;
    public static int totalPower;
    public static boolean[] used;

    public static List<Integer> startPlayers;
    public static int gap;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        playersPower = new int[N][N];
        used = new boolean[N];
        gap = N*100;

        totalPower = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            used[i] = false;
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                playersPower[i][j] = temp;
                totalPower += temp;
            }
        }


    }

    public static void min(int idx){
        startPlayers = new ArrayList<>();
        startPlayers.add(0);






    }

    public static void power(int idx){

        // 인덱스가 마지막 위치에 도달하면 선수 모집 끝
        if(idx == N){
            return;
        }
        for (int i = 1; i < N; i++) {


        }
    }
}