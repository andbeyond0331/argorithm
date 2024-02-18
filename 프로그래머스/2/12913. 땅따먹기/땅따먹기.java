import java.util.*;

class Solution {
    // static int[] maxCount;
    // static int recent;
    // static int[][] ground;
    int solution(int[][] land) {
        int answer = 0;
        // maxCount = new int[land.length];
        // recent = -1;
        // ground = land.clone();
        // N행 4열
        for(int i = 1; i < land.length; i++) {
            for(int j = 0; j < 4; j ++) {
                int temp = land[i][j];
                for(int k = 0; k < 4; k++) {
                    if(j!=k) {
                        land[i][j] = Math.max(land[i][j], temp + land[i-1][k]);
                    }
                }
            }
        }
        int last = land.length-1;
        answer = Math.max(land[last][0], Math.max(land[last][1], Math.max(land[last][3], land[last][2])));
        // for(int i = 0 ; i < land.length; i++) {
        //     for(int j = 0; j < land[0].length; j++) {
        //         System.out.print(land[i][j] + " ");
        //     }
        //     System.out.println("");
        // }
        return answer;
    }
    // static void counter() {
    //     // 이전에 밟았던 칸 제외 더할 수 있음
    //     // 1 2 3 5 -> 5 6 7 8
    //     // 
    // }
}