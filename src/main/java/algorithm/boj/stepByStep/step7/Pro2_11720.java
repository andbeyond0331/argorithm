package main.java.algorithm.boj.stepByStep.step7;

import java.util.Scanner;

public class Pro2_11720 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        int[] arr = new int[amount];

        String splitTarget = scanner.next();

        int sum = 0;

        for(int i = 0; i < amount; i++) {
            arr[i] = Integer.parseInt(splitTarget.substring(i,i+1));
            sum+=arr[i];
        }

        System.out.println(sum);

        scanner.close();
    }

}
