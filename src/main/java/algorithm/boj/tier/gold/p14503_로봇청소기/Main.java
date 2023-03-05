package main.java.algorithm.boj.tier.gold.p14503_로봇청소기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static int[][] room;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int r = Integer.parseInt(st.nextToken()); // 청소기가 있는 칸의 좌표
		int c = Integer.parseInt(st.nextToken()); // 청소기가 있는 칸의 좌표
		int d = Integer.parseInt(st.nextToken()); // 청소기가 바라보고 있는 방향

		room = new int[N][M];
		int toClean = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
				if(room[i][j] == 0){
					toClean++;
				}
			}
		}
		robot(r, c, d);
		int tC = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(room[i][j]==0){
					tC++;
				}
			}
		}
		int result = toClean - tC;
		sb.append(result);

		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

	static void robot(int r, int c, int d){

		room[r][c] = 2;

		for (int i = 0; i < 4; i++) {
			d = (d+3) % 4;
			int nr = r + dr[d];
			int nc = c + dc[d];

			if (nr>=0 && nr<room.length && nc>=0 && nc<room[0].length && room[nr][nc] == 0) {
				robot(nr, nc, d);
				return;
			}
		}
//
//		int cnt = 0;
//		for (int i = 0; i < dr.length; i++) {
//			int nr = r + dr[i];
//			int nc = c + dc[i];
//
//			if (nr>=0 && nr<room.length && nc>=0 && nc<room[0].length) {
//				if(room[nr][nc]==1 || room[nr][nc] == 2){
//					cnt++;
//				}
//			}else{
//				cnt++;
//			}
//		}

		int rr = r - dr[d];
		int rc = c - dc[d];
		if(rr>=0 && rr < room.length && rc>=0 && rc<room[0].length && room[rr][rc]!=1){
			robot(rr, rc, d);
			return;
		}
//		if(cnt==4){

//		}
//		int f = d-1 == -1? 3 : d-1;
//		int fr = r+dr[f];
//		int fc = c+dc[f];
//		int s = f-1 == -1? 3 : f-1;
//		int sr = r+dr[s];
//		int sc = c+dc[s];
//		int t = s-1 == -1? 3 : s-1;
//		int tr = r+dr[t];
//		int tc = c+dc[t];
//		if(fr>=0 && fr<room.length && fc>=0 && fc<room[0].length && room[fr][fc]==0){
//			robot(fr, fc, f);
//		}else if(tr>=0 && tr<room.length && tc>=0 && tc<room[0].length && room[tr][tc]==0){
//			robot(tr, tc, t);
//		}else if(sr>=0 && sr<room.length && sc>=0 && sc<room[0].length && room[sr][sc]==0){
//			robot(sr, sc, s);
//		}
	}
}
