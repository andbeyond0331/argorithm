package main.java.algorithm.boj.tier.silver.p2634_수이어가기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

//		Set<Integer> set;
		List<Integer> result = new ArrayList<>();

		List<Integer> list;
		int max = 0;
		for (int i = 1; i <= N; i++) {
			// i는 두번째 수
			list = new ArrayList<>();
			list.add(N);
			list.add(i);
			while(list.get(list.size()-2)-list.get(list.size()-1)>=0){
				list.add(list.get(list.size()-2)-list.get(list.size()-1));

			}
//			set = new LinkedHashSet<>();
//			for (int j = 0; j < list.size(); j++) {
//				if(list.get(j)!=0){
//					set.add(list.get(j));
//				}
//			}
			if(max<list.size()){
				max = list.size();
				result = list;
			}
		}

		System.out.println(max);
		for (int num: result
			 ) {
			System.out.print(num + " ");
		}

	}
}
