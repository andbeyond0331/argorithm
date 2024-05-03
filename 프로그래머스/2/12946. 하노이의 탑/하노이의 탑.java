import java.util.*;

class Solution {
    static List<int[]> moves;
    public int[][] solution(int n) {
        
        moves = new ArrayList<>();
        move(1, 3, n, 2);
        int[][] answer = new int[moves.size()][2];
        for(int i = 0; i < moves.size(); i++) {
            answer[i][0] = moves.get(i)[0];
            answer[i][1] = moves.get(i)[1];
        }
        
        return answer;
    }
    static void move(int from, int to, int n, int sub) {
        if(n==0){
            return;
        }
        move(from, sub, n-1, to);
        int[] temp = new int[2];
        temp[0] = from;
        temp[1] = to;
        moves.add(temp);
        move(sub, to, n-1, from);
    }
}