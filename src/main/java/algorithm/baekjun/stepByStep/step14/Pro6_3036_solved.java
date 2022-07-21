package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-21

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro6_3036_solved {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine()); //링의 개수
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        StringBuilder stringBuilder = new StringBuilder();

        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            r.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

//        int temp = ((2*(r.get(0)))/gcd((r.get(0))*2,(r.get(1)*2)))/(2*(r.get(1)))/gcd((r.get(0))*2,2*(r.get(1)));
//        int temp = (2*r.get(0));

        for (int i = 1; i < r.size(); i++) {
            int temp = (2*r.get(0))/gcd((r.get(0))*2, r.get(i)*2);
            stringBuilder.append(temp).append("/").append((2*(r.get(i)))/gcd((r.get(0))*2,2*(r.get(i)))).append("\n");
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static int gcd (int r1, int r2){
        if(r1>r2){
            if(r1%r2==0){
                return r2;
            }
        }else if(r1==r2){
            return r1;
        }else{
            if(r2%r1==0){
                return r1;
            }
        }
        return gcd(r2,r1%r2);
    }
}
