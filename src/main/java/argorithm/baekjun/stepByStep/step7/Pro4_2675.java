package main.java.argorithm.baekjun.stepByStep.step7;

import java.util.Scanner;

public class Pro4_2675 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {

            int again = scanner.nextInt();
            String target = scanner.next();

            String[] arr = target.split("");

            for (int j = 0; j < target.length(); j++) {
                for (int k = 0; k < again; k++) {
                    System.out.print(arr[j]);
                }

            }
            System.out.print("\n");

        }

        scanner.close();
    }

}
