
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[][] dp;
	static int[] stairs;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		stairs = new int[T];
		for (int i = 0; i < T; i++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		dp = new Integer[T][3];

		dp[0][0] = 0;			 // 안밟
		dp[0][1] = stairs[0];	 // 연속 밟
		dp[0][2] = stairs[0];	 // 안연속 밟
		if (T == 1) {
			System.out.println(stairs[0]);
			return;
		}
		dp[1][0] = stairs[0];
		dp[1][1] = stairs[0] + stairs[1];
		dp[1][2] = stairs[1];
		if (T == 2) {
			System.out.println(dp[1][1]);
			return;
		}
		for(int i = 2; i < T; i++) {
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = dp[i-1][2] + stairs[i];
			dp[i][2] = Math.max(dp[i-2][1], dp[i-2][2]) + stairs[i];
		}
		System.out.println(Math.max(dp[T-1][1], dp[T-1][2]));

	}
}
