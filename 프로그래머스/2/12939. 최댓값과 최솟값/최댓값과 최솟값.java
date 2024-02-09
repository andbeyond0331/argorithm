class Solution {
    public String solution(String s) {
        String answer = "";
        String[] spl = s.split(" ");
        int max = Integer.parseInt(spl[0]);
        int min = Integer.parseInt(spl[0]);
        for(int i = 0; i < spl.length; i++){
            int temp = Integer.parseInt(spl[i]);
            if(max<temp){
                max = temp;
            }
            if(min>temp){
                min = temp;
            }
        }
        answer = min+" "+max;
        return answer;
    }
}