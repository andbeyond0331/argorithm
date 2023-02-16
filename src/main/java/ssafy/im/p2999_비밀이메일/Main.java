package main.java.ssafy.im.p2999_비밀이메일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String message = br.readLine();

		// 총 N글자
		// R<=C R*C=N인 R과 c
		// 여러개면 R이 큰 값 고름

		// 행이 R 열이 C

		// 메시지를 첫번째부터 씨번때열까지 순서대로 옮기고 남은 메시지는 두번째 행, 세번째행,, 알번째 행에 첫번째 행을 채운 방법과 동일 순서로 옮김
		//

		int N = message.length();

		int R = 0;
		int C = 0;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if(N%i==0){
				int a = N/i;
				int b = i;
				if(Math.min(a, b) >R){
					R = Math.min(a,b);
					C = Math.max(a,b);
				}
			}
		}
		String[][] code = new String[R][C];
		int idx = 0;
		for(int r = 0; r< C; r++) {
			for (int c = 0; c < R; c++) {
				code[c][r] = message.substring(idx, idx+1);
				idx++;
			}
		}

		String result = "";
		for(int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				result+=code[r][c];
			}
		}
		System.out.println(result);
	}
}
