class Solution {
    static long answer;
    public long solution(int n, int[] times) {
        answer = Long.MAX_VALUE;
        long minTime = 0;
        long maxTime = 0;
        for(int i = 0;i < times.length; i++) {
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        minTime*=n;
        maxTime*=n;
        binary(times, minTime, maxTime, n);
        return answer;
    }
    static void binary(int[] times, long left, long right, int n) {
        if(left>right) {
            return;
        }
        long mid = (left+right)/2;
        long count = 0;
        for(int i = 0;i < times.length; i++) {
            count+=mid/times[i];
            if(count>=n) {
                answer = Math.min(answer, mid);
                binary(times, left, mid-1, n);
                return;
            }
        }
        binary(times, mid+1, right, n);
        // if(count>n) {
        //     binary(times, mid+1, right, n);
        // }else{
        //     answer = Math.min(answer, mid);
        //     binary(times, left, mid, n);
        // }
    }
}