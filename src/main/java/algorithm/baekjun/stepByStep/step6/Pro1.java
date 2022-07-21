package main.java.algorithm.baekjun.stepByStep.step6;

public class Pro1 {

    //정수 N개가 주어졌을 때, n 개의 합을 구하는 함수 작성

    public static long sum(int[] a){

        int length = a.length;

        int total = 0;
        for (int i = 0; i < length; i++) {
            total+=a[i];
        }

        return total;
    }

    public static void main(String[] args) {

        int[] test = {0, 1, 2, 3};
        long result = sum(test);

        System.out.println(result);

    }
}
