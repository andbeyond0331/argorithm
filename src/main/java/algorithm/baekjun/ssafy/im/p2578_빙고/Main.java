package main.java.algorithm.baekjun.ssafy.im.p2578_빙고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] bingo = new int[5][5];
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] mc = new int[5][5];
		int binCnt = 0;
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				mc[i][j] = Integer.parseInt(st.nextToken());
				for (int k = 0; k < 5; k++) {
					for (int l = 0; l < 5; l++) {
						if(bingo[k][l]==mc[i][j]){
							bingo[k][l] = 0;
							break;
						}
					}
				}


			}
		}





//		// 엑스자방탐색 방향
//		int[] xr = {1, 1, -1, -1};
//		int[] xc = {1, -1, -1, 1};
//
//		// 십자탐색 방향
//		int[] cr = {1, -1, 0, 0};
//		int[] cc = {0, 0, 1, -1};
//
//		int mc = 0;
//		int winning = 0;
//
//		for (int i = 0; i < 5; i++) {
//			StringTokenizer st1 = new StringTokenizer(br.readLine());
//			for (int j = 0; j < 5; j++) {
//				mc++;
//				int call = Integer.parseInt(st1.nextToken());
//				int x = 0;
//				int y = 0;
//				for (int k = 0; k < 5; k++) {
//					for (int l = 0; l < 5; l++) {
//						if(bingo[k][l] == call) {
//							x = k;
//							y = l;
//							bingo[k][l] = 0;
//							break;
//						}
//					}
//				}
//				boolean flag = true;
//				// 대각선 탐색
//				if(x==y || x+y==4) {
//					for (int k = 0; k < 4; k++) {
//						for (int l = 0; l < 5; l++) {
//							int nx = x+xr[k]*l;
//							int ny = y+xc[k]*l;
//
//							if(nx>=0 && ny>=0 && nx<=4 && ny <=4){
//								if(bingo[nx][ny] != 0) {
//									flag = false;
//									break;
//								}
//							}
//						}
//
//					}
//				}
//				// 십자 탐색
//				if(flag) {
//					for (int k = 0; k < 4; k++) {
//						for (int l = 0; l < 5; l++) {
//							int nx = x+cr[k]*l;
//							int ny = y+cc[k]*l;
//
//							if(nx>=0 && ny>=0 && nx<=4 && ny <=4){
//								if(bingo[nx][ny] != 0) {
//									flag = false;
//									break;
//								}
//							}
//						}
//
//					}
//				}
//				if(flag && winning==0){
//					winning=mc;
//					break;
//				}
//			}
//		}
//
//		System.out.println(winning);
//


	}
}
