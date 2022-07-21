package main.java.algorithm.baekjun.stepByStep.step14;

// 머리가 안 돌아감

import java.io.*;
import java.util.*;

public class Pro5_2981_1 {


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

         int N = Integer.parseInt(bufferedReader.readLine());

        int theFirstOne = 0;
         Set<Integer> nums = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            nums.add(temp);
            if(i==0){
                theFirstOne = temp;
            }
        }

        Iterator<Integer> iterator;



        for (int i = 2; i < theFirstOne; i++) {
            iterator =nums.iterator();
            int temp = 0;
            for (int j = 0; j < nums.size(); j++) {
//                int mid = iterator.next();
                if(j==0){

                    temp = iterator.next()%i;
                }else if (j==nums.size()-1 && iterator.next()%i==temp){
                    sb.append(i).append(" ");
                }else{
                    if(iterator.next()%i!=temp){
                        break;
                    }
                }

            }

        }



        bufferedWriter.write(String.valueOf(sb));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
}
