package main.java.algorithm.boj.stepByStep.step9_geometry;

// 2022-08-03 07:55~08:16 도전 - 첫 시도 : 출발점과 도착점이 같은 원 안에 있는 경우 고려하지 않아서 틀렸습니다. 두 번째 : 맞았습니다.
// le petit prince

import java.io.*;
import java.util.StringTokenizer;

public class Pro13_1004_solved {

    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {

            StringTokenizer startEnd = new StringTokenizer(bufferedReader.readLine(), " ");
            int[] start = {Integer.parseInt(startEnd.nextToken()), Integer.parseInt(startEnd.nextToken())};
            int[] end = {Integer.parseInt(startEnd.nextToken()), Integer.parseInt(startEnd.nextToken())};



            int n = Integer.parseInt(bufferedReader.readLine());
//            int[][] planets = new int[n][3];
            int count = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer planet = new StringTokenizer(bufferedReader.readLine());
                int x = Integer.parseInt(planet.nextToken());
                int y = Integer.parseInt(planet.nextToken());
                int r = Integer.parseInt(planet.nextToken());

                if(Math.abs(start[0]-x)*Math.abs(start[0]-x)+Math.abs(start[1]-y)*Math.abs(start[1]-y)<r*r){
                    if(Math.abs(end[0]-x)*Math.abs(end[0]-x)+Math.abs(end[1]-y)*Math.abs(end[1]-y)<r*r){

                    }else{
                        count++;
                    }
                }else if(Math.abs(end[0]-x)*Math.abs(end[0]-x)+Math.abs(end[1]-y)*Math.abs(end[1]-y)<r*r){
                    count++;
                }
            }

            stringBuilder.append(count).append("\n");



        }
        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
