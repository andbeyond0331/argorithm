class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++) {
            int sec = 0;
            boolean flag = false;
            for(int j = i+1; j < prices.length; j++) {
                if(prices[i]>prices[j]) {
                    sec = j-i;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                sec = prices.length-i-1;
            }
            answer[i] = sec;
            // if(i!=prices.length-1 && answer[i] == 0) {
            //     answer[i] = 1;
            // }
        }
        return answer;
    }
}