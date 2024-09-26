class Solution {
    static int answer;
    static int x;
    static long l;
    static int[] d;
    static int[] t;
    
    public int solution(int[] diffs, int[] times, long limit) {
        
        x = diffs.length;
        l = limit;
        d = new int[x];
        t = new int[x];
        int max = -1;
        if(x == 1) {
            return 1;
        }
        for(int i = 0; i< x; i++) {
            d[i] = diffs[i];
            t[i] = times[i];
            max = Math.max(d[i], max);
        }
        answer = max+1;
        // 현재 퍼즐 난이도 diff
        // 현재 퍼즐 소요 시간 time_cur
        // 이전 퍼즐 소요 시간 time_prev
        // 숙련도 level
        // diff <= level -> time_cur 시간 사용 해결
        // diff > level -> 퍼즐을 총 diff-level번 틀림.
        // 퍼즐 틀릴 때마다 time_cur만큼의 시간 사용하여 추가로 time_prev만큼의 시간 사용해 이전 퍼즐 다시
        // 이전 퍼즐 다시 풀면 난이도 상관 없이 solve
        // diff - level 번 틀린 이후에 다시 퍼즐 풀면 time_cur만큼의 시간 사용하여 퍼즐 해결
        // w:while(true){
        //     long amount = times[0];
        //     for(int i = 1; i < x; i++) {
        //         amount += diffs[i]<=answer?times[i]:(diffs[i]-answer)*(times[i-1]+times[i])+times[i];
        //         if(amount>limit){
        //             answer++;
        //             continue w;
        //         }
        //     }
        //     if(amount<=limit) {
        //         break w;
        //     }
        //     answer++;
        // }
        binary(1, max);
        return answer;
    }
    static boolean check(int tar) {
        long amount = t[0];
        for(int i = 1; i < x; i++) {
            amount += d[i]<=tar?t[i]:(d[i]-tar)*(t[i-1]+t[i])+t[i];
            if(amount>l) {
               return false; 
            }
        }
        if(amount<=l) {
            return true;
        }
        return false;
    }
    static void binary(int left, int right) {
        if(left>right) {
            return;
        }
        int mid = (left+right)/2;
        if(check(mid)) {
            answer = Math.min(answer, mid);
            binary(left, mid-1);
            return;
        }
        binary(mid+1, right);
    }
}