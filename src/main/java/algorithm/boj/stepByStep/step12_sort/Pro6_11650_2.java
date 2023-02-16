
package main.java.algorithm.boj.stepByStep.step12_sort;

// 2022-03-22 시작 - 시간초과해결용 - 실패 to do 병합정렬 공부하기 : 공부함

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro6_11650_2 {

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
            int size = xs.size();

            if(size==0){
                xs.add(x);
                ys.add(y);
            }else{
                for (int j = 0; j < size; j++) {
                    if(xs.get(j)>x){
                        xs.add(j,x);
                        ys.add(j,y);
                        break;
                    }else if(xs.get(j)==x){
                        if(ys.get(j)>y){
                            xs.add(j,x);
                            ys.add(j,y);
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < xs.size(); i++) {
            stringBuilder.append(xs.get(i)).append(" ").append(ys.get(i)).append("\n");
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedReader.close();


    }
}
