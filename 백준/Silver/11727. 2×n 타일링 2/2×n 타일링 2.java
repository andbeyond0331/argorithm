
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    long mod = 10007;
    long answer = 0;
    long[] dp = new long[n];
    dp[0] = 1;
    if(n>1) {
      dp[1] = 3;
    }
    for(int i = 2; i < n; i++) {
      dp[i] = (dp[i-1] + (2*dp[i-2]))%mod;
    }
    System.out.println(dp[n-1]);
  }
}
