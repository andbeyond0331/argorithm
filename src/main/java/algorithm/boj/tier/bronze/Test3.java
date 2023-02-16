package main.java.algorithm.boj.tier.bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException {
		// 연속된 숫자 입력받기
		// 012345678
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		char[] arr = s.toCharArray();
		for( char c : arr) {
			int num = c - '0'; // '0' - '0' = 0
			// 48  - 48  = 0
			// '1' - '0' = 1
			// 49  - 48  = 1
			System.out.printf("'%c'(%d) => %d \n", c, (int)c, num);
		}

	}
}