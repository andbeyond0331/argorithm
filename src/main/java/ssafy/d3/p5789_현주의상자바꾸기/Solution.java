package main.java.ssafy.d3.p5789_현주의상자바꾸기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int[] box = new int[N+1];

			for (int j = 1; j <= Q; j++) {
				st = new StringTokenizer(br.readLine());
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
				for (int k = L; k <= R; k++) {
					box[k] = j;
				}
			}
			sb.append("#");
			sb.append(i);
			sb.append(" ");
			for (int j = 1; j < N+1; j++) {
				sb.append(box[j]);
				if(j==N){
					sb.append("\n");
				}else{

					sb.append(" ");
				}
			}
		}

		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
}
