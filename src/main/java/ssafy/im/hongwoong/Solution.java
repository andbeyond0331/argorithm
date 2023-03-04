package main.java.ssafy.im.hongwoong;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {

			int N = sc.nextInt();
			int[] num = new int[N];

			for (int i = 0; i < N; i++) {
				num[i] = sc.nextInt();
			}

			int M = 1;
			for (int i = 1; i <= N; i++) {
				M += i;
			}

			M = M / 2 + 1;
			int[] cal = new int[M];

			int a = 0;
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					cal[a++] = num[i] * num[j];
				}
			}

			int maxNum = 0;

			for (int i = 0; i < cal.length; i++) {
				int danzo = cal[i];
				int k = 0;
				while (cal[i] > 10) {
					k = cal[i] % 10;
					cal[i] /= 10;
					if (cal[i] % 10 > k) {
						danzo = Integer.MIN_VALUE;
						break;
					}

				}
				if (maxNum < danzo) {
					maxNum = danzo;
				}
			}

			System.out.println("#" + tc + " " + maxNum);

		}
	}
}