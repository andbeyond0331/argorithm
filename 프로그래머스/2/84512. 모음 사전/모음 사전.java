class Solution {
    public int solution(String word) {
        int answer = 0;
        // a aa aaa aaaa aaaaa aaaae aaaai aaaao aaaau 
        // e ea eaa eaaa eaaaa eaaae eaaai eaaao eaaau
        // 
        String[] alpha = {"A", "E", "I", "O", "U"};
        
        for(int i = 0; i < word.length(); i++) {
            for(int j = 0; j < alpha.length; j++) {
                if(word.substring(i,i+1).equals(alpha[j])) {
                    int tmp = 0;
                    for(int k = 0; k < 5-i; k++) {
                        tmp+= Math.pow(5,k);
                    }
                    answer+=tmp*j;
                }
            }
            answer++;
        }
        return answer;
    }
}