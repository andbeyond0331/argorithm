class Solution {
    public String solution(int a, int b) {
        String answer = "";
        // 1 31 2 29 3 31 4 30 5 31 6 30 7 31 8 31 9 30 10 31 11 30 12 31
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int countMonth = 0;
        for(int i = 1; i < a; i++) {
            countMonth += months[i];
        }
        countMonth += b;
        
        // System.out.println("countMonth: " + countMonth);
        countMonth %= 7;
        
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        answer = days[countMonth];
        return answer;
    }
}