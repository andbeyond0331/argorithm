package main.java.algorithm.baekjun.Class.level3.Pro1463;

// 2022-08-09 12:14~12:15 지금은 프젝 하는 게 맞는 듯! todo 다음에
// 1로 만들기

import java.io.*;

public class Main {

    static int min;
    static int[] v;


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        min = N+1;
        v = new int[N+1];

//        while(N!=1){
//            if(N%3==0){
//                N/=3;
//                count++;
//            }else if((N-1)%3==0){
//                N--;
//                count++;
//                N/=3;
//                count++;
//            }else if(N%2==0){
//                N/=2;
//                count++;
//            }else if(N!=0) {
//                N--;
//                count++;
//            }else{
//                System.out.println("Who are you? : " + N);
//
//            }
//        }
        stringBuilder.append(count);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
//        System.out.println(stringBuilder);
    }

    static void dp(int n){
//        if()
    }


}