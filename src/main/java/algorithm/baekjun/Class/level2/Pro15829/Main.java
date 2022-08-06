package main.java.algorithm.baekjun.Class.level2.Pro15829;

//2022-08-06 10:27~11:01(중간에 쉼..ㅋㅋㅋㅋ &long으로 설정 안 해줘서 세 번 50점 나옴 ㅠㅠ)
// Hashing

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(bufferedReader.readLine());
        String str = bufferedReader.readLine();
        // 97~122
        long answer = 0;

        for (int i = 0; i < L; i++) {
            char cha = str.charAt(i);
            long chaint = (int) cha-96;
            for (int j = 0; j < i; j++) {
                chaint*=31;
                chaint%=1234567891;
            }
            answer += chaint%1234567891;
        }

        System.out.println(answer%1234567891);
    }
}
