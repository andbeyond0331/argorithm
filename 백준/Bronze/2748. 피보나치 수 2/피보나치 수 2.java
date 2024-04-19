import java.io.*;
import java.util.*;

class Main {
	static long[] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new long[n+1];
		dp[0] = 0;
        if(n == 0) {
            System.out.println(dp[n]);
            return;
        }
		dp[1] = 1;
		if(n == 1) {
			System.out.println(dp[n]);
			return;
		}
		System.out.println(fibo(n));
	}
	
	static long fibo(int n) {
		if(n>0 && dp[n]==0) {
			dp[n] = fibo(n-1) + fibo(n-2);
		}
		return dp[n];
    }
}