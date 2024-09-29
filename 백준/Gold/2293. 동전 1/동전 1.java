
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int[] coins = new int[n];
    int min = 101;
    for(int i = 0; i < n; i++) {
      int temp = Integer.parseInt(bufferedReader.readLine());
      coins[i] = temp;
//      min = Math.min(min, temp);
    }
//    coins[min] = 1;
//    System.out.println("min : " + min);

    int[] target = new int[k+1];
    target[0] = 1;
    for(int coin: coins) {
      for(int i = coin; i <=k; i++) {
        target[i] += target[i-coin];
      }
    }
//    for(int i = 0;i <=k; i++) {
//      System.out.print(target[i] + " ");
//    }
    System.out.println(target[k]);
  }
}