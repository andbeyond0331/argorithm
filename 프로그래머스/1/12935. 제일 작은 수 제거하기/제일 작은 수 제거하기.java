import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            List<Integer> list = new ArrayList();
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length ;i++) {
                list.add(arr[i]);
                min = Math.min(min, arr[i]);
            }
            list.remove(list.indexOf(min));
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}