package main.java.algorithm.baekjun.stepByStep.step16_dynamic_programming1;

import java.io.*;
import java.util.StringTokenizer;

// todo 머리 맑을 때 다시!

public class Pro3_1904 {

    // 01타일

    public static long[] f ;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        f = new long[N+1];
        f[0]=1;
        f[1]=1;

        long answer = 1;

        if(N!=1){
            for (long i = 1; i <= N/2; i++) {
                if(fac((int) i)*fac((int) (N-2*i))!=0){
                    long temp = fac((int) (N-i))/(fac((int) i)*fac((int) (N-2*i)));
                    System.out.println(temp);
                    answer+= temp;
                }


            }

        }


        answer = answer%15746;

        stringBuilder.append(answer);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static long fac(int N){
        if(N<=1){
            return 1;
        }
        if(f[N]==0){
            if(N!=0 ){
                f[N] = N*fac(N-1);
            }

                System.out.println("N : " + N + ", f[N] : " + f[N] +", f[N-1] : " + f[N-1]);
//            if(f[N] ==0){
//                System.out.println("N : " + N + ", f[N] : " + f[N] +", f[N-1]");
//            }

        }
        return f[N];
    }

//    public static int w(int N){
//        if(N==1){
//            return 1;
//        }else if(N==2){
//            return 2;
//        }
//        for (int i = 1; i <=N/2 ; i++) {
//
//        }
//
//        if(f[N]==0){
//
//        }
//
//
//
//
//    }

}
