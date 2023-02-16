package main.java.algorithm.boj.Class.level1.solved.Pro2920;

//2022-08-06 09:58~12:21(중간에 쉼..ㅋㅋㅋ)
// 음계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        if(input.equals("1 2 3 4 5 6 7 8")){
            System.out.println("ascending");
        }else if(input.equals("8 7 6 5 4 3 2 1")){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
