package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-28 첫 시도 -  유클리드 호제법 이용 - 2609 조금 변형 + 성공!

import java.io.*;
import java.util.StringTokenizer;


public class Pro4_1934_solved {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int T= Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            stringBuilder.append(a*b/GCD(a,b)).append("\n");

        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
    
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b, a%b);
    }
}
