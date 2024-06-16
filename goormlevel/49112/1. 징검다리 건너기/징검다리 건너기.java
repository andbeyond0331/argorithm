import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] poison = new int[N+1];
		int[] minPoison = new int[N+1];
		for(int i = 0; i < N; i++) {
			poison[i] = Integer.parseInt(st.nextToken());
		}
		if(N == 1) {
			System.out.println(0);
			return;
		}
		minPoison[0] = poison[0];
		if(N==2) {
			System.out.println(0);
			return;
		}
		minPoison[1] = poison[1];
		if(N==3) {
			System.out.println(0);
		}
		minPoison[2] = poison[2];
		
		for(int i = 3; i <= N; i++) {
			minPoison[i] = poison[i] + Math.min(minPoison[i-1], Math.min(minPoison[i-2], minPoison[i-3]));
		}
		System.out.println(minPoison[N]);
	}
}