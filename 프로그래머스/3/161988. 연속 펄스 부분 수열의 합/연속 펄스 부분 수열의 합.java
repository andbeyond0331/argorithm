public class Solution {
    public long solution(int[] sequence) {
        long maxPositiveStart = kadaneWithPulse(sequence, true);  // [1, -1, 1, -1, ...]
        long maxNegativeStart = kadaneWithPulse(sequence, false); // [-1, 1, -1, 1, ...]
        return Math.max(maxPositiveStart, maxNegativeStart);
    }

    private long kadaneWithPulse(int[] arr, boolean positiveStart) {
        long currentMax = 0;
        long globalMax = Integer.MIN_VALUE;
        long pulse = positiveStart ? 1 : -1;  // 시작 펄스 값 결정

        for (int i = 0; i < arr.length; i++) {
            currentMax += arr[i] * pulse;
            if (currentMax > globalMax) {
                globalMax = currentMax;
            }
            if (currentMax < 0) {
                currentMax = 0;
            }
            pulse = -pulse;  // 펄스 값 반전
        }
        return globalMax;
    }
}
