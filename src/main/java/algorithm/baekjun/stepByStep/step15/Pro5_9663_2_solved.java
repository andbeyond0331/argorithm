package main.java.algorithm.baekjun.stepByStep.step15;

// 전에 풀었지만 백트래킹 공부 처음부터 다시 하기 위해 다시 푼다.
// N-Queen
// 2022-08-04 10:43~12:15 ㅠㅠ 더 열심히 하자.. 그래도 성공..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro5_9663_2_solved {

    static int[] arr ;
    static int count;

//    static int column;

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        arr = new int[N];
        count = 0;

        dfs(N, 0);

        System.out.println(count);


    }

    public static void dfs(int n, int depth){
        if(depth==n){
            count++;

            return;
        }
        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if(right(depth)){
                dfs(n, depth+1);
            }
        }


    }

    public static boolean right(int col){
        for (int i = 0; i < col; i++) {
            if(arr[col]==arr[i]){
                return false;
            }else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])){
                return false;
            }
        }
        return true;
    }
}
