package main.java.ssafy.im.hongwoong;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1204_최빈수구하기_문홍웅 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();


		for(int idx = 1; idx <= testCase; idx++) {
			int[] studentScore = new int[1000];
			int[] scoreFre = new int[101];
			int maxFre = Integer.MIN_VALUE;
			int testNum = sc.nextInt();
			for(int i = 0; i < 1000; i++) {
				studentScore[i] = sc.nextInt();
			}

			for(int i = 0; i < 1000; i++) {
				scoreFre[studentScore[i]]++;
			}

			int maxFreI = 0;
			for(int i = 100; i >= 0; i--) {
				if(maxFre < scoreFre[i]) {
					maxFre = scoreFre[i];
					maxFreI = i;
				}
			}
			System.out.println(Arrays.toString(scoreFre));

			System.out.println("#" + idx + " " + maxFreI);
		}
	}
}