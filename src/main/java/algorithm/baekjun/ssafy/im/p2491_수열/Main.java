package main.java.algorithm.baekjun.ssafy.im.p2491_수열;

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

		int max = -1;

		for (int i = 0; i < N; i++) {
			int countI = 1;
			int countD = 1;
			for (int j = i; j < N; j++) {
				if (j != i) {
					if (arr[j] <= arr[j - 1]) {
						countD++;
					}else{
						break;
					}
				}
			}
			for (int j = i; j < N; j++) {
				if(j != i) {
					if(arr[j]>=arr[j-1]){
						countI++;
					}else{
						break;
					}
				}


			}
			if(countI>=max) {
				max =countI;
			}
			if(countD >= max) {
				max =countD;
			}
		}

		bw.write(max);
		bw.close();
		br.close();

	}
}
