
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  static int[][] apt;
  static Map<Integer, Integer> map;
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, 1, -1};
  static int N;
  static int numbering;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    apt = new int[N][N];
    numbering = 1;
    map = new HashMap<>();
    for(int i = 0;i < N; i++) {
      String temp = br.readLine();
      for(int j = 0;j < N; j++) {
        apt[i][j] = Integer.parseInt(temp.substring(j, j+1));
      }
    }
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(apt[i][j] == 1) {
          numbering++;
          apt[i][j] = numbering;
          map.put(numbering, 1);
          count(i, j);
        }
      }
    }
    List<Integer> list =new ArrayList();
    for(int i:map.keySet()) {
      list.add(map.get(i));
    }
    Collections.sort(list);
    System.out.println(list.size());
    for(int i = 0;i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
  static void count(int x, int y) {
    for(int i = 0; i < dx.length; i++) {
      int nx = x+dx[i];
      int ny = y+dy[i];
      if(check(nx, ny)) {
        apt[nx][ny] = numbering;
        map.put(numbering, map.get(numbering)+1);
        count(nx, ny);
      }
    }
  }
  static boolean check(int x, int y) {
    if(x>=0 && y>=0 && x<N && y<N && apt[x][y]==1) {

      return true;
    }
    return false;
  }
}
