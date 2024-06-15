import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            
            List<Integer> set = new ArrayList();
            for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
                set.add(array[j]);
            }
            
            set.sort(Comparator.naturalOrder());
            for(int j = 0; j < commands[i][2]; j++){
                answer[i] = set.get(j);
                
                
            }
            
            
            
        }
        
        
        
        return answer;
    }
}