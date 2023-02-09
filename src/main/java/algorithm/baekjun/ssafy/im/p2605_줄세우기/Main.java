package main.java.algorithm.baekjun.ssafy.im.p2605_줄세우기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		List<Integer> list = new ArrayList<>();

		int stu = 1;

		for (int i = 0; i < N; i++) {
			list.add(list.size() - arr[i], stu++);
		}

		for(int i = 0; i < N; i++) {
			System.out.print(list.get(i)+" ");
		}

	}
}
