class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        // t초 동안 붕대를 감으면서 1초마다 x만큼의 체력 회복
        // t초 연속 붕대 감기 성공 -> y만큼의 체력 회복(최대 체력 존재)
        int index = 0; // 현재 공격
        int time = 0;
        int combo = 0;
        while(index < attacks.length) {
            if(answer<=0) {
                return -1;
            }
            if(attacks[index][0]==time) {
                answer-=attacks[index][1];
                if(answer<=0) {
                    return -1;
                }
                index++;
                combo = 0;
            } else {
                combo++;
                answer+=bandage[1];
                if(combo==bandage[0]) {
                    answer+=bandage[2];
                    combo = 0;
                }
                answer = answer>=health ? health : answer;
            }
            time++;
        }
        
        return answer;
    }
}