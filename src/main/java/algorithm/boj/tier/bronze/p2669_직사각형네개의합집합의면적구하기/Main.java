package main.java.algorithm.boj.tier.bronze.p2669_직사각형네개의합집합의면적구하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int N = Integer.parseInt(br.readLine()); // 수열의 길이

		int[][] arr = new int[100][100];
		StringTokenizer st;
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			for (int j = x; j < x1; j++) {
				for (int k = y; k < y1; k++) {
					arr[j][k] = 1;
				}
			}
		}

		int cnt = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(arr[i][j]==1){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		br.close();

	}
}
