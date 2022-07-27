package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

// 2022-07-27 재시도

public class Pro5_11729_1 {

    public static StringBuilder stringBuilder = new StringBuilder();
    public static Stack<Integer> first = new Stack<>();
    public static Stack<Integer> second = new Stack<>();
    public static Stack<Integer> third = new Stack<>();

    public static String[] countMove;
    public static String moves;

    public static int N;

    public static int plate;

    public static void main(String[] args) throws IOException{


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(bufferedReader.readLine());

        countMove = new String[N];
        for (int i = 0; i < countMove.length; i++) {
            countMove[i] = "";
        }

        plate = 1;
        next(0);

        moves = countMove[N];

        System.out.println(countMove[N].length());

        for (int i = N; i > 0; i--) {
            first.push(i);
        }

        Main(0, 1, 3);

    }

    public static void Main(int n, int start, int end){

        if(n==N){
            stringBuilder.append(start +" "+ end).append("\n");
            return;
        }
//        else if(n==N){
//            if(N%2==0){
//                stringBuilder.append("1 2").append("\n");
//                second.push(first.pop());
//            }else{
//                stringBuilder.append("1 3").append("\n");
//                third.push(first.pop());
//            }
//        }
        if(N%2==0 && n==0){
            stringBuilder.append("1 2").append("\n");
            second.push(first.pop());
            plate++;
            Main(n+1, 1, 3);
        }else if(N%2!=0 && n==0){
            stringBuilder.append("1 3").append("\n");
            third.push(first.pop());
            plate++;
            Main(n+1, 1, 2);
        }





        Main(n+1, start, 6-start-end);
        Main(n+2, end, 6-start-end);
        if(moves.substring(n,n+1)==""){

        }

    }


    public static String next(int n){ // 순서, 원판 크기

        String temp = "";

        if(n==N){
            temp += countMove[n-2];
            temp += n;
            temp += countMove[n-2];

            countMove[n-1]=temp;
            return temp;
        }else if(n==0){
            temp+="1";
            if(countMove[n].equals("")){
                countMove[n] = temp;
            }else{
                countMove[n] += temp;
            }
            if(N==1){
                return temp;
            }
        }
        if(n-1 > 0){
            temp += countMove[n-2];
            temp += n;
            temp += countMove[n-2];

            countMove[n-1]=temp;
        }

        return next(n+1);


    }

}
