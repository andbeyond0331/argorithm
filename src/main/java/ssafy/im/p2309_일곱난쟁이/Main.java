package main.java.ssafy.im.p2309_일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] height = new int[9];
		for (int i = 0; i < 9; i++) {
			height[i] = Integer.parseInt(br.readLine());
		}
		
		int[] result = new int[7];
		int sum = 0;
		int idx = 0;
		boolean flag = true;
		for (int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(i!=j){
					for(int k = 0; k < 9; k++) {
						if(k!=i && k!=j) {
							sum+=height[k];
							result[idx++] = height[k];
						}
					}
				}

				if(sum==100){
					flag = false;
					break;
				}
				idx = 0;
				sum = 0;

			}
			if(!flag){
				break;
			}
		}
//		System.out.println(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			for (int j = i+1; j < result.length; j++) {
				if(result[i]>result[j]){
					int temp = result[j];
					result[j] = result[i];
					result[i] = temp;
				}
			}
		}


		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
