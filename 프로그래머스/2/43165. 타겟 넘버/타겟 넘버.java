class Solution {
    static int count;
    static boolean[] visited;
    static int tg;
    static int[] nums;
    public int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        count = 0;
        tg = target;
        nums = new int[numbers.length];
        // 빼기 갯수 정하기 (0~N)
        for(int i = 0; i < numbers.length; i++) {
            nums[i] = numbers[i];
        }
        for(int i = 0; i < numbers.length; i++) {
            decide(0, 0, i);
        }
        // 위치 정하기
        return count;
    }
    static void decide(int cur, int depth, int min) {
        if(depth == min) {
            calculate();
            return;
        }
        for(int i = cur;i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                decide(i+1, depth+1, min);
                visited[i] = false;
            }
        }
    }
    static void calculate() {
        int sum = 0;
        String a = "";
        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) {
                sum-=nums[i];
                a+="-"+nums[i];
            }else{
                sum+=nums[i];
                a+="+"+nums[i];
            }
        }
        // System.out.println(a);
        if(sum==tg) {
            count++;
        }
    }
}