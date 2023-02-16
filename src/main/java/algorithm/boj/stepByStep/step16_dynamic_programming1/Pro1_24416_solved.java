package main.java.algorithm.boj.stepByStep.step16_dynamic_programming1;

import java.io.*;

public class Pro1_24416_solved {

    // 알고리즘 수업 - 피보나치수 1
    public static int fibCount;
    public static int fibonacciCount;
    public static int[] f ;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());
        fibCount = 0;
        fibonacciCount = 0;
        f = new int[n+1];

        fib(n);
        fibonacci(n);

        stringBuilder.append(fibCount).append(" ").append(fibonacciCount);



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCount++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n) {
        if(n==1 || n==2){
            return 1;
        }
        if(f[n] ==0){
            fibonacciCount++;
            f[n] = fibonacci(n-1) + fibonacci(n-2);

        }
        return f[n];
    }

}
