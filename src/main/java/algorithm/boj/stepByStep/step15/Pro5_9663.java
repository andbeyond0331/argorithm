package main.java.algorithm.boj.stepByStep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro5_9663 {

    public static int[][] arr;
    public static boolean[][] placed;
    public static int[][] vec;


    public static StringBuilder sb = new StringBuilder();

    public static final int depthLimit = 15;

    public static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        placed = new boolean[15][15];
//        vec = new int[N][2];


        dfs(N, 0, 0, 0);
        System.out.println(sb);

    }

    public static void dfs(int N, int x, int y, int depth) {
        if (depth == N) {
            count++;

            return;
        }

        for (depth = 0; depth < N; depth++) {

            horse(depth, x, y);

        }
    }

    static void horse(int N, int x, int y){

        for (int i = 0; i < depthLimit; i++) {
            for (int j = 0; j < depthLimit; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if(i!=arr[k][0] && j!=arr[k][1] && Math.abs(arr[k][1]-j)!=Math.abs(arr[k][0]-i)){
                        if(placed[i][j]==false){
                            placed[i][j] = true;
                            arr[N][0] = i;
                            arr[N][1] = j;
                            horse(N + 1, x + 1, y + 1);

                        }
                    }
                }
            }
        }
    }
}
