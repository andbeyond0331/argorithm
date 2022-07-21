package main.java.algorithm.baekjun.stepByStep.step7;

import java.util.Scanner;

public class Pro3_10809 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        String[] arr = S.split("");

        for(char a = 'a'; a<='z'; a++){
            int count = 0;
            for(int i = 0; i< arr.length; i++){
                if(a==arr[i].charAt(0)){
                    System.out.print(i+" ");
                    count++;
                    break;
                }

            }
            if(count==0){
                System.out.print("-1 ");
            }
        }

        scanner.close();
    }

}
