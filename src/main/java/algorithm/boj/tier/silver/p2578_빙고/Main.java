package main.java.algorithm.boj.tier.silver.p2578_빙고;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		int[][] bingo = new int[5][5];
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[] mc = new int[25];
		int idx = 0; // 몇 번까지 불렀어?
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				mc[idx++] = Integer.parseInt(st.nextToken());
			}
		}
		int result = 0;
		for (int i = 0; i < mc.length; i++) { // 사회자가 부른 수
			int cnt = 0;
			int xTmp1 = 0;
			int xTmp2 = 0;
			if(i<4){
				outer: for (int j = 0; j < 5; j++) {
					for (int k = 0; k < 5; k++) {
						if(bingo[j][k]==mc[i]){
							bingo[j][k] = 0;
							break outer;
						}
					}
				}
			}else{
				out: for (int j = 0; j < 5; j++) {
					for (int k = 0; k < 5; k++) {
						if(bingo[j][k]==mc[i]){
							bingo[j][k] = 0;
							break out;
						}
					}
				}
				// 빙고 나옴?

				for (int j = 0; j < 5; j++) {

					int rTmp = 0;
					for (int k = 0; k < 5; k++) {
						if(bingo[j][k]==0){
							rTmp++;
							if(k==j){
//								System.out.println("i: " + i + ", k: " + k + ", j: " + j);
								xTmp1++;
							}
							if(k+j==4){
								xTmp2++;
//								System.out.println("i: " + i + ", k: " + k + ", j: " + j);
							}
						}



					}

					if(rTmp==5){
//						System.out.println("11111: " +i);
						cnt++;
					}
				}
				for (int j = 0; j < 5; j++) {
					int cTmp = 0;
					for (int k = 0; k < 5; k++) {
						if(bingo[k][j]==0){
							cTmp++;
						}
					}
					if(cTmp==5){
//						System.out.println("2222: " + i);
						cnt++;
					}
				}



			}
			if(xTmp1==5){
//				System.out.println("3333: " + i);
				cnt++;
			}
			if(xTmp2==5){
//				System.out.println("4444: " + i);
				cnt++;
			}
			if(cnt>=3){
				result = i+1;
				break;
			}
		}

		System.out.println(result);







	}
}
