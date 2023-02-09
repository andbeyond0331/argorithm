package main.java.algorithm.baekjun.ssafy.im.p원재의메모리복구하기;

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
			String mem = br.readLine();
			String com = "";
			for (int j = 0; j < mem.length(); j++) {
				com+="0";
			}
//			System.out.println("mem = " + mem);
//			System.out.println("com = " + com);
			int cnt  = 0;
			for (int j = 0; j < mem.length(); j++) {
				if(!com.substring(j,j+1).equals(mem.substring(j,j+1))) {
//					System.out.println("ll");
					cnt++;
					String left = mem.substring(0, j);
					if(mem.substring(j,j+1).equals("0")){
						for (int k = j; k < com.length(); k++) {
							left+="0";
						}
					}else{
						for (int k = j; k < com.length(); k++) {
							left+="1";
						}
					}
					com = left;
				}
			}
//			System.out.println("com = " + com);

			System.out.println("#" + i + " " + cnt);


		}

	}
}
