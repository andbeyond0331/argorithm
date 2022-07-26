package main.java.algorithm.baekjun.stepByStep.step16_dynamic_programming1;

import java.io.*;
import java.util.StringTokenizer;

public class Pro2_9184_solved {

    // 신나는 함수 실행

    public static int[][][] f ;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        StringBuilder stringBuilder = new StringBuilder();

        f = new int[50+1][50+1][50+1];

        while(!(s= bufferedReader.readLine()).equals("-1 -1 -1")){
            StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());

            stringBuilder.append("w("+a+", "+b+", "+c+") = "+w(a,b,c)).append("\n");

        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static int w(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0){
            return 1;
        }

        if(f[a][b][c]==0){
            if(a>20 || b>20 || c>20){
                f[a][b][c]=w(20,20,20);
            }else if(a<b && b<c){
                f[a][b][c] = w(a, b, c-1)+w(a, b-1, c-1) - w(a, b-1, c);
            }else {
                f[a][b][c] = w(a - 1, b, c) + w(a - 1, b-1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
            }
        }


        return f[a][b][c];

    }

//
//    public static int w(int a, int b, int c){
//        if(a<=0 || b<=0 || c<=0){
//            return 1;
//        }else if(a>20 || b>20 || c>20){
//            return w(20, 20, 20);
//        }else if(a<b && b<c){
//            return w(a, b, c-1)+w(a, b-1, c-1) - w(a, b-1, c);
//        }else{
//            return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b-1, c-1);
//        }
//
//    }
//
//
}
