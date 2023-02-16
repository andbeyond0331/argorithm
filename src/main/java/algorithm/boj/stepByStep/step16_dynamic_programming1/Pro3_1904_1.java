package main.java.algorithm.boj.stepByStep.step16_dynamic_programming1;

// 2022-07-28 재시도 - 처음부터 다시 to:do 내일 아침에 다시 2002-07-31 : 스택오버플로우는 인텔리제이 아이디이에서 나온 오류였음.. 백준에선 잘 돌아감
// 01타일

import java.io.*;

public class Pro3_1904_1 {

    public static int[] arr;
    public static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        N = Integer.parseInt(bufferedReader.readLine());

        arr = new int[1000001];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;

        }

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        tile(N);

        stringBuilder.append(arr[N]);


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static int tile(int n){

        if(arr[(int)n] == -1) {
            System.out.println("n : " + n);
            arr[(int) n] = (tile(n - 1) + tile(n - 2)) % 15746;
        }
        return arr[(int)n];

    }




}
