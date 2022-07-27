package main.java.algorithm.baekjun.stepByStep.step10;

import java.io.*;
// TO :DO: 2022-07-27 재시도(2차 어레이) - 드디어!!!!!!!

public class Pro4_2447_1_solved {

    public static StringBuilder stringBuilder;
    public static int num;

    public static String[][] stars;

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        num = N;
//        String result = "";

        stars = new String[6561][6561]; //[행][열]
        func(N, 0, 0);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(stars[i][j]==null){
//                    result+=" ";
                    stringBuilder.append(" ");
                }else{

                    stringBuilder.append(stars[i][j]);
                }

            }
            stringBuilder.append("\n");
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();



//        System.out.println(result);

    }

    public static void func(int n, int row, int column) {
        if (n / 3 == 1) {
//            stars[row][column] = "*";
//            stars[row][column+1] = "*";
//            stars[row][column+2] = "*";
//            stars[row+1][column] = "*";
//            stars[row+1][column+1] = " ";
//            stars[row+1][column+2] = "*";
//            stars[row+2][column] = "*";
//            stars[row+2][column+1] = "*";
//            stars[row+2][column+2] = "*";
            for (int i = row; i < row + n / 3; i += n / 3) {
                for (int j = column; j < column+n ; j += n / 3) {
                    stars[i][j] = "*";
                }
            }
            for (int i = row + n / 3; i < row + n * 2 / 3; i += n / 3) {
                for (int j = column; j < column+ n / 3; j += n / 3) {
                    stars[i][j] = "*";
                }
                for (int j = column + n / 3; j < column + n * 2 / 3; j += n / 3) {
                    stars[i][j] = " ";
                }
                for (int j = column + n * 2 / 3; j < column + n; j += n / 3) {
                    stars[i][j] = "*";
                }

            }
            for (int i = row + n * 2 / 3; i < row + n; i += n / 3) {
                for (int j = column; j < column + n; j += n / 3) {
                    stars[i][j] = "*";
                }
            }
            return;

        }

        func(n / 3, row, column);
        func(n / 3, row, column + n / 3);
        func(n / 3, row, column + n * 2 / 3);
        func(n / 3, row + n / 3, column);
//        func(n / 3, row + n / 3, column + n / 3);
        func(n / 3, row + n / 3, column + n * 2 / 3);
        func(n / 3, row + n * 2 / 3, column);
        func(n / 3, row + n * 2 / 3, column + n / 3);
        func(n / 3, row + n * 2 / 3, column + n * 2 / 3);

    }



}
