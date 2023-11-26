class Solution {
    // 마이너스 개수 0부터 5
    // 하나씩 넣어보고 개수 다 차면 return
    static int n = 0;
    static boolean[] visited;
    static int[] nums;
    static int ans = 0;
    static int tar = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        n = numbers.length;
        visited = new boolean[n];
        nums = numbers;
        tar = target;
        for(int i = 0; i < n; i++) {
            dfs(i, 0, 0);
        }
        answer = ans;
        return answer;
    }
    
    static void dfs(int amount, int current, int depth) {
        // System.out.println("amount: " + amount + ", current  : " + current + ", depth: " + depth);
        if(amount == current) {
            int tmp = 0;
            for(int i = 0; i < nums.length; i ++) {
                if(visited[i]) {
                    tmp-=nums[i];
                }else{
                    tmp+=nums[i];
                }
            }
            if(tmp == tar) {
                // System.out.println(depth);
                // for(boolean b: visited) {
                //     System.out.print(b + " ");
                // }
                
                ans ++;
            }
            return;
        }
        // visited[depth] = true;
        // dfs(amount, current+1, depth+1);
        // visited[depth] = false;
        // dfs(amount, current+1, depth);
        for(int i = depth; i< nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(amount, current+1, i+1);
                visited[i] = false;
            }
        }
        
    }
}