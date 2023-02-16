package main.java.algorithm.boj.stepByStep.step16_dynamic_programming1;

// 2022-07-31 09:46~10:17 todo 다시 해보기
// 연속합

import java.io.*;
import java.util.StringTokenizer;

public class Pro5_1912 {

    public static long[] arr;


    public static long max = -1001;

    public static long[][] sums;



    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
//        System.out.println(T + ": T");
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        sums = new long[T][T];


        arr = new long[T+1];

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(stringTokenizer.nextToken());

            arr[i] = N;
            sums[i][i] = N;

        }


        result(T-1,T-1);

        stringBuilder.append(max);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static long result(int a, int b){
        System.out.println("=============");
        System.out.println();
        System.out.println("a : " + a + ", b : " + b);

        if(a>b){
            if (a != 0) {
                long temp = result(a-1,b)+arr[a];
                if(temp>=max){
                    max = temp;
                }
                System.out.println("max : " + max);
                System.out.println("temp = sums[a][b] : " + temp);
                System.out.println();
                System.out.println("==========");
                return sums[a][b] = temp;
            }else if(b!=0){
                long temp = result(a, b-1) + arr[a];
                max = Math.max(max, temp);
                System.out.println("max : " + max);
                System.out.println("temp = sums[a][b] : " + temp);
                System.out.println();
                System.out.println("==========");
                return sums[a][b] = temp;
            }else{
                max = Math.max(max, arr[0]);
                System.out.println("max : " + max);
                System.out.println("arr[0] = sums[a][b] : " + arr[0]);
                System.out.println();
                System.out.println("==========");
                return sums[a][b] = arr[0];
            }
        }else if(a==b){
            max = Math.max(max, arr[a]);
            System.out.println("max : " + max);
            System.out.println("arr[a] = sums[a][b] : " + arr[a]);
            System.out.println();
            System.out.println("==========");
            sums[a][b] = arr[a];
            return result(a, b-1);
        }else{
            long temp = result(a, b-1) + arr[a];
            max = Math.max(max, temp);
            System.out.println("max : " + max);
            System.out.println("temp = sums[a][b] : " + temp);
            System.out.println();
            System.out.println("==========");
            return sums[a][b] = result(a, b-1)+arr[a];
        }
    }





}
