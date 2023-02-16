
package main.java.algorithm.boj.stepByStep.step12_sort;

// 2022-03-22 시작 - 복잡해져서 다시

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Pro6_11650_1 {

    //좌표 정렬하기


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        Vector<int[]> vector = new Vector<>();
        StringTokenizer initial = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] initialXY = {Integer.parseInt(initial.nextToken()),Integer.parseInt(initial.nextToken())};
        vector.add(initialXY);
        System.out.println("0번째 : " + initialXY[0] + ", "+initialXY[1] );

        for (int i = 1; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int size = vector.size();
            int[] xy = {Integer.parseInt(stringTokenizer.nextToken()),Integer.parseInt(stringTokenizer.nextToken())};

            System.out.println(i+"번째 : " + xy[0] + " , " + xy[1]);
            for (int j = 0; j < size; j++) {
                if(size==1){
                    if(vector.get(0)[0]>xy[0]){
                        vector.add(0,xy);
                    }else if(vector.get(0)[0]==xy[0]){
                        if(vector.get(0)[1]>xy[1]){
                            vector.add(0,xy);
                        }else{
                            vector.add(xy);
                        }
                    }else{
                        vector.add(xy);
                    }
                }else{
                    if(vector.get(j)[0]>xy[0]){
                        vector.add(j,xy);
                        break;
                    }else if(vector.get(j)[0] == xy[0]){
                        if(vector.get(j)[1]>xy[1]){
                            vector.add(j,xy);
                            break;
                        }
                    }
                }
            }



        }
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(i+"aa : " + vector.get(i)[0]);
        }

        for (int i = 0; i < vector.size(); i++) {
            stringBuilder.append(vector.get(i)[0]).append(" ").append(vector.get(i)[1]).append("\n");

        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedReader.close();


    }
}
