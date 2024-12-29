import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        // prev -> 현재 위치 10초 미만은 처음 위치(0분 0초)
        // next -> 남은 시간이 10초 미만일 경우 영상의 마지막 위치(동영상의 길이)
        // 오프닝 건너 뛰기 -> 현재 재생 위치가 오프닝 구간(op_start <= 현재 재생 위치 <= op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동
        StringTokenizer st = new StringTokenizer(pos, ":");
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int time = (min * 60) + sec;
        st = new StringTokenizer(video_len, ":");
        int len = (Integer.parseInt(st.nextToken())*60) + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(op_start, ":");
        int os_min = Integer.parseInt(st.nextToken());
        int os_sec = Integer.parseInt(st.nextToken());
        int os_time = os_min * 60 + os_sec;
        st = new StringTokenizer(op_end, ":");
        int oe_time = (Integer.parseInt(st.nextToken())*60) + Integer.parseInt(st.nextToken());
        for(int i = 0; i < commands.length; i++) {
            if(time>=os_time && time <= oe_time) {
            time = oe_time;
        }
            st = new StringTokenizer(commands[i], " ");
            if(commands[i].equals("prev")) {
                if(time < 10) {
                    time = 0;
                } else {
                    time -= 10;
                }
            } else if(commands[i].equals("next")) {
                if(len - time < 10) {
                    time = len;
                } else {
                    time+= 10;
                }
            } else {
                System.out.println("wrong:"+commands[i]);
            }
        }
        if(time>=os_time && time <= oe_time) {
            time = oe_time;
        }
        
        int ans_min = time/60;
        int ans_sec = time%60;
        String am = ans_min<10 ? "0" + String.valueOf(ans_min) : String.valueOf(ans_min);
        String as = ans_sec<10 ? "0" + String.valueOf(ans_sec) : String.valueOf(ans_sec);
        answer = String.format("%s:%s", am, as);
    
        return answer;
    }
}
// video_len: 동영상의 길이
// pos: 기능이 수행되기 직전의 재생 위치
// op_start: 오프닝 시작 시각
// op_end: 오프닝 끝나는 시각
// commands: 사용자의 입력을 나타내는 1차원 문자열 배열