
package main.java.algorithm.boj.stepByStep.step12_sort;

// 2022-07-25 재시도

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro6_11650_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        List<Integer> xs = new ArrayList<>();
        List<Integer> ys = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            if(xs.isEmpty()){
                xs.add(x);
                ys.add(y);
            }else{
                for (int j = xs.size()-1; j >= 0; j--) {
                    if(xs.get(j)<=x){

                    }
                }

            }

        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedReader.close();


    }
}
