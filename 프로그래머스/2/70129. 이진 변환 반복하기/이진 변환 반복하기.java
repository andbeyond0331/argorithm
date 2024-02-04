import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        while(!s.equals("1")) {
            // System.out.println(s);
            if(s.contains("0")) {
                int tmpLength = s.length();
                // System.out.println(s);
                s = s.replaceAll("0", "");
                // System.out.println("s: " + s);
                zero += tmpLength - s.length();
            }
            if(!s.equals("1")) {
                int target = s.length();
                String repS = "";
                int max = 0;
                // while(true) {
                //     if(Math.pow(2, max)<target) {
                //         max++;
                //     } else{
                //         break;
                //     }
                // }
                while(true) {
                    if(Math.pow(2,max)>target) {
                        max--;
                        break;
                    }
                    max++;
                }
                // System.out.println("target: " + target + ", max: " + max);
                while(max>=0) {
                    if(target>=Math.pow(2,max)) {
                        repS+="1";
                        target-= Math.pow(2,max);
                    }else{
                       repS+="0"; 
                    }
                    max--;
                    
                }
                s = repS;
                count++;
            }
        }
        answer[0] = count+1;
        answer[1] = zero;
        return answer;
    }
}