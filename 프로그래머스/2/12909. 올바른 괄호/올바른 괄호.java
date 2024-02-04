import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> temp = new Stack();
        
        for(int i = 0; i < s.length(); i++) {
            if(temp.size()==0) {
                if(s.charAt(i)=='(') {
                    temp.add(1);
                }else {
                    answer = false;
                    break;
                }
            }else {
                if(s.charAt(i)=='(') {
                    temp.add(1);
                }else{
                    temp.pop();
                }
            }
            if(temp.size()>s.length()-i-1) {
                answer = false;
                break;
            }
        }
        if(temp.size()>0) {
            answer = false;
        }
        return answer;
    }
}