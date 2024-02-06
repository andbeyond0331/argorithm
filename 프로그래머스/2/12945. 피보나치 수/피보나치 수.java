import java.util.*;

class Solution {
    static int[] fibos;
    static boolean[] visited;
    public int solution(int n) {
        fibos = new int[100001];
        visited = new boolean[100001];
        int answer = 0;
        fibos[0] = 0;
        fibos[1] = 1;
        visited[0] = true;
        visited[1] = true;
        answer = fibo(n);
        return answer;
    }
    static int fibo(int i ) {
        if(!visited[i]) {
            fibos[i] = fibo(i-1) + fibo(i-2);
            visited[i] = true;
        }
        
        return fibos[i]%1234567;
    }
}
