package main.java.algorithm.baekjun.ssafy.im.p2564_경비원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int w = Integer.parseInt(st.nextToken()); // 가로의 길이
		int h = Integer.parseInt(st.nextToken()); // 세로의 길이

		// 상점의 개수
		int n  = Integer.parseInt(br.readLine());

		// 상점 위치
		int[] storeX = new int[n];
		int[] storeY = new int[n];

		for (int i = 0; i < n; i++) {
			StringTokenizer stores = new StringTokenizer(br.readLine(), " ");
			storeX[i] = Integer.parseInt(stores.nextToken());
			storeY[i] = Integer.parseInt(stores.nextToken());
		}

		// 동근이 위치
		StringTokenizer dongs = new StringTokenizer(br.readLine(), " ");
		int dongX = Integer.parseInt(dongs.nextToken());
		int dongY = Integer.parseInt(dongs.nextToken());

		int result = 0;
		for (int i = 0; i < n; i++) {
			if(dongX == storeX[i]) {
				result+= Math.abs(dongY-storeY[i]);
			}else if(dongX+storeX[i] == 3 ) {
				result+= Math.min(h+dongY+storeY[i], h+(w-dongY)+(w-storeY[i]));
			}else if(dongX+storeX[i] == 7){
				result+= Math.min(w+dongY+storeY[i], w+(h-dongY)+(h-storeY[i]));
			}else if(dongX+storeX[i] == 4) {
				result+= dongY+storeY[i];
			}else if(dongX+storeX[i] == 5) {
				switch(dongX) {
					case 1:
						result+=(w-dongY)+storeY[i];
						break;
					case 2:
						result+=(h-storeY[i])+dongY;
						break;
					case 3:
						result+=(h-dongY)+storeY[i];
						break;
					case 4:
						result+=dongY+(w-storeY[i]);
						break;
				}
			}else if(dongX+storeX[i] == 6) {
				switch(dongX){
					case 2:
						result+=(w-dongY)+(h-storeY[i]);
						break;
					case 4:
						result+=(h-dongY)+(w-storeY[i]);
						break;
				}
			}else{
				System.out.println("Sonething's Strange!!!");
			}


		}

		System.out.println(result);



	}
}
