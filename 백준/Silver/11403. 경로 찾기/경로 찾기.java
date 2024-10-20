
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[][] graph;
//  static int[][] possible;
//  static boolean[][] visited;
  static int N;
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(bufferedReader.readLine());
    StringTokenizer st;
    graph = new int[N][N];
//    possible = new int[N][N];
//    visited = new boolean[N][N];
    for(int i = 0; i < N; i++) {
      st  = new StringTokenizer(bufferedReader.readLine());
      for(int j = 0; j < N; j++) {
        graph[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for(int k = 0; k < N;k++) {
      for(int i = 0;i < N; i++) {
        for(int j = 0; j < N; j++) {
          if(graph[i][k]==1 && graph[k][j]==1) {
            graph[i][j] = 1;
          }
//          graph[i][j] = Math.max(graph[i][j], graph[i][k] )
        }
      }
    }
//    for(int i = 0;i < N; i++) {
//      for(int j = 0; j < N; j++) {
//        check(j, i);
//      }
//    }
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        System.out.print(graph[i][j]+ " ");
      }
      System.out.println();
    }
  }
//  static void check(int r, int start) {
//    for(int i = 0; i < N; i++) {
//      if(graph[r][i]==1&&!visited[r][i]) {
//        visited[r][i] = true;
//        graph[start][i] = 1;
//        check(i, start);
//      }
//    }
//  }
}