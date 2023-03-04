package main.java.ssafy.d3.p2805_농작물수확하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] price = new int[N][N];
			for (int j = 0; j < N; j++) {
				String line = br.readLine();
				for (int k = 0; k < N; k++) {
					price[j][k] = Integer.parseInt(line.substring(k, k+1));
				}
			}
			int cnt = 0;
			for (int j = 0; j < N; j++) {
				for (int k = Math.abs(j-N/2); k < N-Math.abs(j-N/2); k++) {
					cnt += price[j][k];
				}
			}
			sb.append("#");
			sb.append(i);
			sb.append(" ");
			sb.append(cnt);
			sb.append("\n");
		}// test case


		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
}
