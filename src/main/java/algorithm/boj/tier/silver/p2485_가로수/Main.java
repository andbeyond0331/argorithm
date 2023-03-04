package main.java.algorithm.boj.tier.silver.p2485_가로수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] tree = new int[N];
		for (int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(tree);

		int first = tree[0];

		for (int i = 0; i < N; i++) {
			tree[i]-=first;
		}

		int last = tree[N-1];
		int gcd = tree[0];
		for (int i = 1; i < tree.length; i++) {
			gcd = gcd(gcd, tree[i]);
		}

		System.out.println(last/gcd-N+1);

	}

	static int gcd(int a, int b){
		if(b==0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
}