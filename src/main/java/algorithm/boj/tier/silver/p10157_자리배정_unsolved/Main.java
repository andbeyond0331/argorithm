package main.java.algorithm.boj.tier.silver.p10157_자리배정_unsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[][] hall;
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};

	static int num;
	static int K;
	static int r;
	static int c;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()); // 공연장 가로
		int C = Integer.parseInt(st.nextToken()); // 공연장 세로

		hall = new int[R][C];

		K = Integer.parseInt(br.readLine()); // 대기번호 K

		num = 1;

		int stan = R*C;
		int pointer = 0;

		input(0, 0, pointer, R, C);

		System.out.println(r + " " + c);
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(hall[i][j]+ " ");
			}
			System.out.println();
		}




	}

	static void input(int x, int y, int pointer, int R, int C){
		if(num > R*C || num == K+1){
			r = x;
			c = y;
			return;
		}

		if(x>=0 && x<R && y>=0 && y<C && hall[x][y] == 0){
			hall[x][y] = num++;
		}else{
			x-=dr[pointer];
			y-=dc[pointer];
			if(pointer+1==4){
				pointer = 0;
			}else{
				pointer++;
			}
		}

		input(x+dr[pointer], y+dc[pointer], pointer, R, C);
	}
}