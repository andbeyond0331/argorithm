package main.java.algorithm.baekjun.stepByStep.step18_greedy;

// 2022-07-29 09:54~10:27 성공!
// 주유소

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro5_13305_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer distances = new StringTokenizer(bufferedReader.readLine()," ");
        StringTokenizer prices = new StringTokenizer(bufferedReader.readLine()," ");

        // 도시 개수
        int[] dis = new int[N-1];
        long[] price = new long[N];
        long priMin = 1000000001;
        int priMinIdx = 0;

        //n번째까지의 최솟값 저장하는 list
        List<Long> nMin = new ArrayList<>();

        // 최소 비용 저장 long
        long minCost = 0;

        for (int i = 0; i < N; i++) {
            if(i!=N-1){
                dis[i] =Integer.parseInt(distances.nextToken());
            }
            price[i] = Integer.parseInt(prices.nextToken());
            if(priMin>=price[i]){
                priMin = price[i];
                priMinIdx = i;
                nMin.add(price[i]);
            }else{
                nMin.add(priMin);
            }
        }

        for (int i = 0; i < N-1; i++) {
            minCost +=nMin.get(i)*dis[i];
//            System.out.println("minCost = nMin.get("+i+")*dis["+i+"] : " + minCost +"="+nMin.get(i)+"*"+dis[i]);
        }
        stringBuilder.append(minCost);


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

}
