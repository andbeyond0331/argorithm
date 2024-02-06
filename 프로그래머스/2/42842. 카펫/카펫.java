class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        for(int i = 3; i < area; i++) {// height
            if(area % i == 0) {
                if(brown == i + i + (area/i-2) + (area/i-2)) {
                    if(yellow == (i-2)*(area/i-2)) {
                        answer[0] = area/i;
                        answer[1] = i;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}