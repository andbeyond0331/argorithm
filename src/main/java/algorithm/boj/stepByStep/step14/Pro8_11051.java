package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-21 - 로직 시도 실패 머리 잘 돌아갈 때 다시 오기

import java.io.*;
import java.util.StringTokenizer;

public class Pro8_11051 {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long N = Integer.parseInt(stringTokenizer.nextToken());
        long K = Integer.parseInt(stringTokenizer.nextToken());

        long answer = 0;

        if(K==0){
            System.out.println("aaaa");
            answer = 1;
        }else{
            System.out.println("dddd");
            answer = (factorial(N,K));

            if(answer!=0){
                System.out.println("dddde");
                answer = answer%10007;
            }
        }










        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static long factorial (long num, long num1){
        System.out.println("num = " + num);

        long son = 1;
        long mom = 1;
        if(num==0 || num1==0){
            return 1;
        }else{
             long result=1;
            System.out.println("result : " + result);
            for (long i = num; i >= num-num1+1; i--) {
//                System.out.println("(num-num1+1) = " + (num-num1+1));
                System.out.println("i = " + i);
                System.out.println("son = " + son);
                System.out.println("(son*i) = " + (son*i));

                son=son*i;

            }
            for (int i = 0; i < num1; i++) {
                mom*=i+1;
            }
            if(mom!=0){
                result = son/mom;
            }
            return result;
        }
//        System.out.println(result + " : result");
//        return result;
    }
}
