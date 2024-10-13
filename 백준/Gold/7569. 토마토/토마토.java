
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int[] dr = {1, -1, 0, 0, 0, 0};
  static int[] dc = {0, 0, 1, -1, 0, 0};
  static int[] dh = {0, 0, 0, 0, 1, -1};
  static int[][][] tomato;
  static int M, N, H;
  static boolean[][][] visited;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    M = Integer.parseInt(st.nextToken()); // 가로
    N = Integer.parseInt(st.nextToken()); // 세로
    H = Integer.parseInt(st.nextToken()); // 높이
    visited = new boolean[H][N][M];
    tomato = new int[H][N][M];
    Queue<int[]> q = new LinkedList<>();
    boolean flag = false;
    for(int i = 0;i < H; i++) {
      for(int j = 0; j < N; j++) {
        st = new StringTokenizer(br.readLine());
        for(int k = 0; k <M; k++) {
          tomato[i][j][k] = Integer.parseInt(st.nextToken());
          if(tomato[i][j][k]==1) {
            int[] arr = new int[4];
            arr[0] = i;
            arr[1] = j;
            arr[2] = k;
            arr[3] = 0;
            q.add(arr);
            visited[i][j][k] = true;
          }else if(tomato[i][j][k]==-1) {
            visited[i][j][k] = true;
          }else {
            flag = true;
          }

        }
      }
    }
    if(!flag) {
      System.out.println(0);
      return;
    }
    while(!q.isEmpty()) {
//      System.out.println("aa");
      int[] where = q.poll();
      int h = where[0];
      int r = where[1];
      int c = where[2];
      int count = where[3];
      for(int i = 0;i < dh.length; i++) {
        int nh = h+dh[i];
        int nr = r+dr[i];
        int nc = c+dc[i];
        if(check(nh, nr, nc)) {
          visited[nh][nr][nc] = true;
          if(tomato[nh][nr][nc] == 0){
            tomato[nh][nr][nc] = count+1;
//            visited[nh][nr][nc] = true;
            int[] temp = {nh, nr, nc, count+1};
            q.add(temp);
          }
        }
      }
    }

    int answer = -1;
    for(int i = 0;i < H; i++) {
      for(int j = 0; j < N; j++) {
        for(int k = 0; k < M; k++) {
         if(tomato[i][j][k]==0) {
           System.out.println(-1);
           return;
         }else if(tomato[i][j][k]>=1) {
           answer = Math.max(answer, tomato[i][j][k]);
         }
        }
      }
    }
    System.out.println(answer);

  }
//  static void raw(int h, int r, int c) {
//    for(int i = 0;i < 5; i++) {
//      int nh = h+dh[i];
//      int nr = r+dr[i];
//      int nc = c+dc[i];
//      if(check(nh, nr, nc)) {
//        if(tomato[nh][nr][nc]==0){
//          tomato[nh][nr][nc] = 1;
//          raw(nh, nr, nc);
//        }
//      }
//    }
//  }
  static boolean check(int h, int r, int c) {
    if(h>=0 && h<H && r>=0 && r < N && c>=0 && c<M && !visited[h][r][c]) {
      return true;
    }
    return false;
  }
}