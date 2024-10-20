
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[][] paper;
  static int[][] sums1;
  static int[][] sums2;
  static int N;
  static int M;
  static int max;
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    paper = new int[N][M];
    sums1 = new int[N][M];
    sums2 = new int[N][M];
    max = -1;
    for(int i = 0;i < N; i++) {
      st = new StringTokenizer(bufferedReader.readLine());
      for(int j = 0; j < M; j++) {
        paper[i][j] = Integer.parseInt(st.nextToken());
        if(i==0) {
          if(j==0) {
            sums1[i][j] = paper[i][j];
            sums2[i][j] = paper[i][j];
          }else{
            sums1[i][j] = paper[i][j]+sums1[i][j-1];
            sums2[i][j] = paper[i][j];
          }
        }else {
          if(j==0) {
            sums1[i][j] = paper[i][j];
            sums2[i][j] = paper[i][j] + sums2[i-1][j];
          }else{
            sums1[i][j] = paper[i][j] +sums1[i][j-1];
            sums2[i][j] = paper[i][j] +sums2[i-1][j];
          }
        }
      }
    }
    // 4개 칸 최대 합 - 일단 깡으로
//    for(int i = 0;i < N; i++) {
//      for(int j = 0; j < M; j++) {
//        System.out.print(sums2[i][j] + " ");
//      }
//      System.out.println();
//    }
    for(int i = 0;i < N; i++) {
      for(int j =0; j < M;j++) {
        plus(i, j);
      }
    }
    System.out.println(max);
  }
  static void plus(int r, int c) {
    int start = paper[r][c];
    // 가로부터
    if(checkY(c+1)) { // 두 칸
      int second = start + paper[r][c+1]; // 가로로 두 칸 합
      if(checkX(r+1)) {
        if(checkY(c-1)) {
          max = Math.max(max, second+paper[r+1][c]+paper[r+1][c-1]);
        }
        max = Math.max(max, second+paper[r+1][c]+paper[r+1][c+1]);
        if(checkY(c+2)) {
          max = Math.max(max, second+paper[r+1][c+1]+paper[r+1][c+2]);
        }
      }
      if(checkY(c+2)) {// 세칸
        int third = second + paper[r][c+2];
        if(checkX(r-1)) {
          max = Math.max(max, third+Math.max(paper[r-1][c], Math.max(paper[r-1][c+1], paper[r-1][c+2])));
        }
        if(checkX(r+1)) {
          max = Math.max(max, third+Math.max(paper[r+1][c], Math.max(paper[r+1][c+1], paper[r+1][c+2])));

        }
        if(checkY(c+3)) {// 네칸
          max = Math.max(third + paper[r][c+3], max);
        }
      }

    }// end of 가로
    if(checkX(r+1)) {// 세로 두 개
      int second = start + paper[r+1][c];
      if(checkX(r-1)) {
        if(checkY(c+1)) {
          max = Math.max(max, second+paper[r][c+1]+paper[r-1][c+1]);
        }
      }
      if(checkX(r+2)) { // 세로 세 개
        if(checkY(c+1)) {
          max = Math.max(max, second+Math.max(paper[r+1][c+1]+paper[r+2][c+1], paper[r+2][c]+Math.max(paper[r][c+1], Math.max(paper[r+1][c+1], paper[r+2][c+1]))));

        }
        if(checkY(c-1)) {
          max = Math.max(max, second+Math.max(paper[r+1][c-1]+paper[r+2][c-1], paper[r+2][c]+Math.max(paper[r][c-1], Math.max(paper[r+1][c-1], paper[r+2][c-1]))));
        }
        if(checkX(r+3)) {
          max = Math.max(max, second+paper[r+2][c]+paper[r+3][c]);
        }
      }

    }
  }
  static boolean checkX(int r) {
    if(r>=0 && r<N) {
      return true;
    }
    return false;
  }
  static boolean checkY(int c) {
    if(c>=0 && c<M) {
      return true;
    }
    return false;
  }
}