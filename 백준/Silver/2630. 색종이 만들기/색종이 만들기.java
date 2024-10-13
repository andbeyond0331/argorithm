
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  static int[][] paper;
  static int white;
  static int blue;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    white = 0;
    blue = 0;
    paper = new int[N][N];
    for(int i = 0;i < N ;i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < N; j++) {
        paper[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    find(0, N-1, 0, N-1);
    System.out.println(white);
    System.out.println(blue);
  }
  static void find(int sx, int ex, int sy, int ey ){
//    System.out.println("sx = " + sx + ", ex = " + ex + ", sy = " + sy + ", ey = " + ey);
    if(sx==ex && sy==ey) {
      if(paper[sx][sy]==1) {
        blue++;
      }else{
        white++;
      }
      return;
    }
    boolean flag = false;
    int temp = paper[sx][sy];
    outer:for(int i = sx; i<=ex; i++) {
      for(int j = sy; j <=ey;j++) {
        if(paper[i][j]!=temp) {
          flag = true;
          break outer;
        }
      }
    }
    if(flag) {
      find(sx, (sx+ex)/2, sy, (sy+ey)/2);
      find(sx, (sx+ex)/2, (sy+ey)/2+1, ey);
      find((sx+ex)/2+1, ex, sy, (sy+ey)/2);
      find((sx+ex)/2+1, ex, (sy+ey)/2+1, ey);
    }else{
      if(temp == 1) {
        blue++;
      }else{
        white++;
      }
    }
  }
//  static void cut(int sx, int ex, int sy, int ey) {
//    if(sx==ex && sy==ey) {
//      if(paper[sx][sy] == 1) {
//        blue++;
//      }else{
//        white++;
//      }
//      return;
//    }
//    int temp = -1;
//    int startX = 0;
//    int startY = 0;
//    for(int i = sx; i <= ex; i++) {
//      for(int j = sy; j<=ey; j++) {
//        if(temp==-1) {
//          temp = paper[i][j];
//          startX = i;
//          startY = j;
//        }else {
//          if(temp != paper[i][j]) {
//            if(i==0) {
//              cut(startX, startX, )
//            }
//            cut(startX, i-1, startY, j-1);
//            temp = -1;
//            i = i-1;
//            j = j-1;
//          }
//        }
//      }
//    }
//  }
}