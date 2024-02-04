import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // // a < b < c // A < B < C
        // 1 2 4 ~ 4 4 5
        // 1*4 + 2*4 + 4*5
        // 1*5 + 2*4 + 4*4
        // a*A + b*B + c*C
        // a*C + b*B + c*A
        // a*A + c*C ? a*C + c*A
        // a(A-C) ? c(A-C)
        // // a < b // A < B
        // a*A + b*B
        // a*B + b*A
        // a*A + b*B ? a*B + b*A
        // a*(A-B) ? b(A-B)
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
            aList.add(A[i]);
            bList.add(B[i]);
        }
        aList.sort(Comparator.naturalOrder());
        bList.sort(Comparator.naturalOrder());
        for(int i = 0; i < A.length; i++) {
            answer+=(aList.get(i)*bList.get(B.length-1-i));
        }
        
        return answer;
    }
}