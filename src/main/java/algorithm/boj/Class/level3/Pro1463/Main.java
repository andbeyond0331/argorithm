package main.java.algorithm.boj.Class.level3.Pro1463;

// 2022-08-09 12:14~12:15 지금은 프젝 하는 게 맞는 듯! to do 다음에
// 2022-08-10 18:11~

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

        stringBuilder.append(count);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    static void dp(int n, int depth){
        if(n==1){

            return;
        }
        if(n%6==0){
            if(v[n/6]==0){
                v[n/6]=depth+2;
                dp(n/6, depth+2);
            }else if(v[n/6]>depth+2){
                v[n/6] = depth+2;
                dp(n/6, depth+2);
            }
        }else if(n%3==0){
            if(v[n/3]==0){
                v[n/3] = ++depth;
                dp(n/3, depth);
            }else if(v[n/3]>depth+1){
                v[n/3] = ++depth;
                dp(n/3, depth);
            }
        }else if(n%2==0){
            if(v[n/2]==0){
                v[n/2] = ++depth;
                dp(n/2, depth);
            }else if(v[n/2]>depth+1){
                v[n/2] = ++depth;
                dp(n/2, depth);
            }
        }else{
            if(v[n-1]==0){
                v[n-1] = ++depth;
                dp(n-1, depth);
            }else if(v[n-1]>depth+1){
                v[n-1] = ++depth;
                dp(n-1, depth);
            }
        }
    }


}
