package main.java.ssafy.im.p2491_수열;

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
		int N = Integer.parseInt(br.readLine()); // 수열의 길이

		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int inCnt = 0;
		int inTmp = 1;
		int deCnt = 0;
		int deTmp = 1;

		for (int i = 1; i < N; i++) {
			if(arr[i]>=arr[i-1]){
//				System.out.println("---");
				inTmp++;
				if(i==N-1){
					inCnt = Math.max(inTmp, inCnt);
				}
			}else{
//				System.out.println("===");
				inCnt = Math.max(inTmp, inCnt);
				inTmp = 1;
			}
			if(arr[i]<=arr[i-1]){
				deTmp++;
				if(i==N-1){
					deCnt = Math.max(deTmp, deCnt);
				}
			}else{
				deCnt = Math.max(deCnt, deTmp);
				deTmp = 1;
			}
		}
		if(N==1){
			System.out.println(1);
		}else{

		System.out.println(Math.max(deCnt, inCnt));
		}
//		bw.write(());

		br.close();

	}
}
