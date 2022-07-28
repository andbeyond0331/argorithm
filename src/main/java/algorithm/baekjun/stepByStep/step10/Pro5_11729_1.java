package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

// 2022-07-27 재시도 - to : do 다시 생각해보기 ㅠㅠ

public class Pro5_11729_1 {

    public static StringBuilder stringBuilder = new StringBuilder();
    public static Stack<Integer> first = new Stack<>();
    public static Stack<Integer> second = new Stack<>();
    public static Stack<Integer> third = new Stack<>();

    public static String[] countMove;
    public static String moves;

    public static int N;

    public static int plate;

    public static boolean flag;

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

        flag = false;

        moves = countMove[N-1];

        System.out.println(countMove[N-1].length());

        for (int i = N; i > 0; i--) {
            first.push(i);
        }

        Main(N, 1, 3);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();

        bufferedReader.close();

    }

    public static void Main(int n, int start, int end){

        if(n==0){
            if(flag==false){
                Main(N-1, 2,3);
                System.out.println("......");
                flag = !flag;
            }
            return;
        }
        if(n-1>0){
            if(first.contains(n-1)){
//                if((6-start-end)==2){
//                    second.push(first.pop());
//                }else if((6-start-end)==3){
//                    third.push(first.pop());
//                }

                Main(n-1, 1, 6-start-end);
            }else if(second.contains(n-1)){
                Main(n-1, 2, 6-start-end);
            }else if(third.contains(n-1)){
                Main(n-1, 3, 6-start-end);
            }
        }
//
//        if(start)
        stringBuilder.append(start+" "+end).append("\n");



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
