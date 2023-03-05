package main.java.algorithm.boj.tier.gold.p2096_내려가기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][] line;
	static int[][] min;
	static int[][] max;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		line = new int[N][3];
		min = new int[N][3];
		max = new int[N][3];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				line[i][j] = Integer.parseInt(st.nextToken());

			}
		}
		min[0][0] = max[0][0] = line[0][0];
		min[0][1] = max[0][1] = line[0][1];
		min[0][2] = max[0][2] = line[0][2];

		for (int i = 1; i < N; i++) {
			min[i][0] = Math.min(min[i-1][0], min[i-1][1])+line[i][0];
			min[i][1] = Math.min(min[i-1][0], Math.min(min[i-1][1], min[i-1][2])) + line[i][1];
			min[i][2] = Math.min(min[i-1][1], min[i-1][2]) + line[i][2];

			max[i][0] = Math.max(max[i-1][0], max[i-1][1])+line[i][0];
			max[i][1] = Math.max(max[i-1][0], Math.max(max[i-1][1], max[i-1][2])) + line[i][1];
			max[i][2] = Math.max(max[i-1][1], max[i-1][2]) + line[i][2];


		}

		sb.append(Math.max(max[N-1][0], Math.max(max[N-1][1], max[N-1][2])))
						.append(" ")
								.append(Math.min(min[N-1][0], Math.min(min[N-1][1], min[N-1][2])));


		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

}
