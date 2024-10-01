import java.util.*;

class Solution {
    static int len;
    static boolean[] visited;;
    static String possible;
    // static Map<String, Integer> map;
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        len = tickets.length;
        possible = "";
        // map = new HashMap<>();
        visited = new boolean[len];
//         for(int i = 0;i < len; i++) {
            
//         }
        route(tickets, "ICN", "ICN", 0);
        // System.out.println(possible);
        answer = new String[possible.length()/3];
        for(int i = 0;i <= len; i++) {
            answer[i] = possible.substring(3*i, 3*i+3);
        }
        return answer;
    }
    static void route(String[][] tickets, String cur, String path, int cnt) {
        if(cnt==len) {
            if(possible.equals("")) {
                possible = path;
                return;
            }
            if(possible.compareTo(path)>0) {
                possible = path;
                return;
            }
        }
        for(int i = 0; i < len; i++) {
            if(tickets[i][0].equals(cur)) {
                if(!visited[i]) {
                    visited[i] = true;
                    route(tickets, tickets[i][1], path+tickets[i][1], cnt+1);
                    visited[i] = false;
                }
            }
        }
    }
}