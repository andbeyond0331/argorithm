package main.java.algorithm.boj.tier.bronze.p16433_주디와당근농장;

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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		String y = "";

		if(R%2==C%2){
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(i%2==j%2){
						y+="v";
					}else{
						y+=".";
					}
				}
				y+="\n";
			}
		}else{
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(i%2!=j%2){
						y+="v";
					}else{
						y+=".";
					}
				}
				y+="\n";
			}
		}
		sb.append(y);


		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
}
