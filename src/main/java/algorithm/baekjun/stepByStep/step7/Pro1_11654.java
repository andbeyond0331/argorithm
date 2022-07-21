package main.java.algorithm.baekjun.stepByStep.step7;

import java.util.Scanner;

public class Pro1_11654 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char input = scanner.next().charAt(0);
        int newInt = 0;

        if(('a'<=input && input<='z') || ('A'<=input && input <= 'Z')){
            newInt = (int)input;
        }else if('0'<=input && input<='9'){
            newInt = (int)input;
        }

        System.out.println(Integer.valueOf(input));

        scanner.close();
    }

}
