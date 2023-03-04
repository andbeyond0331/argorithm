package main.java.ssafy.터리.색칠하기;

import java.util.Scanner;

public class 색칠하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int a = 1; a <= T; a++) {
			int N = sc.nextInt();
			int[][] arr = new int[10][10];
			int count = 0;

			for (int b = 0; b < N; b++) {
				int r1 = sc.nextInt();
				int c1 = sc.nextInt();
				int r2 = sc.nextInt();
				int c2 = sc.nextInt();
				int color = sc.nextInt();


				for (int r = r1; r <= r2; r++) {
					for (int c = c1; c <= c2; c++) {
						arr[r][c] += color;
						System.out.println("r: " + r + ", c: " + c + ", ");
					}
				}


				for (int d = 0; d < 10; d++) {
					for (int e = 0; e < 10; e++) {
						if (arr[d][e] == 3)
							count++;
					}
				}
			}
			System.out.printf("#%d %d\n",a,count);
		}
	}
}
