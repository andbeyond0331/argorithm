package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-21

import java.io.*;
import java.util.StringTokenizer;

public class Pro9_1010 {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int T = Integer.parseInt(bufferedReader.readLine());






//        bufferedWriter.write(String.valueOf(answer));
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
