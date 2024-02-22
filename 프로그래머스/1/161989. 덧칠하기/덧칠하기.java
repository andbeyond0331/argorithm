class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;
        for(int i = 0; i < section.length; i++) {
            if(last>section[i]){
                continue;
            }
            last = section[i]+m;
            answer++;
        }
        return answer;
    }
}