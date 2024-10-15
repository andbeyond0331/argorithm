
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static long A;
  static long B; // 81 -> 8 -> 4 -> 2
  static int ans;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    A = Integer.parseInt(st.nextToken());
    B = Integer.parseInt(st.nextToken());
    ans = -1;
    count(B, 1);
    System.out.println(ans);
  }
  static void count(long a, int cnt) {
    if(a<A) {
      return;
    }
    if(a==A) {
      if(ans == -1) {
        ans = cnt;
      }else {
        ans = Math.min(ans, cnt);
      }
    }
    if(a%10!=1) {
      if(a%2!=0) {
      }else{
        count(a/2, cnt+1);
      }
    }else {
      count(a/10, cnt+1);
    }
  }
}
