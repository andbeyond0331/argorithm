import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		int[] inMaxLength = new int[N];
		int[] deMaxLength = new int[N];

		for(int i = 0; i < N; i++) {
			inMaxLength[i] = 1;
			for(int j = 0; j < i; j++) {
				if (A[i] > A[j] && inMaxLength[i] < inMaxLength[j] + 1) {
					inMaxLength[i] = inMaxLength[j] + 1;
				}
			}
		}
		for(int i = N-1; i >= 0; i--) {
			deMaxLength[i] = 1;
			for(int j = N-1; j > i; j--) {
				if(A[i] > A[j] && deMaxLength[i] < deMaxLength[j] + 1) {
					deMaxLength[i] = deMaxLength[j] + 1;
				}
			}
		}
		int max = 0;
		for(int i = 0; i < N; i++) {
			max = Math.max(inMaxLength[i] + deMaxLength[i] -1, max);
		}
		System.out.println(max);
	}
}