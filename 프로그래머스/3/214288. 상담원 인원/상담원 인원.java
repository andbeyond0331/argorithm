import java.util.*;

class Solution {
    public int solution(int k, int n, int[][] reqs) {
        int answer = Integer.MAX_VALUE;

        // 1. 멘토 배정 경우의 수 생성
        List<int[]> distributions = new ArrayList<>();
        distributeMentors(n, k, new int[k], 0, distributions);

        // 2. 각 배정에 대해 대기 시간 계산
        for (int[] allocation : distributions) {
            int waitTime = calculateWaitTime(k, reqs, allocation);
            answer = Math.min(answer, waitTime);
        }

        return answer;
    }

    // 멘토 배정을 위한 분배 조합 생성
    private void distributeMentors(int remaining, int k, int[] current, int index, List<int[]> result) {
        if (index == k - 1) {
            current[index] = remaining; // 남은 멘토를 마지막 그룹에 배정
            if (current[index] > 0) result.add(current.clone());
            return;
        }

        for (int i = 1; i <= remaining - (k - index - 1); i++) { // 최소 1명 이상 배정
            current[index] = i;
            distributeMentors(remaining - i, k, current, index + 1, result);
        }
    }

    // 대기 시간을 계산하는 함수
    private int calculateWaitTime(int k, int[][] reqs, int[] allocation) {
        int totalWaitTime = 0;

        // 각 상담 유형별로 처리
        for (int type = 1; type <= k; type++) {
            PriorityQueue<Integer> mentorQueue = new PriorityQueue<>();
            for (int i = 0; i < allocation[type - 1]; i++) {
                mentorQueue.offer(0); // 초기 멘토 상태(0분부터 가능)
            }

            for (int[] req : reqs) {
                if (req[2] == type) { // 해당 상담 유형 처리
                    int startTime = req[0];
                    int duration = req[1];

                    // 가장 빨리 가능한 멘토의 시각
                    int availableTime = mentorQueue.poll();

                    if (availableTime > startTime) {
                        // 멘토가 사용 중인 경우 대기 발생
                        totalWaitTime += availableTime - startTime;
                        startTime = availableTime;
                    }

                    // 상담 후 멘토의 다음 가능 시각 업데이트
                    mentorQueue.offer(startTime + duration);
                }
            }
        }

        return totalWaitTime;
    }
}
