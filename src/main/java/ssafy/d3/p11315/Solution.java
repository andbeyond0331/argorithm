package main.java.ssafy.d3.p11315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			char[][] board = new char[N][N];
			boolean flag = false;
			for (int j = 0; j < N; j++) {
				String line = br.readLine();
				for (int k = 0; k < N; k++) {
					board[j][k] = line.charAt(k);

				}

			}
			
			if(!flag) {
				int[] dr = {1, 1, 1, 0};
				int[] dc = {-1, 1, 0, 1};
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < N; k++) {
						if(board[j][k]=='o'){
							for (int l = 0; l < dr.length; l++) {
								int cnt = 1;

								for (int m = 1; m <= 4; m++) {
									int nr = j+(dr[l]*m);
									int nc = k+(dc[l]*m);
									if(nr>=0 && nr <= N-1 && nc>=0 && nc<=N-1){
										if(board[nr][nc]=='o'){
											cnt++;
										}
									}
								}
								if(cnt==5){
									flag = true;
									break;
								}
							}

						}


					}
				}
			}
			String result = (flag ? "YES" : "NO");
			System.out.printf("#%d %s\n", i, result);




		}// testcase
	}
}
