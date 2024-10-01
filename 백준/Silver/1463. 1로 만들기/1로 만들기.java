
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(br.readLine());
    // 3으로 나누어 떨어지면 3 나눔
    // 2로 나누어 떨어지면 2 나눔
    // 1 뺌

    int[] dp = new int[N+1];
    dp[1] = 0;
    if(N>1) {
      dp[2] = 1;
    }
    for(int i = 3;i <= N; i++) {
      int temp = dp[i-1]+1;
      if(i>=3 && i%3==0) {
        temp = Math.min(temp, dp[i/3]+1);
      }
      if(i%2==0) {
        temp = Math.min(temp, dp[i/2]+1);
      }
      dp[i] = temp;
    }
    System.out.println(dp[N]);
  }
}
