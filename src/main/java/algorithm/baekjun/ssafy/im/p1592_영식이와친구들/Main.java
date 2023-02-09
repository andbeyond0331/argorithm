package main.java.algorithm.baekjun.ssafy.im.p1592_영식이와친구들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int count;
	static int[] friends;
	static int N;
	static int M;
	static int L;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());

		friends = new int[N+1];

		count = 0;

		friends[1] = 1;

		counter(1);

		System.out.println(count);


	}

	public static int counter(int num) {
		if(friends[num] == M) {
			return 0;
		}
		if(friends[num] % 2 !=0) {
			if(num+L <= N) {
				count++;
				friends[num+L]++;
				counter(num+L);
			}else{
				count++;
				friends[num+L-N]++;
				counter(num+L-N);

			}
		}else{
			if(num-L>=1) {
				count++;
				friends[num-L]++;
				counter(num-L);
			}else{
				count++;
				friends[num+N-L]++;
				counter(num+N-L);
			}
		}

		return 0;
	}
}
