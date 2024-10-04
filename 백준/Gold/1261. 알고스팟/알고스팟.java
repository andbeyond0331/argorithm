
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int[] dr = {1, 0, -1, 0};
  static int[] dc = {0, 1, 0, -1};
  static boolean[][] visited;
  static int N;
  static int M;
  static int[][] maze;
  static int ans;
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    visited = new boolean[M][N];
    maze = new int[M][N];
    for(int i = 0;i < M; i++) {
      String temp = bufferedReader.readLine();
      for(int j = 0; j < N; j++) {
        maze[i][j] = Integer.parseInt(temp.substring(j, j+1));
      }
    }
    Deque<int[]> deque = new LinkedList<>();
    int[] start = {0, 0, 0};
    deque.add(start);
    visited[0][0] = true;
    while(!deque.isEmpty()) {
      int[] coordinate = deque.poll();
      int r = coordinate[0];
      int c = coordinate[1];
      int count = coordinate[2];
      if(r == M-1 && c == N-1) {
        System.out.println(count);
        return;
      }
      for(int i = 0; i < dr.length; i++) {
        int nr = r + dr[i];
        int nc = c + dc[i];
        if(check(nr, nc)) {
          visited[nr][nc] = true;
          if(maze[nr][nc] == 1) {
            deque.addLast(new int[] {nr, nc, count+1});
          }
          else {
            deque.addFirst(new int[] {nr, nc, count});
          }
        }
      }
    }
  }
  static boolean check(int r, int c) {
    if(r>=0 && r<M && c>=0 && c < N && !visited[r][c]) {
      return true;
    }
    return false;
  }
}
