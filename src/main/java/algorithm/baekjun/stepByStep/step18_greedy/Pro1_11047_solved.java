package main.java.algorithm.baekjun.stepByStep.step18_greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 동전 0
// 2022-07-28

public class Pro1_11047_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int count = 0;
        boolean flag = true;

        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());

            if(temp<K){
                coins.add(temp);
            }else if(temp==K){
                flag = false;
                count=1;
                break;
            }
        }
        while(flag && K>0 ){
            count+=K/coins.get(coins.size()-1);
            K=K%coins.get(coins.size()-1);
//            System.out.println("count = " + count);
//            System.out.println("K = " + K);
            coins.remove(coins.size()-1);
        }

        bufferedWriter.write(String.valueOf(stringBuilder.append(count)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
