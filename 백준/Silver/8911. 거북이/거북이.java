
import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 입력 받기
    int T = Integer.parseInt(br.readLine());
    // 거북이 상태 기준 저장(방향)
    final int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    // y최대 y최소 x최대 x 최소 초기화(0~500)
//     int yMax = -1;
//     int yMin = 501;
//     int xMax = -1;
//     int xMin = 501;
     int yMax = 0;
     int yMin = 0;
     int xMax = 0;
     int xMin = 0;
    for(int t = 1; t <= T; t++) {
      yMax = 0;
       yMin = 0;
       xMax = 0;
       xMin = 0;
      int tD = 0;
      // 현재 거북이 상태 저장(방향, 위치)
      int[] tL = new int[]{0, 0};
      // 명령 받을 때 거북이 방향 및 위치 설정
      String order = br.readLine();
      for(int o = 0; o < order.length(); o++) {
        switch (order.charAt(o)) {
          case 'F':
            tL[0] += dir[tD][0];
            tL[1] += dir[tD][1];
            break;
          case 'B':
            tL[0] -= dir[tD][0];
            tL[1] -= dir[tD][1];
            break;
          case 'L':
            if ((tD == 0)) {
              tD = 3;
            } else {
              tD -= 1;
            }
            break;
          case 'R':
            if ((tD == 3)) {
              tD = 0;
            } else {
              tD += 1;
            }
            break;

        }
//        System.out.println("xMin = " + xMin);
//        System.out.println("xMax = " + xMax);
//        System.out.println("yMin = " + yMin);
//        System.out.println("yMax = " + yMax);
//        System.out.println("(" + tL[0] + ", " + tL[1] + ")");
        yMax = Math.max(yMax, tL[1]);
        yMin = Math.min(yMin, tL[1]);
        xMax = Math.max(xMax, tL[0]);
        xMin = Math.min(xMin, tL[0]);

      }
//      System.out.println(yMax + ", " + yMin + ", " + xMax + ", " + xMin);
      System.out.println((yMax-yMin)*(xMax-xMin));
    }

  }
}
