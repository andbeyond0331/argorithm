
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int[][] d;
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    Queue<Integer> q = new LinkedList<>();
    d = new int[N][N];
    for(int i = 0;i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(i==j) {
          d[i][j] = 0;
          continue;
        }
        d[i][j] = 5001;
      }
    }
    for(int i = 0;i < M; i++) {
      st = new StringTokenizer(bufferedReader.readLine());
      int a = Integer.parseInt(st.nextToken())-1;
      int b = Integer.parseInt(st.nextToken())-1;
      d[a][b] = 1;
      d[b][a] = 1;
    }
    for(int k = 0; k < N; k++) {
      for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
//          if()
          d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
        }
      }
    }
    int min = Integer.MAX_VALUE;
    int index = -1;
    for(int i = 0;i < N; i++) {
      int sum = 0;
      for(int j = 0; j < N; j++) {
        sum+=d[i][j];
      }
      if(sum<min) {
        min = sum;
        index = i+1;
      }
    }
    System.out.println(index);
  }
}
//