
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
//  static int[] dr = {1, -1, 0, 0};
  static int[] dr = {0, 1, -1, 0};
//  static int[] dc = {0, 0, 1, -1};
  static int[] dc = {1, 0, 0, -1};
  static int[][] maze;
  static int N;
  static int M;
  static boolean[][] visited;
  static int ans;
  static Queue<int[]> q;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    q = new LinkedList();
    visited= new boolean[N][M];
    maze = new int[N][M];
    for(int i = 0;i <N; i++) {
      String temp = br.readLine();
      for(int j = 0; j < M; j++) {
        maze[i][j] = Integer.parseInt(temp.substring(j, j+1));
      }
    }
    int[] start = {0, 0, 1};
    q.add(start);
    visited[0][0] = true;
    ans = N*M+1;
    while(!q.isEmpty()) {
      int[] coordinate = q.poll();
      int r = coordinate[0];
      int c = coordinate[1];
      if(r == N-1 && c == M-1) {
        ans = Math.min(ans, coordinate[2]);
        continue;
      }
      for(int i = 0;i < dr.length; i++) {
        int nr = r+dr[i];
        int nc = c+dc[i];
        int count = coordinate[2];
        if(check(nr, nc)) {
          maze[nr][nc] = count+1;
          int[] arr = {nr, nc, count+1};
          q.add(arr);
          visited[nr][nc] = true;
        }
      }
    }
    System.out.println(ans);
  }
  
  static boolean check(int n, int r) {
    if(n>=0 && r>=0 && n<N && r<M && !visited[n][r] && maze[n][r] == 1) {
      return true;
    }
    return false;
  }
}
