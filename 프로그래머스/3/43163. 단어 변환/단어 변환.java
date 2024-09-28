import java.util.*;

class Solution {
    static boolean[] visited;
    static int[][] cnt;
    static int min;
    
    public int solution(String begin, String target, String[] words) {
        min = 51;
        int answer = 0;
        int len = words.length;
        visited = new boolean[len+1];
        visited[len] = true;
        int t = -1;
        cnt = new int[len+1][len+1];
        for(int i = 0;i < len; i++) {
            if(counter(begin, words[i])==1) {
                cnt[len][i] = 1;
                cnt[i][len] = 1;
            }
            if(words[i].equals(target)) {
                t = i;
            }
            if(i<len-1) {
                for(int j = i+1; j < len; j++) {
                    if(j!=i) {
                        if(counter(words[i], words[j]) == 1) {
                            cnt[i][j] = 1;
                            cnt[j][i] = 1;
                        }
                    }
                }
            }
        }
        if(t == -1) {
            return 0;
        }
        // for(int i = 0;i < len+1; i++) {
        //     for(int j = 0; j < len+1; j ++) {
        //         System.out.print(cnt[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        change(0, len, t, words);
        if(min != 51) {
            answer = min;
        }
        
        return answer;
    }
    static void change(int temp, int cur, int tg, String[] words) {
        if(temp >= min) {
            return;
        }
        if(temp!=0 && cur==tg) {
            min = Math.min(min, temp);
            return;
        }
        for(int i = 0;i < words.length+1; i++) {
            if(i==cur){
                continue;
            }
            if(!visited[i] && cnt[cur][i]==1) {
                visited[i] = true;
                change(temp+1, i, tg, words);
                visited[i] = false;
            }
        }
    }
    static int counter(String a, String b) {
        int count = 0;
        for(int i = 0;i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)) {
                count++;
            }
            if(count>1) {
                return -1;
            }
        }
        return count;
    }
}