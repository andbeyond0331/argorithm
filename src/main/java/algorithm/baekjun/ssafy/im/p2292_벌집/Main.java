package main.java.algorithm.baekjun.ssafy.im.p2292_벌집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int min;
	static int stan;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		min = 1;
		stan = 1;

		if(N != 1){
			counter(N);
			min--;
		}else{
			min = 1;
		}

		System.out.println(min);


	}

	public static int counter (int num) {
		if(stan >= num) {
			return 0;
		}

		if(num>= stan+1 ) {
			stan+=(6*(min-1));
			min++;
			counter(num);
		}
		return 0;
	}
}
