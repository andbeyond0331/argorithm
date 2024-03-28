class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] memo = new int[triangle.length][];
        for(int i = 0; i < triangle.length; i++) {
            memo[i] = new int[triangle[i].length];
        }
        for(int i = 0; i < triangle.length; i++) {
            if(i==0) {
                memo[i][0] = triangle[i][0];
            }else{
                for(int j = 0; j < triangle[i].length; j++) {
                    if(j==0) {
                        memo[i][j] = triangle[i][j] + memo[i-1][j];
                    } else if(j==triangle[i].length-1) {
                        memo[i][j] = triangle[i][j] + memo[i-1][j-1];
                    } else{
                        memo[i][j] = Math.max(memo[i-1][j], memo[i-1][j-1]) + triangle[i][j];
                    }
                }
            }
        }
        // for(int i = 0;i < memo.length; i ++) {
        //     for(int j = 0; j<memo[i].length; j++) {
        //         System.out.print(memo[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for(int i = 0; i < memo[memo.length-1].length; i++) {
            answer = Math.max(answer, memo[memo.length-1][i]);
        }
        return answer;
    }
}