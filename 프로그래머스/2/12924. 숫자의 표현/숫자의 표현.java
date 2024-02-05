class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int tmp = n;
            int power = i;
            while(true) {
                // System.out.println("i: " + i + ", power: " + power + ", tmp: " + tmp + ", answer: " + answer);
                if(tmp-power>0) {
                    tmp-=power;
                    power++;
                }else if(tmp-power==0){
                    answer++;
                    break;
                }else {
                    break;
                }
            }
        }
        return answer;
    }
}

// 1 -> 1
// 2 -> 2 -> 1
// 3 -> 1, 2 && 3 -> 2
// 4 -> 