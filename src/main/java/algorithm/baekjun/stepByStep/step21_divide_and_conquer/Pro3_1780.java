package main.java.algorithm.baekjun.stepByStep.step21_divide_and_conquer;

// 종이의 개수
// 2022-08-05 11:00~12:29 자꾸 메모리 초과 남 ㅠㅠ todo 다시

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pro3_1780 {

    static StringBuilder stringBuilder;
    static int minus;
    static int zero;
    static int plus;
    static int[][] paper;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        stringBuilder = new StringBuilder();

        minus = 0;
        zero = 0;
        plus = 0;

        int N= Integer.parseInt(bufferedReader.readLine());

        paper = new int[N][N];


        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
//        for (int i = 0; i < N; i++) {
//            System.out.println("paper : "+ Arrays.toString(paper[i]));
//
//        }
        divide(0, N-1, 0, N-1);
        stringBuilder.append(minus).append("\n").append(zero).append("\n").append(plus);
        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();


    }

    public static void divide(int left, int right, int top, int bottom){
        if(left>=right && top>=bottom){
//            int temp = paper[left][right];
            if(paper[left][right]==-1){
                minus++;
            }else if(paper[left][right] == 0){
                zero++;
            }else if(paper[left][right] == 1){
                plus++;
            }else{
                System.out.println("wrong!");
            }
            return;
        }
        int temp = equals(left, right, top, bottom);
        if(temp==-5){

//            int mid1 = left+(right-left+1)/3-1;
//            int mid2 = left+((right-left+1)/3)*2-1;
//            int mid3 = top + (bottom-top+1)/3-1;
//            int mid4 = top + (bottom-top+1)/3*2-1;
//            System.out.println("==============================");
//            System.out.println("mid2 = " + mid2);
//            System.out.println("mid1 = " + mid1);
//            System.out.println("left = " + left + ", right = " + right + ", top = " + top + ", bottom = " + bottom);
//            System.out.println("==============================");
            divide(left, left+(right-left+1)/3-1, top, top + (bottom-top+1)/3-1);
            divide( left, left+(right-left+1)/3-1, top + (bottom-top+1)/3-1+1, top + (bottom-top+1)/3*2-1);
            divide(left, left+(right-left+1)/3-1, top + (bottom-top+1)/3*2-1+1, bottom);
            divide(left+(right-left+1)/3-1+1, left+((right-left+1)/3)*2-1, top, top + (bottom-top+1)/3-1);
            divide(left+(right-left+1)/3-1+1, left+((right-left+1)/3)*2-1, top + (bottom-top+1)/3-1+1, top + (bottom-top+1)/3*2-1);
            divide(left+(right-left+1)/3-1+1, left+((right-left+1)/3)*2-1, top + (bottom-top+1)/3-1+1, bottom);
            divide( left+((right-left+1)/3)*2-1+1, right, top, top + (bottom-top+1)/3-1);
            divide( left+((right-left+1)/3)*2-1+1, right, top + (bottom-top+1)/3-1+1, top + (bottom-top+1)/3*2-1);
            divide( left+((right-left+1)/3)*2-1+1, right, top + (bottom-top+1)/3-1+1, bottom);
        }else{
            if(temp == -1){
                minus++;
            }else if(temp == 0){
                zero ++;
            }else if( temp == 1){
                plus ++;
            }else{
                System.out.println("What the..?");
            }
        }


    }

    public static int equals(int left, int right, int top, int bottom){

        for (int i = left; i <= right; i++) {
            for (int j = top; j <= bottom; j++) {
                if(paper[i][j]!=paper[left][top]){
                    return -5;
                }
            }
        }

        return paper[left][top];
    }

}
