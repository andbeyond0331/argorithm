import java.util.*;

class Solution {
    static int[][] newSea;
    static int[][] sea;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static boolean[][] visited;
    static int cnt;
    static Map<Integer, Integer> map;
    public int[] solution(String[] maps) {
        int[] answer = {};
        visited = new boolean[maps.length][maps[0].length()];
        sea = new int[maps.length][maps[0].length()];
        newSea = new int[maps.length][maps[0].length()];
        cnt = 0;
        map = new HashMap<>();
        for(int i =0; i< maps.length;i++) {
            for(int j = 0; j < maps[i].length(); j++) {
                if(!maps[i].substring(j, j+1).equals("X")) {
                     sea[i][j] = Integer.parseInt(maps[i].substring(j,j+1));
                }
            }
        }
        
        for(int i =0; i < maps.length; i++) {
            for(int j = 0; j < maps[i].length(); j++) {
                if(sea[i][j]!=0 && !visited[i][j]) {
                    cnt++;
                    newSea[i][j] = cnt;
                    visited[i][j] = true;
                    count(i, j);
                }
            }
        }
        for(int i =0; i < maps.length; i++) {
            for(int j = 0; j < maps[i].length(); j++) {
                if(newSea[i][j]!=0) {
                    if(map.containsKey(newSea[i][j])) {
                        map.put(newSea[i][j], map.get(newSea[i][j])+sea[i][j]);
                    }else{
                        map.put(newSea[i][j], sea[i][j]);
                    }
                }
                
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i: map.keySet()) {
            list.add(map.get(i));
        }
        
        if(list.size()==0) {
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[list.size()];
            list.sort(Comparator.naturalOrder());
            for(int i = 0; i< list.size();i ++) {
                answer[i] = list.get(i);
            }
        }
        
        
//         for(int i = 0; i < maps.length;i++) {
//             for(int j = 0; j < maps[i].length();j++) {
//                 System.out.print(sea[i][j] + " ");
//             }
//             System.out.println("");
                
//         }
//                 for(int i = 0; i < maps.length;i++) {
//             for(int j = 0; j < maps[i].length();j++) {
//                 System.out.print(newSea[i][j] + " ");
//             }
//             System.out.println("");
                
//         }
        return answer;
    }
    
    static void count(int r, int c) {
        
        for(int i =0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(check(nr, nc)) {
                newSea[nr][nc] = cnt;
                visited[nr][nc] = true;
                count(nr, nc);
            }
        }
    }
    
    static boolean check(int r, int c) {
        if( r >=0 && r < sea.length && c>=0 && c<sea[0].length && !visited[r][c] && sea[r][c] !=0) {
            return true;
        }
        return false;
    }
}