import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] houses = new int[N+1];
		for(int i = 1; i < N+1; i++) {
			houses[i] = Integer.parseInt(st.nextToken());
		}
		// int[][] rains = new int[N+1][M];
		// int[] drainage = new int[N+1];
		boolean[] rained = new boolean[N+1];
		for(int i = 0; i < M; i++) {
			if(i%3==0) {
				rained = new boolean[N+1];
			}
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			for(int r = s; r <= e; r++) {
				// rains[r] = 1;
				houses[r]++;
				
				rained[r] = true;
			}
			if((i+1)%3==0) {
				for(int d = 1; d <= N; d++) {
					if(rained[d]) {
						// drainage[d]--;
						houses[d]--;
					}
				}
			}
			
			
		}
		for(int i = 1; i < N+1; i++) {
			System.out.print(houses[i]);
			if(i<N) {
				System.out.print(" ");
			}
		}
		
	}
}