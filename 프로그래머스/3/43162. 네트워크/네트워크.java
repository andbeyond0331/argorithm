class Solution {
    static int cnt;
    static int min;
    static boolean flag;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        cnt = 1;
        min = 0;
        for(int i =0; i < n;i++) {
            for(int j = 0; j < n; j++) {
                if(computers[i][j] == 1) {
                    computers[i][j] = -1;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            flag = false;
            counter(computers, i);
            if(flag) {
                cnt++;
            }
        }
        // for(int i = 0; i < n; i++) {
        //     for(int j =0; j < n; j++) {
        //         System.out.print(computers[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        answer = min;
        return answer;
    }
    
    static void counter(int[][] computers, int cur) {
        for(int i = 0; i <computers.length; i++) {
            if(computers[cur][i] == -1) {
                flag = true;
                computers[cur][i] = cnt;
                computers[i][cur] = cnt;
                min = cnt;
                counter(computers, i);
            }
        }
        
    }
}