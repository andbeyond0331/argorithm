package main.java.algorithm.boj.stepByStep.step16_dynamic_programming1;

// 2022-07-31 09:14~09:44 간단한 문제인데 ArrayIndexOutOfBounds, long 선언 안 해줘서 런타임에러, 틀렸습니다를 총 5번 봄..ㅠㅠ 그래도 성공!
// 파도반 수열

import java.io.*;

public class Pro4_9461_solved {

    public static long[] arr;


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
//        System.out.println(T + ": T");

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bufferedReader.readLine());
//            System.out.println("-----");

            arr = new long[N+1];
            if(N>=5){
                arr[5] = 2;
            }
            if(N>=4){
                arr[4] = 2;
            }
            if(N>=3){
                arr[3] = 1;
            }
            if(N>=2){
                arr[2] = 1;
            }
            if(N>=1){
                arr[1] = 1;
            }


            for (int j = 6; j < arr.length; j++) {
                arr[j] = -1;
            }
            stringBuilder.append(tri(N)).append("\n");

        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static long tri(int n){
        if(n<=5){
            return arr[n];
        }
        if(arr[n]==-1){
            arr[n]=tri(n-1)+tri(n-5);
//            System.out.println("arr["+n+"] = tri("+(n-1)+")+tri("+(n-5)+") : " + arr[n]+"="+arr[n-1] + "+"+arr[n-5]);
        }
        return arr[n];
    }





}
