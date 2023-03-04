package main.java.algorithm.boj.tier.bronze.p14696_딱지놀이;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); // 딱지놀이의 총 라운드 수
		StringTokenizer st;

		for (int i = 0; i < N; i++) { // 총 N개의 줄
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken()); // a가 낸 딱지 수
			int[] as = new int[5];
			for (int j = 0; j < a; j++) {
				as[Integer.parseInt(st.nextToken())]++;
			}

			st = new StringTokenizer(br.readLine());

			int b = Integer.parseInt(st.nextToken()); //b가 낸 딱지 수
			int[] bs = new int[5];
			for (int j = 0; j < b; j++) {
				bs[Integer.parseInt(st.nextToken())]++;
			}

			if(as[4]>bs[4]){
				System.out.println("A");
			}else if(as[4]==bs[4]){
				if(as[3]>bs[3]){
					System.out.println("A");
				}else if(as[3]==bs[3]){
					if(as[2]>bs[2]){
						System.out.println("A");
					}else if(as[2]==bs[2]){
						if(as[1]>bs[1]){
							System.out.println("A");
						}else if(as[1]==bs[1]){
							System.out.println("D");
						}else{
							System.out.println("B");
						}
					}else{
						System.out.println("B");
					}
				}else{
					System.out.println("B");
				}
			}else{
				System.out.println("B");
			}


		}

	}
}
