package main.java.algorithm.boj.tier.silver.p2468_안전영역_unsolved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int cnt;
	static boolean[][] visited;
	static int[] dr = {1, -1, 0, 0};
	static int[] dc = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[][] h = new int[N][N];
		int heighest = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				h[i][j] = Integer.parseInt(st.nextToken());
				heighest = Math.max(heighest, h[i][j]);
			}
		}

		// 높이를 잘 받아왔으니까 탐색을 해보자
		// 먼저 물에 잠긴 높이가 1부터 시작하는거야(0일 땐 안전영역이 1이니까 1을 비교대상으로 쓰자)
		// 가장 높은 높이만큼 차면 안전영역은 0이니까 신경 쓸 필요 없어
		int max = 1;
		for (int height = 1; height < heighest; height++) {
//			// 여기서는 새로운 지도를 만들어서 height보다 작거나 같은 수는 모두 0으로 만들거야
//			int[][] nH = new int[N][N];
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					nH[i][j] = h[i][j]<=height ? 0 : h[i][j];
//				}
//			}
			visited = new boolean[N][N];
			cnt = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(!visited[i][j] && h[i][j]>height){
						search(h, i, j, height);
						cnt++;
					}
				}
			}
			max = Math.max(max, cnt);

		}

		sb.append(max);

		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

	static void search(int[][] map, int r, int c, int height){
		visited[r][c] = true;

		for (int i = 0; i < dr.length; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if( nr >=0 && nr < map.length && nc >=0 && nc < map.length){
				if(!visited[nr][nc] && map[nr][nc] > height){
					search(map, nr, nc, height);
				}
			}
		}
	}
}
