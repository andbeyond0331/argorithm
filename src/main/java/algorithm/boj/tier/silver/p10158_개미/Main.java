package main.java.algorithm.boj.tier.silver.p10158_개미;

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

		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		int t = Integer.parseInt(br.readLine());

		int P = t+p;
		int Q = t+q;

		int x = 0;
		int y = 0;

		if( P/w == 0 ){ // 만약 움직여도 네모 안의 너비라면
			x = P;
		}else if( (P/w)%2 != 0 ){
			x = w-(P%w);
		}else {
			x = P%w;
		}

		if( Q/h == 0 ){
			y = Q;
		} else if( (Q/h)%2 != 0 ){
			y = h - (Q%h);
		} else{
			y = Q%h;
		}
		sb.append(x).append(" ").append(y);


		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
}
