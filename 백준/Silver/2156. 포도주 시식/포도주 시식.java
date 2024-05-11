
import java.io.*;

public class Main {
	static Integer[][] max;
	static int[] wine;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		max = new Integer[N+1][3];
		wine = new int[N+1];
		for(int i = 1; i < N+1; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		// 초기화
		max[1][0] = 0;
		max[1][1] = wine[1];
		max[1][2] = 0;

		if(N > 1) {
			max[2][0] = Math.max(max[1][0], max[1][1]);
			max[2][1] = wine[2];
			max[2][2] = wine[1] + wine[2];
		}

		// 점화식에 따라 계산
		for(int i = 3; i <= N; i++) {
			max[i][0] = Math.max(Math.max(max[i-1][0], max[i-1][1]), max[i-1][2]);
			max[i][1] = max[i-1][0] + wine[i];
			max[i][2] = max[i-1][1] + wine[i];
		}

		// 최대값 출력
		int result = Math.max(Math.max(max[N][0], max[N][1]), max[N][2]);
		System.out.println(result);
	}

}
