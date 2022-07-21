package main.java.algorithm.baekjun.stepByStep.step5;

import java.util.Scanner;

public class Pro5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int subjects = scanner.nextInt();

        double[] scores = new double[subjects];

        for (int i = 0; i < subjects; i++) {

            scores[i] = scanner.nextDouble();

        }


        double maxScore=scores[0];

        for(int i = 0; i < subjects; i++){
            if(maxScore<scores[i]){
                maxScore=scores[i];
            }
        }



        for (int i = 0; i<subjects; i++) {

            scores[i]=(scores[i]/maxScore)*(double)100;

        }

        double sum = 0;

        for (int i = 0; i<subjects; i++) {

            sum+=scores[i];

//            System.out.println("scores["+i+"] : " + scores[i]);

        }

        double newAverage = sum/(double)subjects;


        System.out.println(newAverage);

        scanner.close();

    }

}
