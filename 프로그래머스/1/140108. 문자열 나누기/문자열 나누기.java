class Solution {
    public int solution(String s) {
        int answer = 0;
        int countX = 0;
        int countOther = 0;
        String current = s.substring(0, 1);
        for(int i = 0; i < s.length(); i++) {
            // String current = s.substring(i, i+1);
            // System.out.println(countX + ", " + countOther);
            if(countX!=0 && countOther!=0 && countX==countOther) {
                countX = 0;
                countOther = 0;
                current = s.substring(i, i+1);
                answer++;
            }
            if(current.equals(s.substring(i, i+1))) {
                countX++;
            }else{
                countOther++;
            }
        }
        return answer+1;
    }
}