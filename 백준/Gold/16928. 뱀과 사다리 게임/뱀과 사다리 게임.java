
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
  static int[] board = new int[101];
  static boolean[] visited = new boolean[101];

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    Queue<int[]> q = new LinkedList<>();
    int N = Integer.parseInt(st.nextToken()); // 사다리 개수
    int M = Integer.parseInt(st.nextToken()); // 뱀 개수

    // 사다리 정보 입력
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(bufferedReader.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      board[start] = end; // 사다리 도착지 설정
    }

    // 뱀 정보 입력
    for(int i = 0; i < M; i++) {
      st = new StringTokenizer(bufferedReader.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      board[start] = end; // 뱀 도착지 설정
    }

    // BFS로 탐색
    visited[1] = true;
    q.add(new int[]{1, 0}); // {위치, 주사위 굴린 횟수}
    while(!q.isEmpty()) {
      int[] current = q.poll();
      int position = current[0];
      int diceCount = current[1];

      // 100번 칸에 도착하면 종료
      if (position == 100) {
        System.out.println(diceCount);
        return;
      }

      // 주사위 굴리기 (1~6)
      for (int i = 1; i <= 6; i++) {
        int newPosition = position + i;
        if (newPosition > 100) continue; // 100번 칸을 넘으면 안 됨

        // 뱀이나 사다리가 있으면 이동
        if (board[newPosition] != 0) {
          newPosition = board[newPosition];
        }

        // 새로운 위치에 방문하지 않았다면 큐에 추가
        if (!visited[newPosition]) {
          visited[newPosition] = true;
          q.add(new int[]{newPosition, diceCount + 1});
        }
      }
    }
  }
}
