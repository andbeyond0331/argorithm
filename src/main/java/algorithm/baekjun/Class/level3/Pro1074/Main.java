package main.java.algorithm.baekjun.Class.level3.Pro1074;

// 2022-08-07 12:09~12:41 메모리 초과 ㅠㅠ todo 다시
// Z

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int count;
    static int[][] arr;
    static int r;
    static int c;
    static boolean flag;


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        r = Integer.parseInt(stringTokenizer.nextToken());
        c = Integer.parseInt(stringTokenizer.nextToken());

        flag = false;

        count =0;
        int temp = 1;

        for (int i = 0; i < N; i++) {
            temp*=2;
        }
        N = temp;
//        System.out.println(" N : " + N);

        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = -1;
            }
        }
        divide(0,N-1, 0, N-1);
//        for (int i = 0; i < N; i++) {
//            System.out.println("arr : " + Arrays.toString(arr[i]));
//        }

        stringBuilder.append(arr[r][c]);





        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    static void divide(int top, int bottom, int left, int right){
//        System.out.println("몇 번?");
        if(left==right && top==bottom){
            return;
        }
        if(flag){
            return;
        }
        if(Math.abs(right - left) == 1 && Math.abs(top - bottom) == 1){
//            System.out.println("why?");
            if(arr[top][left]==-1){
                arr[top][left] = count++;
                arr[top][right] = count++;
                arr[bottom][left] = count++;
                arr[bottom][right] = count++;
                if(right>r && bottom>c){
                    flag = true;
                }

            }else{
                System.out.println("-------------------");
                System.out.println("Something's wrong!");
                System.out.println("left = " + left + ", right = " + right + ", top = " + top + ", bottom = " + bottom);
                System.out.println("-------------------");
            }
        }
        int midR = (top + bottom) / 2;
        int midC = (left + right) / 2;

        divide(top, midR, left, midC);
        divide(top, midR, midC+1, right);
        divide(midR+1, bottom, left, midC);
        divide(midR+1, bottom, midC+1, right);

    }

}
