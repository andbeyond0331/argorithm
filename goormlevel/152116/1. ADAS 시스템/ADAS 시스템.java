import java.io.*;
import java.util.*;

class Main {
    static int W, H;
    static char[][] board;
    static boolean[][] visited;
    static PriorityQueue<Node> pq;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int danger;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        board = new char[W][H];
        visited = new boolean[W][H];
        pq = new PriorityQueue<>();
        int startX = 0, startY = 0;

        for (int i = 0; i < W; i++) {
            String line = br.readLine();
            for (int j = 0; j < H; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
            }
        }

        danger = 0;
        pq.add(new Node(startX, startY, 0));
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int r = current.x;
            int c = current.y;
            if (visited[r][c]) continue;
            visited[r][c] = true;
            
            if (board[r][c] == 'E') break;

            danger += calculateDanger(r, c);

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (isValid(nr, nc) && !visited[nr][nc]) {
                    pq.add(new Node(nr, nc, board[nr][nc] == 'E' ? 0 : (board[nr][nc] == 'P' ? 1 : 2)));
                }
            }
        }

        System.out.println(Math.max(danger, 0));
    }

    static int calculateDanger(int r, int c) {
        if (board[r][c] == 'S' || board[r][c] == 'E') return 0;

        int countP = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i == r && j == c) continue;
                if (isValid(i, j) && board[i][j] == 'P') {
                    countP++;
                }
            }
        }

        if (board[r][c] == 'P') {
            return countP - 3;
        }
        return countP;
    }

    static boolean isValid(int r, int c) {
        return r >= 0 && r < W && c >= 0 && c < H;
    }

    static class Node implements Comparable<Node> {
        int x, y, priority;

        Node(int x, int y, int priority) {
            this.x = x;
            this.y = y;
            this.priority = priority;
        }

        @Override
        public int compareTo(Node other) {
            if (this.priority != other.priority) {
                return Integer.compare(this.priority, other.priority);
            }
            if (this.x != other.x) {
                return Integer.compare(this.x, other.x);
            }
            return Integer.compare(this.y, other.y);
        }
    }
}
