package main.java.ssafy.d3.p6190_정곤이의단조증가하는수;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine());
			int[] nums = new int[N];
			for (int j = 0; j < N; j++) {
				nums[j] = Integer.parseInt(st.nextToken());
			}

			int max = 0;
			for (int j = 0; j < N; j++) {
				for (int k = j+1; k < N; k++) {
					// 단조 증가수인가?
					int n = nums[j]*nums[k];
					int tmp = n;
					String s = String.valueOf(n);
					int[] jaritsu = new int[s.length()];
					for (int l = 0; l < s.length(); l++) {
						jaritsu[l] = n%10;
						n/=10;
					}
//					System.out.println(Arrays.toString(jaritsu));
					boolean flag = true;
					for (int l = 1; l < s.length(); l++) {
						if (jaritsu[l]>jaritsu[l-1]){
							flag = false;
						}

					}
					if(flag){
//						System.out.println("max: " + max + ", tmp: " + tmp);
						max = Math.max(max, tmp);
					}
				}
			}
			sb.append("#");
			sb.append(i);
			sb.append(" ");
			if(max==0){
				sb.append(-1);
			}else{

				sb.append(max);
			}
			sb.append("\n");
		}

		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
}
