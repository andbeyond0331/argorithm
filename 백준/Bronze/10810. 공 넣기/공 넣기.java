import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int i = 0;
    int j = 0;
    int k = 0;
    int[] b = new int[N + 1];
    for (int m = 1; m <= M; m++) {
      st = new StringTokenizer(br.readLine());
      i = Integer.parseInt(st.nextToken());
      j = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());
      for (int p = i; p <= j; p++) {
        b[p] = k;
      }
    }

    for (int r = 1; r < N; r++) {
      System.out.print(b[r] + " ");
    }
    System.out.print(b[N]);
  }

}
