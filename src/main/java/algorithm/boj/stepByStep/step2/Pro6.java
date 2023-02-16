package main.java.algorithm.boj.stepByStep.step2;

import java.util.Scanner;

public class Pro6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int cookingTime = scanner.nextInt();

        System.out.println("args = " + hours + minutes + cookingTime);

        if((minutes+cookingTime)<60){
            System.out.println(hours+" "+(minutes+cookingTime));
        }else {
            int cookingHours = (minutes+cookingTime)/60;
            if((cookingHours+hours)>23){
                System.out.println((cookingHours+hours)%24 + " " + (minutes+cookingTime)%60);
            }else{
                System.out.println((cookingHours+hours) + " " + (minutes+cookingTime)%60);
            }
        }


        scanner.close();
    }


}
