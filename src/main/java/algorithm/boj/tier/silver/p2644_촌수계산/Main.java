package main.java.algorithm.boj.tier.silver.p2644_촌수계산;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int m = Integer.parseInt(br.readLine());

		List<Integer>[] family = new ArrayList[m+1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());

			if(family[p]==null){
				List<Integer> tmp = new ArrayList<>();
				tmp.add(q);
				family[p] = tmp;
			}else{
				family[p].add(q);
			}

		}

		List<Integer> aParents = new ArrayList<>();

//		System.out.println(Arrays.toString(parents(aParents, family, a).toArray()));
		parents(aParents, family, a).toArray();

		// b의 부모도 aParents에 있는지 확인하기
		List<Integer> bParents = new ArrayList<>();

		parents(bParents, family, b);
		int result = -1;

		for (int i = 0; i<bParents.size(); i++) {
			if(aParents.contains(bParents.get(i))){
				result = i+1 + aParents.indexOf(bParents.get(i))+1;
//				System.out.println("i = " + i);
//				System.out.println("bParents.get(i) = " + bParents.get(i));
				break;
			}
		}
		sb.append(result);

		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
	static List parents (List<Integer> prnts, List<Integer>[] family, int q){

		for (int i = 0; i < family.length; i++) {
			if(family[i]!=null){
				if(family[i].contains(q)){
					if(!prnts.contains(i)){
						prnts.add(i);
						return parents(prnts, family, i);
					}
				}
			}
		}
		return prnts;
	}


}
