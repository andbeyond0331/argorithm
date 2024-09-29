import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

class Node {

  int cur;
  int cnt;

  public Node(int cur, int cnt) {
    this.cur = cur;
    this.cnt = cnt;
  }
}
public class Main {
  static int ans;
  static int target;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    ans = -1;
    if(n==k) {
      System.out.println(0);
      return;
    }
    target = k;
    Node s = new Node(n, 0);
    dfs(s);

    System.out.println(ans);

  }
  static void dfs(Node startNode) {
    Queue<Node> q = new LinkedList<Node>();
    Set<Integer> visited = new HashSet<>();
    q.add(startNode);
    visited.add(startNode.cur);
    while(!q.isEmpty()) {

      Node node = q.poll();
      int c = node.cur;
      int cnt = node.cnt;
//      System.out.println(node.cur + " ");
      // 현재 노드의 인접 노드들을 순회
      int[] temps = {c-1, c+1, c*2};
      for(int i: temps) {
        if(target == i) {
          ans = cnt+1;
          return;
        }
        if(!visited.contains(i) && i>=0 && i<100001) {
          Node n = new Node(i, cnt+1);
          q.add(n);
          visited.add(i);
        }
      }

    }
  }
}

