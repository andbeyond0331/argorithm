import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int i: scoville) {
            pq.add(new Node(i));
        }
        
        for(int i = 0; i <= scoville.length; i++) {
            if(pq.size()==1) {
                if(pq.peek().getScore()<K) {
                    answer = -1;
                    break;
                }
            }
            if(pq.peek().getScore()>=K) {
                break;
            }
            answer ++;
            int a = pq.poll().getScore();
            int b = pq.poll().getScore();
            pq.add(new Node(a + (b*2)));
        }
        
        return answer;
    }
    
}

class Node implements Comparable<Node> {
    private int score;
    
    public Node(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return this.score;
    }
    
    @Override
    public int compareTo(Node node) {
        if(this.score > node.getScore()) {
            return 1;
        }else if(this.score < node.getScore()) {
            return -1;
        }
        return 0;
    }
}