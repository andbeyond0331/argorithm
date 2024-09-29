
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
  int a;
  int b;
  int c;
  Node(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  @Override
  public int compareTo(Node other) {
    return this.c - other.c;
  }
}

class UnionFind {
  int[] parent, rank;

  public UnionFind(int n) {
    parent = new int[n];
    rank = new int[n];
    for(int i = 0;i < n; i++) {
      parent[i] = i; // 초기에는 자기 자신이 부모
      rank[i] = 1; // 모든 트리의 높이를 1로 초기화
    }
  }

  // Find 연산: 경로 압축 기법 사용
  public int find(int x) {
    if(parent[x] != x) {
      parent[x] = find(parent[x]);
    }
    return parent[x];
  }

  // union: 랭크 기준 두 집합 합치기
  public void union(int x, int y) {
    int rootX = find(x);
    int rootY = find(y);

    if(rootX != rootY) {
      if(rank[rootX]>rank[rootY]) {
        parent[rootY] = rootX;

      }else if(rank[rootX]<rank[rootY]) {
        parent[rootX] = rootY;
      }else{
        parent[rootY] = rootX;
        rank[rootX] += 1;
      }
    }
  }
}
public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st =new StringTokenizer(br.readLine());
    int V = Integer.parseInt(st.nextToken());
    int E = Integer.parseInt(st.nextToken());
    List<Node> mst = new ArrayList<>();
    //
    List<Node> nodes = new ArrayList<>();
    UnionFind uf = new UnionFind(V+1);
    for(int i = 0; i < E; i++) {
      st = new StringTokenizer(br.readLine());
      nodes.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));

    }
    Collections.sort(nodes);
    int ans = 0;
    for(Node n: nodes) {
      if(uf.find(n.a) != uf.find(n.b)) {
        uf.union(n.a, n.b);
        mst.add(n);
        ans+=n.c;
      }
      if(mst.size()==V-1) break;
    }
    System.out.println(ans);
  }
}
