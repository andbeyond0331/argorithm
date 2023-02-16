package main.java.algorithm.boj.sprout.conditional.Pro5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[31];
		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(bufferedReader.readLine());
			arr[num]  = 1;
		}
		int a = 0;
		int b = 0;
		for (int i = 1; i < 31; i++) {
			if(arr[i] == 0){
				if(a==0){
					a = i;
				}else{
					b = i;
					break;
				}
			}
		}
		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, b));

	}
}
