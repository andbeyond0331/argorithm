package main.java.algorithm.baekjun.Class.level3.solved.Pro1003;

// 2022-08-06 16:23~16:55 성공!
// 피보나치 함수

import java.io.*;

public class Main {

//    static int countZ;
//    static int countO;

    static int[] arrZ;
    static int[] arrO;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
//            countZ = 0;
//            countO = 0;
            int N = Integer.parseInt(bufferedReader.readLine());
            if(N == 0){
                stringBuilder.append(1).append(" ").append(0).append("\n");

            }else if(N==1){

                stringBuilder.append(0).append(" ").append(1).append("\n");
            }else{
                arrZ = new int[N+1];
                arrO = new int[N+1];
                for (int j = 0; j < N+1; j++) {
                    arrZ[j] = -1;
                    arrO[j] = -1;
                }

                fibonacciZ(N);
                fibonacciO(N);
                stringBuilder.append(arrZ[N]).append(" ").append(arrO[N]).append("\n");
            }


        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
//        System.out.println(stringBuilder);
    }

    static int fibonacciZ(int n){

        if(n == 0){

            arrZ[0] = 1;
            return arrZ[0];
        }else if(n == 1){
            arrZ[1] = 0;
            return arrZ[1];
        }else {
            if(arrZ[n]==-1){

                return arrZ[n] = fibonacciZ(n-1) + fibonacciZ(n-2);
            }
            return arrZ[n];
        }
    }
    static int fibonacciO(int n){

        if(n == 0){

            arrO[0] = 0;
            return arrO[0];
        }else if(n == 1){
            arrO[1] = 1;
            return arrO[1];
        }else {
            if(arrO[n]==-1){

                return arrO[n] = fibonacciO(n-1) + fibonacciO(n-2);
            }
            return arrO[n];
        }
    }
}
