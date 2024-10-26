class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        for(int i = 0; i < s.length(); i++) {
            answer = Math.max(check(s, i, i), Math.max(check(s, i, i + 1), answer));
            System.out.println(i + ", " + answer);
        }
        return answer;
    }
    
    // 중심이 i인 홀수 길이 회문 검사
    static int check(String s, int left, int right) {
        int length = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            length = right - left + 1;
            left--;
            right++;
        }
        return length;
    }
}
