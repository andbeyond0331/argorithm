import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int[] ants = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			ants[i] = Integer.parseInt(st.nextToken());
		}
		int min = 100001;
		if(N==1) {
			System.out.println(0);
			return;
		}
		Arrays.sort(ants);
		for(int i = 0; i < N; i++) {
			int temp = 0;
			int end = i;
			int start = 0;
			while(D<(ants[end]-ants[start]) && start < end) {
				start++;
			}
			min = Math.min(min, N-(end-start+1));
			
		}
		System.out.println(min < 0? 0:min);
	}
}