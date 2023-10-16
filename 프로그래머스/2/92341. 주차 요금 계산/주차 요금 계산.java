import java.util.*;

class Solution {
    public static Map<String, String> map = new HashMap<>();
    public static Map<String, Integer> countMap = new HashMap<>();
    public int[] solution(int[] fees, String[] records) {
        int[] answer;
        // fees 기본 시간(분), 기본 요금(원), 단위 시간(분), 단위 요금(원)
        StringTokenizer st;
        for(int i = 0; i < records.length; i++) {
            st = new StringTokenizer(records[i]);
            String time = st.nextToken();
            String carNum = st.nextToken();
            String IN_OUT = st.nextToken();
            
            if(map.size()==0) {
                map.put(carNum, time);
            }
            else  {
                if(map.containsKey(carNum)) {
                    String inTime = map.get(carNum);
                    map.remove(carNum);
                    // String inTimeHour = inTime.substring(0,2);
                    // String inTimeMinute = inTime.substring(3, 5);
                    // String outTimeHour = time.substring(0,2);
                    // String outTimeMinute = time.substring(3, 5);
                    int inTimeHour = Integer.parseInt(inTime.substring(0,2));
                    int inTimeMinute = Integer.parseInt(inTime.substring(3, 5));
                    int outTimeHour = Integer.parseInt(time.substring(0,2));
                    int outTimeMinute = Integer.parseInt(time.substring(3, 5));
                    // System.out.println(carNum + ": " + inTimeHour + ", "+ inTimeMinute + ", " + outTimeHour + " , " + outTimeMinute);
                    int temp =0;
                    if(outTimeMinute>=inTimeMinute) {
                         temp = outTimeMinute-inTimeMinute + ((outTimeHour -inTimeHour) * 60);
                        
                    }else {
                         temp = 60-inTimeMinute + outTimeMinute + ((outTimeHour - inTimeHour-1) * 60);
                    }
                    if(countMap.containsKey(carNum)) {
                        // System.out.println(temp);
                            countMap.put(carNum, countMap.get(carNum) + temp);
                        }else{
                        // System.out.println(temp);
                            countMap.put(carNum, temp);
                        }
                } else {
                    // System.out.println(temp);
                    map.put(carNum, time);
                }
            }
        }
        
        for(String s: map.keySet()) {
            int lastHour = 23;
            int lastMinute = 59;
            int thisHour = Integer.parseInt(map.get(s).substring(0,2));
            int thisMinute = Integer.parseInt(map.get(s).substring(3, 5));
            int temp = 0;
            if(lastMinute>=thisMinute) {
                temp = (lastHour-thisHour)*60 + lastMinute-thisMinute;
            }else {
                temp = (lastHour-thisHour-1)*60 + 60-thisMinute + lastMinute;
            }
            if(countMap.containsKey(s)) {
                countMap.put(s, countMap.get(s) + temp);
            }else{
                countMap.put(s, temp);
            }
        }
        List<String> list = new ArrayList<>();
        
        for(String s : countMap.keySet()) {
            list.add(s);    
        }
        list.sort(Comparator.naturalOrder());
        for(int i = 0; i < list.size(); i ++) {
            // System.out.println(list.get(i) + " : " + countMap.get(list.get(i)));
            
        }
        answer = new int[countMap.size()];
        int idx = 0;
        for(String i: list) {
            if(countMap.get(i)<=fees[0]) {
                answer[idx] = fees[1];
            } else {
                int temp = countMap.get(i)-fees[0];
                answer[idx] = fees[1]+(temp%fees[2]==0?(temp/fees[2])*fees[3]:(temp/fees[2]+1)*fees[3]);
            }
            idx++;
        }
        
        
        return answer;
    }
}