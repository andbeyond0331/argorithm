package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-21

import java.io.*;
import java.util.StringTokenizer;

public class Pro7_11050_solved {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int answer = factorial(N)/(factorial(K)*factorial(N-K));






        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static int factorial (int num){
        int result = 1;
        if(num==0){
            return 1;
        }else{
            for (int i = 1; i <= num; i++) {
                result*=i;
            }
        }
        return result;
    }
}
