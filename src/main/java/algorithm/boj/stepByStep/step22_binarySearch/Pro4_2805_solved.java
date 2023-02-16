package main.java.algorithm.boj.stepByStep.step22_binarySearch;

// 2022-07-29 14:27~15:32
// 나무 자르기 - 성공 - 너무 생각없이 랜선자르기 복붙하고 출력 결과만 보고 했더니 오래걸림.. 다음에는 그냥 생각해보고 코드 짜기

import java.io.*;
import java.util.StringTokenizer;

public class Pro4_2805_solved {


    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long K = Integer.parseInt(stringTokenizer.nextToken());
        long N = Integer.parseInt(stringTokenizer.nextToken());
        StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine(), " ");

        long[] ks = new long[(int)K];
        long longest = 0;

        for (int i = 0; i < K; i++) {
            int temp = Integer.parseInt(stringTokenizer2.nextToken());
            ks[i] =temp;
            if(ks[i]>longest){
                longest = ks[i];
            }
        }

        long min = 0;
        long max = longest;

        long mid = 0;
        long result = 0;


        while(min<max){

            mid = (min+max)/2;

            long count = 0;

            for (int i = 0; i < K; i++) {
                if(ks[i]>mid){

                    count+=ks[i]-mid;
                }
            }
            System.out.println("mid : " + mid);
            System.out.println("count = " + count);
            if(count<N){
                max = mid;
//                if(max)
            }else{
                min = mid+1;
            }
            System.out.println("count = " + count);
            System.out.println("mid = " + mid);
            System.out.println("max = " + max);


        }

        stringBuilder.append(min-1);



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

}
