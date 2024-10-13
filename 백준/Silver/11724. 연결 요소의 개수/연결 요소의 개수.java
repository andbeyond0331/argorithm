
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static boolean[][] connect;
  static boolean[] visited;
  static int N, M;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());

    connect = new boolean[N][N];
    visited = new boolean[N];

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken()) - 1;
      int b = Integer.parseInt(st.nextToken()) - 1;
      connect[a][b] = true;
      connect[b][a] = true;
    }

    int answer = 0;
    for (int i = 0; i < N; i++) {
      if (!visited[i]) {
        dfs(i); // 방문되지 않은 노드에서 DFS 시작
        answer++; // 새로운 연결 요소를 찾았으므로 개수를 증가
      }
    }

    System.out.println(answer);
  }

  static void dfs(int node) {
    visited[node] = true;
    for (int i = 0; i < N; i++) {
      if (connect[node][i] && !visited[i]) {
        dfs(i); // 연결된 노드로 재귀 탐색
      }
    }
  }
}
