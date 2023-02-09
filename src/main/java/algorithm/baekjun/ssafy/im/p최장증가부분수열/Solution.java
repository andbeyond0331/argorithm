package main.java.algorithm.baekjun.ssafy.im.p최장증가부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			int[] length = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			int max = 0;
			for (int j = 0; j < N; j++) {
				length[j] = 1;
				for (int k = 0; k < j; k++) {
					if(arr[k] < arr[j]){
						if(length[j] < length[k]+1){
							length[j] = length[k] + 1;
						}
						if(max < length[j]){
							max = length[j];
						}
					}
				}
			}

			System.out.println("#" + i + " "+ max);

		}



	}
}
