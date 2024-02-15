class Solution {
    public String solution(int n) {
        String answer = "";
        String[] otf = {"4", "1", "2"};
        // int[] otf = new int[3];
        // otf[0] = 4;
        // otf[1] = 1;
        // otf[2] = 2;
        int comp = n;
        while(comp > 0) {
            int temp = comp % 3;
            comp /= 3;
            if(temp == 0) {
                comp--;
            }
            answer = otf[temp]+answer;
        }
        // 1 1 2 2 3 4 4 11 
        // 10 -> 3*3 + 1 -> 네번째에서 첫번째니까 41
        // 11 -> 3*3 + 2 -> 42
        // 16 -> 3*5 + 1 -> 여섯번째에서 첫번째 
        // 1 2 4 11 12 14 21 22 24 41 42 44 111 112 114 121 122 124 141 142 144 411 412 414
        // 1 2 3 4  5  6  7  8  9  10 11 12 13  14  15  16  17  18  19  20  21  22  23  24
        // 3     9                          
        
        return answer;
    }
}