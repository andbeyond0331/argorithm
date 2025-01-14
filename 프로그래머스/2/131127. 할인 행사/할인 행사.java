import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        // 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속 일치할 경우에 맞춰 회원가입
        Map<String, Integer> goal = new HashMap<>();
        Map<String, Integer> current = new HashMap<>();
        for(int i = 0;i < want.length; i++) {
                goal.put(want[i], number[i]);
        }
        
        for(int i = 0; i < 10; i++) {
             if(current.containsKey(discount[i])) {
                 current.put(discount[i], current.get(discount[i])+1);
             } else {
                 current.put(discount[i], 1);
             }
        }
        boolean flag = true;
        for(String s:goal.keySet()) {
            if(current.containsKey(s)) {
                if(current.get(s) == goal.get(s)) {
                    continue;
                }
                flag = false;
                break;
            }else {
                flag = false;
                break;
            }
        }
        if(flag) {
            answer++;
        }
        flag = true;
        
        for(int i = 10; i < discount.length; i++) {
            if(current.get(discount[i-10]) == 1) {
                current.remove(discount[i-10]);
            } else {
                current.put(discount[i-10], current.get(discount[i-10])-1);
            }
            if(current.containsKey(discount[i])) {
                current.put(discount[i], current.get(discount[i])+1);
            } else {
                current.put(discount[i], 1);
            }
            for(String s:goal.keySet()) {
                if(current.containsKey(s)) {
                    if(current.get(s) == goal.get(s)) {
                        continue;
                    }
                    flag = false;
                    break;
                }else {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                answer++;
            }
            flag = true;
        }
        return answer;
    }
}