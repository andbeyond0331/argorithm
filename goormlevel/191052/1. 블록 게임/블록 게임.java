import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String D = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, 1, -1};
		int[] blocks = new int[N];
		for(int i = 0; i < N; i++) {
			blocks[i] = Integer.parseInt(st.nextToken());
		}
		int r = 0;
		int c = 0;
		Stack<Integer> score = new Stack<Integer>();
		Stack<int[]> location = new Stack<int[]>();
		// Set<int[]> unique = new HashSet<>();
		boolean[][] visited = new boolean[2*N+1][2*N+1];
		visited[N][N] = true;
		score.push(1);
		int[] zero = {0, 0};
		location.push(zero);
		// unique.add(zero);
		for(int i = 0; i < N; i++) {
			int temp = 0;
			switch(D.charAt(i)) {
				case 'L':
					temp = 0;
					break;
				case 'R':
					temp = 1;
					break;
				case 'U':
					temp = 2;
					break;
				case 'D':
					temp = 3;
					break;
			}// end of switch
			int nr = r + dr[temp];
			int nc = c + dc[temp];
			int[] newL = {nr, nc};
			if(visited[N+nr][N+nc]) {
				// System.out.println("ii: " + i);
				// System.out.println(location.peek()[0] + ", " +location.peek()[1]);
				// System.out.println("nr;" + nr + ", nc; " + nc);
				// int[] loc = location.pop();
				while(!(location.peek()[0]==nr && location.peek()[1] == nc) ){
				  // System.out.println("i : " + i);
					// unique.remove(location.pop());
					// System.out.println(location.peek()[0] + ", " +location.peek()[1]);
					int[] p = location.pop();
					visited[N+p[0]][N+p[1]] = false;
					score.pop();
				} //end of while
				score.pop();
				score.push(blocks[i]);
			}else {
				score.push(blocks[i]);
				// unique.add(newL);
				visited[N+nr][N+nc] = true;
				location.push(newL);
			}
			r = nr;
			c = nc;
		} // end of i
		int answer = 0;
		for(int i:score) {
			// System.out.println(i);
			answer += i;
		}
		System.out.println(answer);
	} // end of main
}