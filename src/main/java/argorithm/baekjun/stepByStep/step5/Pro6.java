package main.java.argorithm.baekjun.stepByStep.step5;

import java.util.Arrays;
import java.util.Scanner;

public class Pro6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        String[] tests = new String[testCase];

        for(int i = 0; i<testCase; i++){

            tests[i] = scanner.next();

        }
//        for(int i = 0; i<testCase; i++){
//
//            System.out.println("tests["+i+"] = " + tests[i]);
//
//        }

        int[] scores = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            String[] howMany = tests[i].split("X");
            for (int j = 0; j < howMany.length; j++) {
                System.out.println(i+ "번째 split의 "+ j+" : " + howMany[j]);
                if(howMany[j]!="" || howMany[j]!=null){
                    System.out.println("0갯수 : " + howMany[j].length());
                    int stack = 0;
                    for (int k = 0; k < howMany[j].length(); k++) {
                        stack=k+1;
                        System.out.println(stack);
                        scores[i]+=stack;
                        System.out.println("i : "+ i + ", j : " + j + ", scores["+i+"]중간점검 : "+scores[i]);
                    }


                }

            }

        }
        for (int i = 0; i < testCase; i++) {
            System.out.println(scores[i]);
        }



        scanner.close();

    }

}
