package main.java.algorithm.baekjun.stepByStep.step9_geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2_2581 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int M = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        int sum = 0;
        int min = 10001;

        for(int i = M; i<N+1; i++){
            int wow = 0;
            for (int j = 1; j <=i ; j++) {
                if(i%j==0){
                    wow++;
                }
            }
            if(wow==2){
                sum+=i;
                if(i<min){
                    min=i;
                }
                count++;
            }
        }
        if(count!=0){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }

        bufferedReader.close();

    }
}
