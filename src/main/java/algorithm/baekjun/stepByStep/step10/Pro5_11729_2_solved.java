package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.*;

// 2022-07-28 재시도 - 처음부터 짜보기 - 역시 아침에 해야 함... 20분 만에 답이 나와버리기 ㅠㅠ 엄청 간단한거였음
// 하노이 탑 이동 순서

public class Pro5_11729_2_solved {

    public static StringBuilder stringBuilder = new StringBuilder();

//    public static Stack<Integer> one;
//    public static Stack<Integer> two;
//    public static Stack<Integer> three;

    public static int count;


    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());

        count = 0;

        hanoi(N, 1, 3);

        bufferedWriter.write(count+"\n"+String.valueOf(stringBuilder));
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();


    }

    public static void hanoi(int n, int start, int end){

        if(n==0){
            return;
        }
        String temp = "";

        hanoi(n-1, start, 6-start-end);
        temp+=start + " " + end;
        stringBuilder.append(temp).append("\n");
        count++;
        hanoi(n-1, 6-start-end, end);
    }


}
