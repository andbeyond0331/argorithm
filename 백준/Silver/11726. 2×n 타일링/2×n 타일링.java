
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Integer[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		dp = new Integer[n+1];
		dp[1] = 1;
		if(n == 1) {
			System.out.println(1);
			return;
		}
		dp[2] = 2;
		if(n == 2) {
			System.out.println(2);
			return;
		}

		System.out.println(tiling(n)%10007);
	}
	static int tiling(int n) {
		if(dp[n] == null) {
			dp[n] = (tiling(n-1) + tiling(n-2))%10007;
		}
		return dp[n];
	}
}
