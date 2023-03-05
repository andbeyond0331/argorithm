package main.java.algorithm.boj.tier.silver.hw.p1244_스위치켜고끄기;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1244_스위치켜고끄기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int swNum = sc.nextInt();
		int[] sw = new int[swNum];
		boolean[] swB = new boolean[swNum];
		for (int i = 0; i < swNum; i++) {
			sw[i] = sc.nextInt();
			if (sw[i] == 1) {
				swB[i] = true;
			} else {
				swB[i] = false;
			}
		}

		int stNum = sc.nextInt();
		int[][] st = new int[stNum][2];
		for (int i = 0; i < stNum; i++) {
			st[i][0] = sc.nextInt();
			st[i][1] = sc.nextInt();
		}

		for (int i = 0; i < stNum; i++) {
			if (st[i][0] == 1) {
				for (int j = 0; j < swNum; j++) {
					if ((j + 1) % st[i][1] == 0) {
						swB[j] = !swB[j];
					}
				}
			} else {
				swB[st[i][1] - 1] = !swB[st[i][1] - 1];
				for (int j = 1; j < swNum; j++) {
					int left = st[i][1] - 1 - j;
					int right = st[i][1] - 1 + j;
					if (left < 0 || right >= swNum) {
						break;
					}
					if (swB[left] == swB[right]) {
						swB[left] = !swB[left];
						swB[right] = !swB[right];
					} else {
						break;
					}
				}
			}
		}

		for (int i = 0; i < swNum; i++) {
			if (swB[i] == true) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			if ((i+1)  % 20 == 0 && i != 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
	}
}