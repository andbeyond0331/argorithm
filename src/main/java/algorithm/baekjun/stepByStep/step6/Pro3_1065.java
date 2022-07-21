package main.java.algorithm.baekjun.stepByStep.step6;

import java.util.Scanner;

public class Pro3_1065 {

    // 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
    // N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

    static void counter(int inputNumber){

        int count = 0;

        for (int i = 1; i < inputNumber+1; i++) {

            if(0<i&&i<10){
                count++;
            }else if(9<i && i<100){
                count++;
            }else if(99<i && i<1000){
                if(i/100<i%100/10){// 만약 천의 자리수보다 백의 자리수가 크다면
                    if(-(i/100-i%100/10)==(i%10-i%100/10)){
                        count++;
                    }
                }else if(i/100==i%100/10){
                    if(i%10==i%100/10){
                        count++;
                    }
                }else {
                    if((i/100-i%100/10)==-(i%10-i%100/10)){
                        count++;
                    }
                }
            }

        }

        System.out.println(count);




    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        counter(scanner.nextInt());

        scanner.close();

    }
}
