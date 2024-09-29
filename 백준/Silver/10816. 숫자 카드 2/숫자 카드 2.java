
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0;i < N; i++) {
      int temp = Integer.parseInt(st.nextToken());
      if(map.containsKey(temp)) {
        map.put(temp, map.get(temp)+1);
      }else {
        map.put(temp, 1);
      }
    }
    int M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < M; i++) {
      int temp = Integer.parseInt(st.nextToken());
      int ans = map.containsKey(temp)?map.get(temp):0;
      if(i==M-1) {
        sb.append(ans);
      }else{
        sb.append(ans).append(" ");
      }
    }
    System.out.println(sb.toString());
  }
}
