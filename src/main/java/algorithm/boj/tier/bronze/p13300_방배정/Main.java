package main.java.algorithm.boj.tier.bronze.p13300_방배정;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[][] paper = new int[1001][1001];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			for (int j = x; j < x+width; j++) {
				for (int k = y; k < y+height; k++) {
					paper[j][k] = i;
				}
			}
		}
		int[] cnt = new int[N+1];
			for (int j = 0; j < 1001; j++) {
				for (int k = 0; k < 1001; k++) {
					if(paper[j][k]!=0){
						cnt[paper[j][k]]++;
					}
				}
			}
			for (int i = 1; i <= N; i++) {
				System.out.println(cnt[i]);
			}




		
		

	}
}
