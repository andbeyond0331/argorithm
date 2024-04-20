import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bufferedReader.readLine());
		int[][] dp = new int[T][3]; // dp[i][j]는 연속으로 j번 밟고 T일 때의 최대 점수
		int[] stairs = new int[T];
		for(int i = 0; i < T; i++) {
			stairs[i] = Integer.parseInt(bufferedReader.readLine());
		}
		dp[0][0] = 0;
		dp[0][1] = stairs[0];
		dp[0][2] = stairs[0];
		if(T==1) {
			System.out.println(stairs[0]);
			return;
		}
		dp[1][0] = dp[0][1];
		dp[1][1] = stairs[1];
		dp[1][2] = stairs[1] + dp[0][1];
		if(T==2) {
			System.out.println(dp[1][2]);
            return;
		}
		for(int i = 2; i < T; i++) {
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2]) + stairs[i];
			dp[i][2] = dp[i-1][1] + stairs[i];
		}
		System.out.println(Math.max(dp[T-1][1], dp[T-1][2]));
	}
}
