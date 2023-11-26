import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        Map<Integer, List<Integer>> map = new HashMap<>(); 
        
        // 중복 가능 / 정해진 순서 있음 순서 다르면 서로 다른 튜플
        // 원소 개수 유한
        s = s.substring(2, s.length()-2);
        if(s.contains("},{")){
            String[] temp = s.split("\\},\\{");
            // System.out.println(temp.length);
//             if(temp.length == 0) {
            
//                 answer = new int[1];
//                 answer[0] = Integer.parseInt(temp[0]);
                
//                 return answer;
//             }
            for(int i = 0; i< temp.length; i++) {
                
                String[] nums = temp[i].split(",");
                List<Integer> temper = new ArrayList<>();
                for(String num: nums) {
                    temper.add(Integer.parseInt(num));
                }
                map.put(nums.length, temper);
            }
        }else{
            answer = new int[1];
            answer[0] = Integer.parseInt(s);
            return answer;
        }
        // if(map.size() == 0) {
        //     answer = new int[1];
        //     answer[0] = map.get(1).get(0);
        //     return answer;
        // }
        
        answer = new int[map.size()];
        for(int i = 1; i<= map.size(); i++) {
            int count = i*(i-1)/2;
            for(int j = 0; j < i-1; j++) {
                if(map.get(i).contains(answer[j])) {
                    count -= map.get(i).indexOf(answer[j]);
                }

            }
         
            answer[i-1] = map.get(i).get(count);
        }
       
        return answer;
    }
}