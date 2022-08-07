package main.java.algorithm.baekjun.Class.level2.solved.Pro1259;

//2022-08-06 09:31~09:42
// 팰리드롬수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a;

        while(!(a=bufferedReader.readLine()).equals("0")){
            String answer = "";
            for (int i = 0; i <= a.length()/2; i++) {
                if(!a.substring(i,i+1).equals(a.substring(a.length()-i-1, a.length()-i))){
                    answer = "no";
                    break;
                }else{
                    answer = "yes";
                }
            }
            System.out.println(answer);

        }

    }
}
