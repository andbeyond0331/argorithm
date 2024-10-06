import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int[][] map;
//  static boolean[][] visited;
  static int[] dr = {1, -1, 0, 0};
  static int[] dc = {0, 0, -1, 1};
  static int[][] ans;
  static boolean[][] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st= new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    map = new int[n][m];
    ans = new int[n][m];
    int[] start = new int[3];
    for(int i = 0;i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0;j < m; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
        if(map[i][j]==2) {
          start[0] = i;
          start[1] = j;
          ans[i][j] = 0;
        }else if(map[i][j] == 1) {
          ans[i][j] = -1;
        }
      }
    }
    Queue<int[]> q = new LinkedList<>();
    visited= new boolean[n][m];
    q.add(start);
    visited[start[0]][start[1]] = true;
    while(!q.isEmpty()) {
      
      int[] coordinate = q.poll();
      int r = coordinate[0];
      int c = coordinate[1];
      int depth = coordinate[2];
    //  System.out.println("r = " + r);
    //  System.out.println("c = " + c);
      for(int i = 0; i< dr.length; i++) {
        int nr = r + dr[i];
        int nc = c + dc[i];
        if(check(nr, nc)) {
          ans[nr][nc] = depth+1;
          int[] arr = {nr, nc, depth+1};
          q.add(arr);
          visited[nr][nc] = true;
        }
      }

    }
//    mark(x, y, 0);

    for(int i = 0;i < ans.length; i++) {
      for(int j = 0; j < ans[0].length; j++) {
        System.out.print(ans[i][j] + (j<ans[0].length-1?" ": ""));
      }
      System.out.println();
    }

  }
  static void mark(int r, int c, int d) {
    for(int i = 0; i < dr.length; i++) {
      int nr = r + dr[i];
      int nc = c + dc[i];
      if(check(nr, nc)) {
        if(ans[nr][nc]==-1) {
          ans[nr][nc] = d+1;
          mark(nr, nc, d+1);
        }else {
          ans[nr][nc] = Math.min(ans[nr][nc], d+1);
          mark(nr, nc, ans[nr][nc]);
        }
      }
    }
  }
  static boolean check(int r, int c) {
    if(r>=0 && r<map.length && c>=0 && c<map[0].length && map[r][c]==1 && !visited[r][c]) {
      return true;
    }
    return false;
  }
}