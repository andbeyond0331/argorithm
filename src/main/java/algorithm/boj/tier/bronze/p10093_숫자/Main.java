package main.java.algorithm.boj.tier.bronze.p10093_숫자;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());

		StringBuilder sb = new StringBuilder();
		if( A== B){
			sb.append(0);
		}else{

			sb.append((Math.abs(B-A)-1)+"\n");
		}

		for (long i = Math.min(A, B)+1; i < Math.max(B, A); i++) {
			sb.append(i+(i==B-1?"":" "));
		}

		bw.append(String.valueOf(sb));
		bw.flush();

		br.close();
		bw.close();

	}
}
