class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            String temp;
            temp = s.substring(i) + s.substring(0,i);
            // System.out.println(temp);
            if(check(temp)) {
                answer ++;
            }
        }
        return answer;
    }
    static boolean check(String s) {
        // System.out.println("///");
        int len = s.length();
        if(s.contains("()")) {
            int idx = s.indexOf("()");
            // System.out.println(s);
            s = s.substring(0, idx) + s.substring(idx + 2);
            // System.out.println(s);
        }
        if(s.contains("{}")) {
            int idx = s.indexOf("{}");
            s = s.substring(0, idx) + s.substring(idx + 2);
        }
        if(s.contains("[]")) {
            int idx = s.indexOf("[]");
            s = s.substring(0, idx) + s.substring(idx + 2);
        }
        
        if(s.length()==0) {
            return true;
        }
        if(s.length()==len) {
            return false;
        }
        return check(s);
    }
}