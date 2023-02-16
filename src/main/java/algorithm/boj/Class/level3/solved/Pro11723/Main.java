package main.java.algorithm.boj.Class.level3.solved.Pro11723;

// 2022-08-06 18:15~18:50(중간에 엄마랑 시험 봄) 성공!
// 집합

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();

        Set<Integer> S = new TreeSet<>();
        int M = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
            String str = stringTokenizer.nextToken();
            if(str.equals("add")){
                S.add(Integer.parseInt(stringTokenizer.nextToken()));
            }else if(str.equals("remove")){
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                if(S.contains(temp)){
                    S.remove(temp);
                }
            }else if(str.equals("remove")){
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                if(S.contains(temp)){
                    S.remove(temp);
                }
            }else if(str.equals("check")){
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                if(S.contains(temp)){
                    stringBuilder.append("1").append("\n");
                }else{
                    stringBuilder.append("0").append("\n");

                }
            }else if(str.equals("toggle")){
                int temp = Integer.parseInt(stringTokenizer.nextToken());
                if(S.contains(temp)){
                    S.remove(temp);
                }else{
                    S.add(temp);
                }

            }else if(str.equals("all")){
                S.clear();
                S.add(1);
                S.add(2);
                S.add(3);
                S.add(4);
                S.add(5);
                S.add(6);
                S.add(7);
                S.add(8);
                S.add(9);
                S.add(10);
                S.add(11);
                S.add(12);
                S.add(13);
                S.add(14);
                S.add(15);
                S.add(16);
                S.add(17);
                S.add(18);
                S.add(19);
                S.add(20);
            }else if(str.equals("empty")){
                S.clear();
            }else{
                System.out.println("Wrong!");
            }
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

}
