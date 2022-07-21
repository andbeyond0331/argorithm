package main.java.algorithm.baekjun.stepByStep.step2;

import java.util.Scanner;

public class Pro7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int prize = 0;

//        if(first==second && first==third){
//            prize = 10000+first*1000;
//            System.out.println(prize);
//        }else if()
//        }
        int count = 0;
        int max = 0;
        int equals = 0;

        int[] nums = {first, second, third};

        for(int i = 0; i<3; i++){
            for(int j = i+1; j<3; j++){
                if(nums[i]==nums[j]){
                    count++;
                    equals=nums[i];
                }

            }
            if(nums[i] > max){
                max=nums[i];
            }
        }

//        System.out.println("count = " + count);



        switch (count){
            case 0:
                System.out.println(max*100);
                break;

            case 1:
                System.out.println(1000+equals*100);
                break;

            case 3:
                System.out.println(10000+first*1000);
                break;



        }


        scanner.close();
    }


}
