package main.java.algorithm.boj.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro7_2839 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

       int N = Integer.parseInt(bufferedReader.readLine());

       int result;
       if(N%5==0){
           result=N/5;
           System.out.println(11111);
       }else if((N%5)%3==0){
           result=N/5+1;
           System.out.println(2222);

       }else if((N/5-1)>0 && (N-(5*(N/5-1)))%3==0){
           result=N/5-1+(N-(5*(N/5-1)))/3;
           System.out.println(3333);

       }else if((N/5-2)>0 && (N-(5*(N/5-2)))%3==0){
           result=N/5-2+(N-(5*(N/5-2)))/3;
           System.out.println(4444);

       }else if((N/5-3)>0 && (N-(5*(N/5-3)))%3==0){
           result=N/5-3+(N-(5*(N/5-3)))/3;
           System.out.println(5555);

       }else if(N%3==0){
           result=N/3;
           System.out.println(6666);

       }else{
           result = -1;
           System.out.println(7777);
       }

        System.out.println(result);

        bufferedReader.close();


    }
}
