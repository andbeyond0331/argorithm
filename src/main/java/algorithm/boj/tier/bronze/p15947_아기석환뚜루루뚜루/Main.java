package main.java.algorithm.boj.tier.bronze.p15947_아기석환뚜루루뚜루;

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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		String result = "";
		switch(N%14){
			case 1: case 13:
				result = "baby";
				break;
			case 2: case 0:
				result = "sukhwan";
				break;
			case 5:
				result = "very";
				break;
			case 6:
				result = "cute";
				break;
			case 9:
				result = "in";
				break;
			case 10:
				result = "bed";
				break;
			case 3: case 7: case 11:
				if(N/14==0){
					result += "tururu";
				}else if(N/14==1){
					result += "turururu";
				}else if(N/14==2){
					result += "tururururu";
				}else {
					result += "tu+ru*"+(N/14+2);
				}
				break;
			case 4: case 8: case 12:
				if(N/14==0){
					result += "turu";
				}else if(N/14==1){
					result += "tururu";
				}else if(N/14==2){
					result += "turururu";
				}else if(N/14==3) {
					result += "tururururu";
				}else {
					result += "tu+ru*"+(N/14+1);
				}
				break;
		}

		sb.append(result);


		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
}
