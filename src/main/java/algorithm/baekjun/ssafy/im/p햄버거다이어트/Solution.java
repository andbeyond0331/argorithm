package main.java.algorithm.baekjun.ssafy.im.p햄버거다이어트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	static int N;
	static int max;
	static int[] tastes;
	static int[] cals;
	static int L;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int testCase = 1; testCase <= T ; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			tastes = new int[N];
			cals = new int[N];
			for (int i = 0; i < N; i++) {
				StringTokenizer stTC = new StringTokenizer(br.readLine());
				tastes[i] = Integer.parseInt(stTC.nextToken());
				cals[i] = Integer.parseInt(stTC.nextToken());

			}

			max = 0;

			dfs(0,0,0);
			System.out.println("#" + testCase + " " + max);
		}


	}

	public static void dfs(int depth, int cal, int score){
		// 최종 점수 확인 후 종료
		if(depth == N) {
			// 최대 점수 갱신
			max = Math.max(max, score);

			return;
		}

		if(cal + cals[depth] <= L){
			dfs(depth + 1, cal + cals[depth], score + tastes[depth]);
		}
		if(cal <= L){
			dfs(depth+1, cal, score);
		}
	}
}
