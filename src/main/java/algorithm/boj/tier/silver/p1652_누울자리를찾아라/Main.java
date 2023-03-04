package main.java.algorithm.boj.tier.silver.p1652_누울자리를찾아라;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[][] room = new String[N][N];

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				room[i][j] = String.valueOf(line.charAt(j));

			}
		}
		boolean rFlag = false;
		int rCnt = 0;
		for (int i = 0; i <N; i++) {
			for (int j = 0; j < N-1; j++) {
				if(!rFlag && room[i][j].equals(".")){
					if(room[i][j+1].equals(".")){
						rCnt++;
						rFlag = true;
					}
				}else if(room[i][j].equals("X")) {
					rFlag = false;
				}
				if(j==N-2){
					rFlag = false;
				}
			}
		}
		int cCnt = 0;
		boolean cFlag = false;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-1; j++) {
				if(!cFlag && room[j][i].equals(".")){
					if(room[j+1][i].equals(".")){
						cCnt++;
						cFlag = true;
					}
				}else if(room[j][i].equals("X")) {
					cFlag = false;
				}
				if(j==N-2){
					cFlag = false;
				}
			}
		}

		System.out.println(rCnt + " " + cCnt);



	}
}
