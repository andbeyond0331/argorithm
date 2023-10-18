import java.util.*;

class Solution {
    static Stack<Integer> subBelt;
    static Queue<Integer> belt;
    // static List<Integer> belt;
    static int truck;
    static boolean[] flag;
    static int index;
    public int solution(int[] order) {
        int answer = 0;
        subBelt = new Stack<>();
        belt = new LinkedList<>();
        // belt = new ArrayList<>();
        truck = 0;
        index = 0;
        flag = new boolean[order.length];
        for(int i = 1; i <= order.length; i++ ){
            belt.add(i);
        }
        // 5 4 3 1 2
        while(index<order.length) {
            if(belt.size()>0) {
                if(belt.peek() == order[index]) {
                // if(belt.get(0) == order[index]) {
                    // flag[belt.get(0)-1] = true;
                    flag[belt.poll()-1] = true;
                    // belt.remove(0);
                    truck++;
                    index++;
                    continue;
                }
            }
            if(subBelt.size()>0) {
                if(subBelt.peek() == order[index]) {
                    flag[subBelt.pop()-1] = true;
                    truck++;
                    index++;
                    continue;
                }
            }
            if(!flag[order[index]-1]) {
                // int temp = belt.get(0);
                // belt.remove(0);
                int temp = belt.poll();
                flag[temp-1] = true;
                subBelt.push(temp);
            }else{
                break;
            }
        }
        answer = truck;
        
        return answer;
    }
    
    static void move() {
        
    }
}