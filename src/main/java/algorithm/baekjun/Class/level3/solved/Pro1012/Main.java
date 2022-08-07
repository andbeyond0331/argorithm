package main.java.algorithm.baekjun.Class.level3.solved.Pro1012;

// 2022-08-06 16:56~17:43 성공!
// 유기농 배추

import java.io.*;
import java.util.StringTokenizer;

public class Main {

//    static boolean[][] visited;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine());
            M = Integer.parseInt(stringTokenizer.nextToken());
            N = Integer.parseInt(stringTokenizer.nextToken());
            int K = Integer.parseInt(stringTokenizer.nextToken());
            int[][] field = new int[M][N];
//            visited = new boolean[M][N];
            for (int j = 0; j < K; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int x = Integer.parseInt(stringTokenizer.nextToken());
                int y = Integer.parseInt(stringTokenizer.nextToken());
                field[x][y] = 1;
            }
            int count = 0;
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(field[j][k]==1){

                        napa(field, j,k);
                        count++;
                    }

                }
            }
            stringBuilder.append(count).append("\n");





        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
//        System.out.println(stringBuilder);
    }

    static void napa(int[][] f, int x, int y){
        if(y<0 || x<0 || x==M || y==N){
            return;
        }

        if(f[x][y] == 1){
            f[x][y] = 0;
            napa(f, x, y-1);
            napa(f, x-1, y);
            napa(f, x+1, y);
            napa(f, x, y+1);

//            if(!visited[x][y]){
//                visited[x][y] = true;
//
//            }else{
//                return;
//            }
        }else{
            return;
        }


    }

}
