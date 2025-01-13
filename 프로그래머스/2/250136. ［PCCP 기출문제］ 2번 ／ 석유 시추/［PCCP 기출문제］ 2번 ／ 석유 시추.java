import java.util.*;

class Solution {
    static int[] dr = {1, -1, 0, 0}; // 상하좌우 이동
    static int[] dc = {0, 0, 1, -1};
    static int[][] ground; // 덩어리 번호를 기록
    static boolean[][] visited; // 방문 여부
    static int n, m; // 행, 열 크기
    static int num; // 덩어리 번호
    static int[] sum; // 덩어리 크기 기록
    static int[][] range; // 덩어리의 열 범위

    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        ground = new int[n][m];
        visited = new boolean[n][m];
        num = 0;
        sum = new int[n * m + 1];
        range = new int[n * m + 1][2];

        for (int i = 0; i < range.length; i++) {
            range[i][0] = Integer.MAX_VALUE; // 최소 열
            range[i][1] = Integer.MIN_VALUE; // 최대 열
        }

        // 연결된 석유 덩어리를 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && land[i][j] == 1) {
                    num++;
                    dfs(i, j, land);
                }
            }
        }

        // 열별로 석유량 계산
        int maxOil = 0;
        for (int col = 0; col < m; col++) {
            int tempOil = 0;
            for (int i = 1; i <= num; i++) {
                if (range[i][0] <= col && col <= range[i][1]) {
                    tempOil += sum[i];
                }
            }
            maxOil = Math.max(maxOil, tempOil);
        }

        return maxOil;
    }

    // DFS를 사용해 덩어리를 탐색
    static void dfs(int r, int c, int[][] land) {
        visited[r][c] = true;
        ground[r][c] = num;
        sum[num]++;
        range[num][0] = Math.min(range[num][0], c); // 최소 열
        range[num][1] = Math.max(range[num][1], c); // 최대 열

        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (check(nr, nc, land)) {
                dfs(nr, nc, land);
            }
        }
    }

    // 이동 가능 여부 체크
    static boolean check(int r, int c, int[][] land) {
        return r >= 0 && r < n && c >= 0 && c < m && !visited[r][c] && land[r][c] == 1;
    }
}
