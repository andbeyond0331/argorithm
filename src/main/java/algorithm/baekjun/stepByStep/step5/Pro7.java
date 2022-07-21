package main.java.algorithm.baekjun.stepByStep.step5;

import java.util.Scanner;

public class Pro7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        String[] tests = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            int length = scanner.nextInt();
            int[] scores = new int[length];
            int sum = 0;
            for (int j = 0; j < length; j++) {
                scores[j] = scanner.nextInt();
                sum+=scores[j];
                System.out.println("sum ; " + sum);
            }
            int average = sum/length;
            System.out.println("average = " + average);

            int superior = 0;
            for (int j = 0; j < length; j++) {

                if(scores[j]>average){
                    superior++;
                }

            }
            System.out.println("superior = " + superior);
            double number = ((double)superior/(double)length)*100.000;
            String results = String.format("%.3f", number);
            System.out.println(results+"%");
        }
//        scanner.next();
//
//        for(int i = 0; i<testCase; i++){
//
//            tests[i] = scanner.nextLine();
//
//        }
//
//        //일단 한 줄 씩 출력
//
//        for(int i = 0; i<testCase; i++){
//
//            System.out.println("tests["+i+"] = " + tests[i]);
//
//        }
//
//        Vector newTests = new Vector();
//
//        for (int i = 0; i < testCase; i++) {
//
//            newTests.add(i, tests[i].split(" "));
//
//        }
//
//
//        for (int i = 0; i < testCase; i++) {
//
//            String[] newArray = (String[]) newTests.get(i);
//
//            for (int j = 0; j < newArray.length; j++) {
//                System.out.println("newTests["+i+"]["+j+"] : " +newArray[j]);
//            }
//
//        }


        scanner.close();

    }

}
