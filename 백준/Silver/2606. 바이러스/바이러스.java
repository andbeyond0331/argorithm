
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  static Set<Integer> set;
  static int[][] computers;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int n = Integer.parseInt(br.readLine());
    int pair = Integer.parseInt(br.readLine());
    computers = new int[n+1][n+1];
    set = new HashSet<>();
    for(int i = 0;i < pair; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      computers[a][b] = 1;
      computers[b][a] = 1;
    }
    computers[1][1] = 1;
    count(1);
    System.out.println(set.size()-1);

  }
  static void count(int a) {
    if(set.contains(a)) {
      return;
    }
    set.add(a);
    for(int i = 1;i< computers.length; i++) {
      if(computers[a][i]==1) {
        count(i);
      }
    }
  }
}
