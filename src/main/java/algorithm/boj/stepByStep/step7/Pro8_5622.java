package main.java.algorithm.boj.stepByStep.step7;

import java.util.Scanner;

public class Pro8_5622 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String alphabet = scanner.next();

        int ans = 0;

        for(int i = 0; i < alphabet.length(); i++){
            char mmid = alphabet.charAt(i);
            System.out.println(mmid);
            int mid = (int)(mmid);
            int imp = (Integer.valueOf(mid)-64);
            if(imp<4) {
                System.out.println(2);
                ans += 3;
            }else if(3<imp&&imp<7) {
                System.out.println(3);
                ans += 4;
            }else if(6<imp&&imp<10) {
                System.out.println(4);
                ans += 5;
            }else if(9<imp&&imp<13){
                System.out.println(5);
                ans+=6;
            }else if(12<imp&&imp<16){
                System.out.println(6);
                ans+=7;
            }else if(15<imp&&imp<20){
                System.out.println(7);
                ans+=(8);
            }else if(19<imp&&imp<23){
                System.out.println(8);
                ans+=9;
            }else{
                System.out.println(9);
                ans+=10;
            }

        }

        System.out.println(ans);





        scanner.close();
    }

}
