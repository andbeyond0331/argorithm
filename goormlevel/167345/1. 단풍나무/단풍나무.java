import java.io.*;
import java.util.*;
class Main {
	static int[][] park;
	static int N;
	static int total;
	static int days;
	static int[] dr = {1, -1, 0, 0};
	static int[] dc = {0, 0, 1, -1};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		total = 0;
		days = 0;
		N = Integer.parseInt(br.readLine());
		park = new int[N][N];
		for(int i = 0;i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j < N; j++) {
				park[i][j] = Integer.parseInt(st.nextToken());
				total+=park[i][j];
			} // end of j
		} // end of i
		coloring();
		System.out.println(days);
		
	}
	static void coloring() {
		if(total == 0) {
			return;
		}
		int[][] temp = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(park[i][j]>0) {
					int c = count(i, j);
					if(park[i][j]<=c) {
						total-=park[i][j];
						temp[i][j] -= park[i][j];
					}else {
						total-=c;
						temp[i][j] -= c;
					}
				}
			} // end of j
		} // end of i
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				park[i][j] += temp[i][j];
			}
		}
		days++;
		coloring();
	} //end of coloring
	static int count(int r, int c) {
		int colored = 0;
		for(int i = 0; i < dr.length; i++) {
			int nr = r+dr[i];
			int nc = c+dc[i];
			if(nr>=0 && nc >= 0 && nr < N && nc < N && park[nr][nc]==0) {
				colored++;
			}
		}
		return colored;
	}
}