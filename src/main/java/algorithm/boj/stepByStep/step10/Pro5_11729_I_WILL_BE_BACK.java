package main.java.algorithm.boj.stepByStep.step10;

import java.io.*;
import java.util.Stack;

// TO : DO: 2022-07-25 이거도 다시 오기

public class Pro5_11729_I_WILL_BE_BACK {

    public static StringBuilder stringBuilder = new StringBuilder();
    public static Stack<Integer> first = new Stack<>();
    public static Stack<Integer> second = new Stack<>();
    public static Stack<Integer> third = new Stack<>();

    public static int count;

    public static void main(String[] args) throws IOException{


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());

        count = 0;


        for (int i = N; i > 0; i--) {
            first.push(i);
        }

        Main(N, first, second, third);



    }

    public static void Main(int N, Stack<Integer> start, Stack<Integer> mid, Stack<Integer> end){

        if(end.size()==N){
            return;
        }

        mid.push(start.pop());

    }


}
