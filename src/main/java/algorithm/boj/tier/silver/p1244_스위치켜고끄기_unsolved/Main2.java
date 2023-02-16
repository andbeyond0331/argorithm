package main.java.algorithm.boj.tier.silver.p1244_스위치켜고끄기_unsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
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

		// 입력 다 받음

		for (int i = 0; i < stu; i++) {
			if(sex[i] == 1){ // 남학생
				for (int j = 0; j < N; j++) {
					if(rec[i] == 1){
						sta[j] = (sta[j]==1) ? 0 : 1;
					}else{
						if((j+1)%rec[i]==0){
							sta[j] = (sta[j] == 1) ? 0 : 1;
						}
					}
				}

			}else{
				int idxL = rec[i]-1-1;
				int idxR = rec[i]-1+1;
				int L = idxL;
				int R = idxR;
				boolean flag = false;
				while(idxL>=0 && idxR<=N-1 && sta[idxL]==sta[idxR]) {
					flag = true;
					L = idxL;
					R = idxR;
					idxL--;
					idxR++;
				}
				if(flag) {
					for (int j = L; j <= R ; j++) {
						if(j>=0 && j<=N-1){
							sta[j] = (sta[j] == 1) ? 0 : 1;
						}
					}
				}else{
					sta[rec[i]-1] = (sta[rec[i]-1]==1)? 0 : 1;
				}

			}
//			System.out.println("arr: " + Arrays.toString(sta));
		}
		for (int i = 0; i < sta.length; i++) {
			if(i!=sta.length-1){

				System.out.print(sta[i]+((i+1)%20==0?"\n":" "));
			}else{
				System.out.print(sta[i]);

			}

		}




	}
}
