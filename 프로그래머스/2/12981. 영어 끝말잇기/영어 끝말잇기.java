import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> spoken = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            String lastWord = spoken.size()>0?spoken.get(spoken.size()-1):"";
            if (words[i].length()==1 || spoken.contains(words[i]) || (spoken.size()>0 && !lastWord.substring(lastWord.length()-1).equals(words[i].substring(0,1)))) {
                answer[0] = (i+1)%n==0?n:(i+1)%n;
                answer[1] = (i+1)%n==0?(i+1)/n:(i+1)/n+1;
                break;
            }
            spoken.add(words[i]);   
        }
        return answer;
    }
}
// 1 2 3 4 5 6 (7) 8
// 1 2 1 2 1 2 1 2
// 1 1 2 2 3 3 4 4
// 0 1 1 2 2 3 3 4
// 1 2 3 1 2 3 1 2
// 1 1 1 2 2 2 3 3 