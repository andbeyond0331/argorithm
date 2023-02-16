package main.java.algorithm.boj.tier.silver.p1244_스위치켜고끄기_unsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 런타임에러(ArrayIndexOutOfBounds)

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine()); // 스위치 개수
		int[] sta = new int[N]; // 각 스위치 상태
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sta[i] = Integer.parseInt(st.nextToken());
		}

		int stu = Integer.parseInt(br.readLine()); //  학생 수
		int[] sex = new int[stu]; // 각 학생의 성별
		int[] rec = new int[stu]; // 학생이 받은 수

		for (int i = 0; i < stu; i++) {
			st = new StringTokenizer(br.readLine());

			sex[i] = Integer.parseInt(st.nextToken());
			rec[i] = Integer.parseInt(st.nextToken());
		}
		if(N != 1){
			for (int i = 0; i < stu; i++) {
				if(sex[i] == 1){ // 남학생
					for (int j = 0; j < sta.length; j++) {
						if(j != 0 && (j+1)%(rec[i])==0){
							if(sta[j]==0){
								sta[j] = 1;
							}else if(sta[j]==1){
								sta[j] = 0;
							}
						}
					}

				}else{
					int idxL = rec[i]-1-1;
					int idxR = rec[i]+1-1;
					while(idxL>0 && idxR<N-1 && sta[idxL] == sta[idxR]){
						idxL--;
						idxR++;
					}

					for (int j = idxL; j <= idxR ; j++) {
						if(j>=0 && j<=N-1){

							if(sta[j]==0){
								sta[j] = 1;
							}else if(sta[j] == 1){
								sta[j] = 0;
							}
						}
					}
				}
			}

		}

		for (int i = 0; i < sta.length; i++) {
			System.out.print(sta[i] + (i==sta.length-1 ? "" :" "));
		}




	}
}
