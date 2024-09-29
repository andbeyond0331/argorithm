
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  static Set<Integer> visited;
  static Map<Integer, List<Integer>> map;
  static int[] parents;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    visited = new HashSet<>();
    map = new HashMap<>();
    StringTokenizer st;
    parents = new int[N+1];
    for(int i = 0;i < N-1; i++) {

      st=new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if(map.containsKey(a)) {
        map.get(a).add(b);
      }else {
        List temp = new ArrayList();
        temp.add(b);
        map.put(a, temp);
      }
      if(map.containsKey(b)) {
        map.get(b).add(a);
      } else {
        List temp = new ArrayList();
        temp.add(a);
        map.put(b, temp);
      }
    }
    find(1, -1);
    for(int i = 2; i <= N; i++) {
      System.out.println(parents[i]);
    }

  }
  static void find(int n, int parent) {

    if(visited.contains(n)) {
      return;
    }
    visited.add(n);
    parents[n] = parent;
    for(int i : map.get(n)) {
      find(i, n);
    }
  }
}
