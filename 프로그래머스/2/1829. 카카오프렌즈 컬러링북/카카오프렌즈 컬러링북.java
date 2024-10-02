class Solution {
    static boolean[][] visited;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static int[] answer;

    public int[] solution(int m, int n, int[][] picture) {
        visited = new boolean[m][n];
        answer = new int[2];
        
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && picture[i][j] > 0) {
                    int sizeOfArea = dfs(i, j, picture, m, n, picture[i][j]);
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, sizeOfArea);
                }
            }
        }
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    static int dfs(int r, int c, int[][] picture, int m, int n, int color) {
        visited[r][c] = true;
        int size = 1;
        
        for (int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc] && picture[nr][nc] == color) {
                size += dfs(nr, nc, picture, m, n, color);
            }
        }
        
        return size;
    }
}
