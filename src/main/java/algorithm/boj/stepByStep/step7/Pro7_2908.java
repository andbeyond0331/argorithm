package main.java.algorithm.boj.stepByStep.step7;

import java.util.Scanner;

public class Pro7_2908 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int newFirst = first/100 + first%100 - first%10 + 100*(first%10);
        int newSecond = second/100 + second%100 - second%10 + 100*(second%10);

        if(newFirst>newSecond){
            System.out.println(newFirst);

        }else{
            System.out.println(newSecond);
        }



        scanner.close();
    }

}
