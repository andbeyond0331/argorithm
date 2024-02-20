import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 이름 / 추억 / 사진별 인물
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        // for(String s:map.keySet() ){
        //     System.out.println("s: " + s + ", i: " + map.get(s));
        // }
        for(int i = 0; i < photo.length; i++) {
            // answer[i] = 0;
            // int temp = 0; 
            for(int j = 0; j < photo[i].length; j++) {
                
                if(map.containsKey(photo[i][j])) {
                    // System.out.println("mem : " + photo[i][j]);
                    answer[i] = answer[i] + map.get(photo[i][j]);
                }else {
                    // System.out.println("non: " + photo[i][j]);
                }
                // answer[i] = answer[i] + map.get(photo[i][j]);
                
            }
        }
        return answer;
    }
}