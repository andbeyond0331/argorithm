package main.java.algorithm.boj.tier.gold.p7576_토마토;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<Tomato> tomatoes;
	static int[] dr = {1, -1, 0, 0};
	static int[] dc = {0, 0, 1, -1};
	static int N;
	static int M;
	static int[][] box;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		box = new int[N][M];

		tomatoes = new LinkedList<>();

		int moc = 0; // minus one count
		int oc = 0; // one count
		int zc = 0; // zero count

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if (box[i][j] == -1) {
					moc++;
				} else if (box[i][j] == 1) {
					oc++;
					tomatoes.add(new Tomato(i, j));
				} else if (box[i][j] == 0) {
					zc++;
				}
			}
		}


		if(zc==0){
			sb.append(0);
		}else{
			// 탐색했을 때 visited가 false이거나 box[i][j]가 0인 애들?

			sb.append(bfs());

		}

		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

	static int bfs(){
		while(!tomatoes.isEmpty()){
			Tomato t = tomatoes.remove();

			int x = t.x;
			int y = t.y;

			for (int i = 0; i < 4; i++) {
				int nx = x+dr[i];
				int ny = y+dc[i];

				if(nx>=0 && nx<N && ny>=0 && ny<M){
					// 토마토 안 익었을 때
					if(box[nx][ny]==0){
						tomatoes.add(new Tomato(nx, ny));
						box[nx][ny] = box[x][y] + 1;
					}
				}
			}
		}
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				System.out.print(box[i][j]+" ");
//			}
//			System.out.println();
//		}

		int ans = -2;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(box[i][j]==0){
					return -1;
				}else{
					ans = Math.max(ans, box[i][j]);
				}
			}
		}

		return ans-1;
	}
	static class Tomato {
		int x;
		int y;
		Tomato (int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
