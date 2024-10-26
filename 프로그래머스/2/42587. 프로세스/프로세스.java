import java.util.*;

class Node {
    int num;
    int priority;
    public Node(int num, int priority) {
        this.num = num;
        this.priority = priority;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Node(i, priorities[i]));
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            boolean hasHigherPriority = false;

            // 큐에 더 높은 우선순위가 있는지 확인
            for (Node node : queue) {
                if (node.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 높은 우선순위가 있으면 현재 문서를 뒤로 보냄
                queue.add(current);
            } else {
                // 출력 가능한 경우
                answer++;
                if (current.num == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
