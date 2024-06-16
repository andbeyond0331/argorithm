import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N, K 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		// 1001*1001 크기 배열에 ground[x1][y1]++, ground[x2][y2]++, ground[x1+1][y2]--, ground[x2][y1+1]--
		int[][] ground = new int[1001][1001];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x1, y1, x2, y2;
				x1 = Integer.parseInt(st.nextToken());
				y1 = Integer.parseInt(st.nextToken());
				x2 = Integer.parseInt(st.nextToken());
				y2 = Integer.parseInt(st.nextToken());
			// System.out.println("x1: " + x1 + ", y1: " + y1);
			ground[x1][y1]++;
			ground[x2][y2]++;
			ground[x1][y2]--;
			ground[x2][y1]--;
		} // end of i
		// for(int i = 0;i < 10; i ++) {
		// 	for(int j = 0;j < 10; j++) {
		// 		System.out.print(ground[i][j] + " " );
		// 	}
		// 	System.out.println();
		// }
		// 탐색하면서 누적합 저장
		for(int j = 0; j < 1001; j++) {
			for(int i = 1; i < 1001; i++) {
				ground[i][j] += ground[i-1][j];
			}
		}
		for(int i = 0; i < 1001; i++) {
			for(int j = 1; j < 1001; j++) {
				ground[i][j] += ground[i][j-1];
				
			}
		}
		for(int i = 0; i < 1001; i++) {
			for(int j = 0; j < 1001; j++) {
				if(ground[i][j]==K) {
					answer++;
				}
			}
		}
		
		// for(int i = 0;i < 10; i ++) {
		// 	for(int j = 0;j < 10; j++) {
		// 		System.out.print(ground[i][j] + " " );
		// 	}
		// 	System.out.println();
		// }
		System.out.println(answer);
	} // end of main
}