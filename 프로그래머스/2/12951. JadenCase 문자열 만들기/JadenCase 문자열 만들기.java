import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
    
        StringTokenizer st = new StringTokenizer(s);
        int tokenAmount = st.countTokens();
        while(s.charAt(0)==' '){
            answer+=" ";
            s = s.substring(1);
        }
        for(int i = 0; i < tokenAmount; i++) {
            String temp = st.nextToken();
            if(temp.charAt(0)>='a' && temp.charAt(0)<='z') {
                answer+=temp.substring(0,1).toUpperCase();
            } else {
                answer+= temp.substring(0,1);
            }
            answer+= temp.substring(1).toLowerCase();
            s = s.substring(temp.length());
            if(s.length()>0) {
                while(s.length()>0 && s.charAt(0)==' '){
                    answer+=" ";
                    if(s.length()>1) {
                        s = s.substring(1);
                    } 
                    else {
                        s = "";
                    }
                }
            }
            
        }
        return answer;
    }
}