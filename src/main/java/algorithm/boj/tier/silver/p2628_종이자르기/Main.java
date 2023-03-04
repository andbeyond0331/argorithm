package main.java.algorithm.boj.tier.silver.p2628_종이자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		// 가로 세로 최대 100
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		// 종이 arr
		int[][] paper = new int[r][c];

		// 잘라야 할 점선의 개수
		int dots = Integer.parseInt(br.readLine());

		// 가로와 세로 따로 저장
		List<Integer> rs = new ArrayList<>(); // 가로 점선 번호
		List<Integer> cs = new ArrayList<>(); // 세로 점선 번호
		rs.add(0);
		cs.add(0);
		rs.add(r);
		cs.add(c);

		for (int i = 0; i < dots; i++) {
			st = new StringTokenizer(br.readLine());
			int rOrC = Integer.parseInt(st.nextToken());
			if(rOrC == 1) {
				rs.add(Integer.parseInt(st.nextToken()));

			}else if(rOrC == 0){
				cs.add(Integer.parseInt(st.nextToken()));
			}else{
				System.out.println("Wrong!!!");
			}
		}

		rs.sort(Comparator.naturalOrder());
		cs.sort(Comparator.naturalOrder());

		int max = 0;

		for (int i = 1; i < rs.size(); i++) {
			for (int j = 1; j < cs.size(); j++) {
//				System.out.println("i: " + i);
//				System.out.println("j: " + j);
//				System.out.println("cs.get(j) = " + cs.get(j));
//				System.out.println("cs.get(j-1) = " + cs.get(j-1));
//				System.out.println("rs.get(i) = " + rs.get(i));
//				System.out.println("rs.get(i-1) = " + rs.get(i-1));
//				System.out.println((cs.get(j)-cs.get(j-1))*(rs.get(i)-rs.get(i-1)));
				max = Math.max(max, (cs.get(j)-cs.get(j-1))*(rs.get(i)-rs.get(i-1)));
			}
		}
		System.out.println(max);
//		System.out.println(Arrays.toString(rs.toArray()));
//		System.out.println(Arrays.toString(cs.toArray()));

//		// dots줄만큼 한 줄에 점선이 하나씩
//		for (int i = 0; i < dots; i++) {
//			st = new StringTokenizer(br.readLine());
//			int rc = Integer.parseInt(st.nextToken());
//			int number = Integer.parseInt(st.nextToken());
//			if(rc == 0){
//				for (int j = 0; j < c; j++) {
//					paper[number][j] = 1;
//				}
//			}else if(rc==1){
//				for (int j = 0; j < r; j++) {
//					paper[r][number] = 1;
//				}
//			}
//		}
//
//		int max = 0; // 최대 넓이
//
//		// 다 잘랐으니까 이제 검증해서 넓이 저장
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				int tmp = 0;
//			}
//		}
	}
}