package main.java.algorithm.boj.tier.gold.p16234_인구이동_unsolved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int day;
	static int[][] pop;
	static int[][] union;
	static int[][] land;
//	static boolean[][] visited;
	static int N;
	static int L;
	static int R;
	static int[] dr = {1, -1, 0, 0};
	static int[] dc = {0, 0, 1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

//		union = new int[N][N];
		land = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				land[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		move();

		sb.append(day);

		
		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

	static void move(){
		if(!confirm()){
			return;
		}
		day++;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(union[i][j]!=0){

					land[i][j] = pop[i][j]/union[i][j];
				}
			}
		}
		move();

	}

	static boolean confirm(){
		boolean flag = false;
		pop = new int[N][N];
		union = new int[N][N];
//		visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int standard = land[i][j];
				pop[i][j] += land[i][j];
				for (int k = 0; k < dr.length; k++) {
					int nr = i + dr[k];
					int nc = j + dc[k];
					if(nr>=0 && nr<N && nc>=0 && nc<N){
						if(L<=Math.abs(standard-land[nr][nc]) && Math.abs(standard-land[nr][nc])<=R){
							pop[i][j]+=land[nr][nc];
							union[i][j]++;
							flag = true;
						}
					}
				}
			}
		}
		return flag;
	}
}
