import java.util.*;

class Solution {
    static long[] nums;
    public long solution(int n) {
        nums = new long[n+1];
        long answer = 0;
        nums[0] = 1;
        nums[1] = 1;
        if(n == 1) {
            answer = 1;
        }else{
            for(int i = 2; i <= n; i++) {
                nums[i] = (nums[i-1] + nums[i-2])%1234567;
            }
            answer = nums[n];
        }
        
        // 0에서 2로 나눈 몫까지
        // long one = 0;
        // long two = 0;
//         for(int i = 0; i <= n/2; i++) {
//             one = n - (i*2);
//             two = i;
//             // System.out.println("one : " + one + ", two: " + two);
//             long temp;
//             if(two == 0) {
//                 temp = 1;
//             }else{
//                 temp = factorial(1, Math.max(one, two)+1, one + two);
//                 // System.out.println(temp);
//                 temp/= factorial(1, 1, Math.min(one, two));
//                 // System.out.println(temp);
//             }
                
//             answer += temp;
//         }
        return answer;
    }
    
    // static long factorial(long i, long s, long e) {
    //     if(s>e) {
    //         return i;
    //     }
    //     return factorial(i*s, s+1, e);
    // }
}