import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        int[][] triangle = new int[size][size];
        StringTokenizer stringTokenizer;
        for(int i = 1; i <= size; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0; j < i; j++) {
                triangle[i-1][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        // j가 같거나 하나 더 큰 애만
//        boolean[][] visited = new boolean[size][size];
        if(size == 1) {
            System.out.println(triangle[0][0]);
        } else{
            for(int i = size-2; i >= 0; i--) {
                for(int j = 0; j < i+1; j++) {
                    int left = triangle[i][j] + triangle[i+1][j];
                    int right = triangle[i][j] + triangle[i+1][j+1];
                    triangle[i][j] = Math.max(left, right);
                }
            }
            System.out.println(triangle[0][0]);
        }


//        for(int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print(triangle[i][j]+" ");
//            }
//            System.out.println();
//        }
    }


}
