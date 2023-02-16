package main.java.algorithm.boj.stepByStep.step7;

import java.util.Scanner;

public class Pro5_1157 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        int[] counter = new int[26];
        int realCounter = 0;
        int max = 0;
        int multi = 0;
        char what = ' ';
        String newString = "";

        for (char i = 'A'; i <= 'Z'; i++) {

            newString = word.toUpperCase().replaceAll(String.valueOf(i),"");

            counter[realCounter] = word.length()-newString.length();
            realCounter++;

            if(word.length()-newString.length()>max){
                max = word.length()-newString.length();

                what = i;

            }

        }

        for (int i = 0; i < counter.length; i++) {
            if(counter[i]==max){
                multi++;
            }
        }

        if(multi ==1){
            System.out.println(what);
        }else if(multi>1){
            System.out.println("?");
        }


        scanner.close();
    }

}
