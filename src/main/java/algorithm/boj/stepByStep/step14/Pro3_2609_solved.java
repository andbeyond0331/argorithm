package main.java.algorithm.boj.stepByStep.step14;

// 시작 전
// 2022-07-28 첫 시도 -  유클리드 호제법 이용 - 성공!

import java.io.*;
import java.util.StringTokenizer;

public class Pro3_2609_solved {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        int gcd= GCD(a,b);

        stringBuilder.append(gcd).append("\n");

        int lcm = a*b/gcd;

        stringBuilder.append(lcm).append("\n");

        


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
