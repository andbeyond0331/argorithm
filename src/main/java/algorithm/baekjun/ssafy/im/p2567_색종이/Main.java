package main.java.algorithm.baekjun.ssafy.im.p2567_색종이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] paper = new int[101][101];

		int[] ls = new int[N];
		int[] us = new int[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ls[i] = Integer.parseInt(st.nextToken());
			us[i] = Integer.parseInt(st.nextToken());

			for (int j = ls[i]; j < ls[i] + 10; j++) {
				for (int k = us[i]; k < us[i] + 10; k++) {
					paper[j][k] = 1;
				}
			}
		}

//		for (int i = 0; i < 101; i++) {
//			for (int j = 0; j < 101; j++) {
//				System.out.print(paper[i][j]);
//			}
//			System.out.println();
//		}

		int[] dr = {1, -1, 0, 0};
		int[] dc = {0, 0, 1, -1};
		for (int j = 0; j < 101; j++) {
			for (int k = 0; k < 101; k++) {
				int count = 0;
				for (int l = 0; l < dr.length; l++) {
					int nr = j + dr[l];
					int nc = k + dc[l];
					if (nr >= 0 && nr <= 100 && nc >= 0 && nc <= 100) {
						if (paper[nr][nc] > 0 && paper[j][k]==0) {
							count++;
						}
					}
				}
//				System.out.println("-=-==-=-=-=-=-=-=-=-=-=-");
//				System.out.println("count = " + count);
//				System.out.println("j = " + j);
//				System.out.println("k = " + k);
				switch (count) {
					case 0:
						break;
					case 1:
						paper[j][k] = -1;
						break;
					case 2:
						paper[j][k] = -2;
						break;
					case 4:
						paper[j][k] = -4;
						break;
					default:
						System.out.println("Something's strange at counting switch");
				}
			}
		}

		int result = 0;
		for (int l = 0; l < 101; l++) {
			for (int m = 0; m < 101; m++) {
				if (paper[l][m] < 0) {
					result-=paper[l][m];
				}
			}
		}

		for (int i = 0; i < 101; i++) {
			if(paper[0][i]>0){
				result++;
			}

			if(paper[i][0]>0){
				result++;
			}
		}

//		for (int i = 0; i < 101; i++) {
//			for (int j = 0; j < 101; j++) {
//				System.out.print(paper[i][j]);
//			}
//			System.out.println();
//		}

		System.out.println(result);

	}
}

