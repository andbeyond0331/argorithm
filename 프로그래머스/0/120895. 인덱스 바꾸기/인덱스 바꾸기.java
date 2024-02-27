class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        answer = my_string.substring(0, min)+my_string.substring(max, max+1)+my_string.substring(min+1, max)+my_string.substring(min, min+1) + my_string.substring(max+1);
        return answer;
    }
}