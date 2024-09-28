import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int len = numbers.length;
        String[] nums = new String[len];
        for(int i = 0;i < len; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        
        for(String n: nums) {
            answer+=n;
        }
        if(nums[0].equals("0")) {
            return "0";
        }
        return answer;
    }
}