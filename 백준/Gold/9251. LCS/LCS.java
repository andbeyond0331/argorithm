
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String t = br.readLine();
		int sLen = s.length();
		int tLen = t.length();
		int[][] dp = new int[sLen + 1][tLen + 1]; // dp 테이블 크기를 문자열 길이 + 1로 설정

		for(int i = 1; i <= sLen; i++) { // 인덱스 1부터 시작
			for(int j = 1; j <= tLen; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) { // 문자가 같다면
					dp[i][j] = dp[i-1][j-1] + 1;
				} else { // 문자가 다르다면
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}

		System.out.println(dp[sLen][tLen]); // 마지막 셀에 저장된 값이 LCS의 길이
	}
}
