import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        int time = 0;
        
        // 포인트별 위치 저장
        Map<Integer, int[]> pointLocations = new HashMap<>();
        for(int i = 0; i < points.length; i++) {
            pointLocations.put(i+1, points[i]);
        }
        // 시간대별로 위치 개수 저장
        Map<Integer, Map<String, Integer>> positions = new HashMap<>();
        // for(int[] arr:pointLocations.values()) {
        //     System.out.println(arr[0] + ", " + arr[1]);
        // }
        for(int[] route: routes) {
            int x = pointLocations.get(route[0])[0];
            int y = pointLocations.get(route[0])[1];
            time = 0;
            String current = x + "," + y;
            positions.putIfAbsent(time, new HashMap<>());
            Map<String, Integer> map = positions.get(time);
            map.put(current, map.getOrDefault(current, 0)+1);
            
            for(int i = 1;i < route.length; i++) {
                int nextX = pointLocations.get(route[i])[0];
                int nextY = pointLocations.get(route[i])[1];
                while(true) {
                    if(nextX==x && nextY==y) {
                        break;
                    }
                    if(nextX==x) {
                        if(nextY > y) {
                            y++;
                        }else {
                            y--;
                        }
                    } else  {
                        if(nextX > x) {
                            x++;
                        }else {
                            x--;
                        }
                    }
                    current = x + "," + y;
                    positions.putIfAbsent(++time, new HashMap<>());
                    Map<String, Integer> temp = positions.get(time);
                    temp.put(current, temp.getOrDefault(current, 0) +1);
                }
            }
        }
        for(int i: positions.keySet()) {
            for(String s : positions.get(i).keySet()) {
                if(positions.get(i).get(s) > 1) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}