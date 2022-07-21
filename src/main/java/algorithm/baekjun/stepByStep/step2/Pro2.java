package main.java.algorithm.baekjun.stepByStep.step2;

import java.util.Scanner;

public class Pro2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Score= scanner.nextInt();

        if(90<=Score && Score<=100){
            System.out.println("A");

        }else if(80<=Score && Score<90){
            System.out.println("B");
        }else if(70<=Score && Score<80) {
            System.out.println("C");
        }else if(60<=Score && Score<70) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }

        scanner.close();
    }








}
