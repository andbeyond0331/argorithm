
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    // 난이도 의견 없으면 0
    // 하나 이상 있다면 모든 사람의 의견 30% 절사평균(위 15 아래 15 제외하고 평균 계산.) 제외 수는 위, 아래에서 각각 반올림
    // 평균도 정수로 반올림
    int exclude = (int) Math.round(n*0.15);
    int ans = 0;
    int[] op = new int[n];
    for(int i = 0; i < n; i++) {
      op[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(op);
    for(int i = exclude;i < n-exclude; i++) {
//      int temp =
//      if(i>=exclude+1 && i<n-exclude) {
//      System.out.println("i: " + i + ", : " + op[i]);
        ans+=op[i];
//      }
    }
//    System.out.println(ans);
    System.out.println(Math.round((double)ans/(n-exclude-exclude)));
  }
}
// 5->