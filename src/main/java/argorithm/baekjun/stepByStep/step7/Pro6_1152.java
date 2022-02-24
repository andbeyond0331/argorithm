package main.java.argorithm.baekjun.stepByStep.step7;

import java.util.Scanner;

public class Pro6_1152 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();


            String[] arr = (sentence.trim()).split(" ");

            if(arr[0].length()==0){
                System.out.println(arr.length-1);
            }else{
                System.out.println(arr.length);
            }



        scanner.close();
    }

}
