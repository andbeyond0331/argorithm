
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static Integer[][] dp;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    dp = new Integer[n][n];
    dp[0][0] = 1;
//    [2][1] = [1][0] + [1][1]
    System.out.println(find(n-1, k-1));
  }
  static int find(int n, int k) {
    if(k == 0 || n == k) {
      dp[n][k] = 1;
    }
    if(dp[n][k]==null) {
      dp[n][k] = find(n-1, k-1) + find(n-1, k);
    }
    return dp[n][k];
  }
}
