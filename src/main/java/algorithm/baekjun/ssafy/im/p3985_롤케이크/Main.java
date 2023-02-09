package main.java.algorithm.baekjun.ssafy.im.p3985_롤케이크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine());

		int N = Integer.parseInt(br.readLine());

		int[] Ps = new int[N];
		int[] Ks = new int[N];
		int expected = -1;
		int maxEx = -1;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			Ps[i] = Integer.parseInt(st.nextToken());
			Ks[i] = Integer.parseInt(st.nextToken());
			if(Ks[i]-Ps[i] >maxEx){
				maxEx = Ks[i]-Ps[i];
				expected = i+1;
			}
		}

		// 길이 l미터 롤케이크
		// 엔명에게 케이크 나눠줌
		// 펼쳐서 1미터 단위로 잘라놓음
		// 왼쪽이 1번 ~ 엘번
		// 방청객은 1~엔번
		int[] cake = new int[L+1];
		for (int i = 0; i < N; i++) {
			for(int w = Ps[i]; w<=Ks[i]; w++) {
				if(cake[w]==0){
					cake[w] = i+1;
				}
			}
		}
//		System.out.println(Arrays.toString(cake));
		int[] cnt = new int[N+1];
		for (int i = 1; i <= L; i++) {
			if(cake[i]!=0) {
				cnt[cake[i]]++;
			}

		}
//		System.out.println(Arrays.toString(cnt));
		int max = -1;
		int num = -1;

		for (int i = N; i >= 1; i--) {
			if(cnt[i]>=max){
				max = cnt[i];
				num = i;
			}
		}




		System.out.println(expected);
		System.out.println(num);
	}
}
