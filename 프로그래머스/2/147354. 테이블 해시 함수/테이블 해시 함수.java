import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int prev = 0;
        int sLen = data[0].length;
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[col-1]!=o2[col-1]) {
                    return o1[col-1]-o2[col-1];
                }
                return o2[0]-o1[0];
            }
        });
        // int prev = 0;
        for(int i = 0; i < sLen; i++) {
            prev+= data[row_begin-1][i]%(row_begin);
        }
        for(int i = row_begin; i < row_end; i++) {
            // System.out.println(i + ": " + prev);
            int cur = 0;
            for(int j = 0; j < sLen; j++) {
                cur+= data[i][j]%(i+1);
            }
            // System.out.println(i + ": " + prev + "&" + cur);
            prev = (prev ^ cur);
        }
        // for(int i = 0;i < data.length; i++) {
        //     for(int j = 0; j < sLen; j++) {
        //         System.out.print(data[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        return prev;
    }
    
}
