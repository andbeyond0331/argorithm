class Solution {
    static int[][] dun;
    static int len;
    static int answer;
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        len = dungeons.length;
        dun = new int[len][2];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < 2; j++) {
                dun[i][j] = dungeons[i][j];
            }
        }
        boolean[] visited = new boolean[len];
        
        roll(0, k, visited, "");
        // System.out.println("abc: " + answer);
        
        return answer;
    }
    static void roll (int count, int hp, boolean[] visited, String order) {
        if(count == len) {
            answer = count;
            // System.out.println(answer);
            return;
        }
        for(int i = 0; i < len; i++) {
            if(visited[i]) {
                continue;
            }
            if(dun[i][0]<=hp) {
                // System.out.println("aa: " + order+i);
                answer = Math.max(count+1, answer);
                visited[i] = true;
                roll(count+1, hp-dun[i][1], visited, order+i);
                visited[i] = false;
            } else {
                visited[i] = true;
                roll(count, hp, visited, order+i);
                visited[i] = false;
            }
        }
    }
}