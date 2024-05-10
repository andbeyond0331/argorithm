import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Long[][] dp;
	static final int NUM = 1000000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new Long[N+1][10];
		for(int i = 0; i < 10; i++) {
			dp[0][i] = 0L;
		}
//		for(int i = 0; i < N+1; i++) {
//			dp[i][0] = 0L;
//		}
		for(int i = 1; i < 10; i++) {
			dp[1][i] = 1L;
		}
		long answer = 0;

		for(int i = 0; i <= 9; i++) {
			answer+=mem(N, i);
			answer%=NUM;
		}
//		for(int i = 0;i < N+1; i++) {
//			for(int j = 0; j < 10; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println(answer%NUM);
	}
	static long mem(int n, int m) {
		if(dp[n][m] == null) {
			if(m==0) {
				dp[n][m] = mem(n-1, m + 1)%NUM;
			} else if(m==9) {
				dp[n][m] = mem(n-1, m - 1)%NUM;
			} else {
				dp[n][m] = (mem(n-1, m-1) + mem(n-1, m+1))%NUM;
			}
		}
		return dp[n][m]%NUM;
	}
}
