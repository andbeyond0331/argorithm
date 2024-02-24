import java.util.*;

class Solution {
    static PriorityQueue<Integer> pq;
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        // 처음에 n명
        // 매 라운드마다 enemy 등장, 남은 병사 중 그만큼 소모해서 적 막음
        // 무적권(병사 소모 없이 한 라운드 공격 막을 수 있음)
        // k만큼 큰 숫자들 없애고 나머지 숫자들 합했을 때 n보다 작을 때까지
        if(k>=enemy.length) {
            return enemy.length;
        }
        pq = new PriorityQueue();
        int handle = 0;
        for(int i = 0; i< enemy.length; i++) {
            // System.out.println("i: " + i + ", enemy: " + enemy[i]);
            if(handle>=n) {
                answer = i;
                break;
            }
            // else if(handle==n) {
            //     answer = i;
            // }
            if(pq.size()<k) {
                pq.add(enemy[i]);
            } else if(!pq.isEmpty()) {
                if(enemy[i]>pq.peek()) {
                    handle+=pq.poll();
                    pq.add(enemy[i]);
                }else {
                    handle+=enemy[i];
                }
            }
            if(handle>n) {
                answer = i;
                break;
            }else if(handle == n) {
                answer = i+1;
                break;
            }
            if(answer == 0) {
                if(handle<=n) {
                    answer = enemy.length;
                }
            }
        }
        return answer;
    }
//     static void enqueue(int arr[], int val) {
//       int i = 0; 
//       if (size == MAX_LEN) { // 배열에 공간이 없으면 실패
//         printf("Overflow: Could not insertKey\n");
//       }

//       // 힙 끝에 요소 삽입.
//       size ++;
//       i = size;
//       arr[i]= val;

//       // 우선순위가 부모 노드가 더 작다면 교환하고 부모 노드부터 다시 비교, 힙속성을 유지할 때까지 반복함.
//       while(i > 1 && arr[i/2] < arr[i]) {
//         swap(arr[i/2], arr[i]);
//         i = i/2;
//       }
//     }
}