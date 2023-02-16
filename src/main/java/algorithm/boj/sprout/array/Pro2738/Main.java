package main.java.algorithm.boj.sprout.array.Pro2738;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine() ," ");
		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());
		int[][] mat = new int[N][M];
		int[][] rix = new int[N][M];
		for (int i = 0; i < N; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for (int j = 0; j < M; j++) {
				mat[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		for (int i = 0; i < N; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
			for (int j = 0; j < M; j++) {
				rix[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(mat[i][j] + rix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
