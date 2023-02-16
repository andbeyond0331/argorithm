package main.java.algorithm.boj.stepByStep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1_10872_solved {

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());



        System.out.println(Main(n));



    }

    public static int Main(int n){

        if(n<=1){
            return 1;
        }
        return n*=Main(n-1);
    }


}
