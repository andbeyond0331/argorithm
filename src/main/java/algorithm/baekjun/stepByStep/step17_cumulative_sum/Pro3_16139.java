package main.java.algorithm.baekjun.stepByStep.step17_cumulative_sum;

//2022-08-04 16:20~
// 인간-컴퓨터 상호작용

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pro3_16139 {

    public static int[] prefix;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = bufferedReader.readLine();
        int q = Integer.parseInt(bufferedReader.readLine());
        prefix = new int[target.length()];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " " );
        String one = st.nextToken();
        for (int i = 0; i < prefix.length; i++) {
            if(i==0){
                if(target.substring(i,i+1).equals(one)){
                    prefix[i]++;
                }
            }else{
                if(target.substring(i,i+1).equals(one)){
                    prefix[i] = prefix[i-1]+1;
                }else{
                    prefix[i] = prefix[i-1];
                }
            }

        }
        int sta = Integer.parseInt(st.nextToken());
        int en = Integer.parseInt(st.nextToken());
//        System.out.println("prefix : " + Arrays.toString(prefix));
        int temper = 0;
        if(sta==0){
            temper = prefix[en];
        }else{
            temper = prefix[en]-prefix[sta-1];
        }
        stringBuilder.append(temper).append("\n");
        for (int i = 1; i < q; i++) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            one = stringTokenizer.nextToken();
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            int temp = 0;
            if(start==0){
                temp = prefix[end];
            }else{
                temp = prefix[end]-prefix[start-1];
            }
            stringBuilder.append(temp).append("\n");

        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
