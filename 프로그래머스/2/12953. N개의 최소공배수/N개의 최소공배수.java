import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.sort(Comparator.naturalOrder());
        int start = list.get(list.size()-1);
        boolean flag = true;
        while(flag) {
            boolean found = true;
            for(int i = 0; i < arr.length; i++) {
                if(start%arr[i]!=0) {
                    found = false;
                    break;
                }
            }
            if(found) {
                answer = start;
                flag = false;
            }
            start++;
        }
        return answer;
    }
}