import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] maxLength = new int[N];
		maxLength[0] = 1;
		int max = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			maxLength[i] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[i]>arr[j] && maxLength[i]<maxLength[j]+1) {
					maxLength[i] = maxLength[j]+1;
				}
			}
			max = Math.max(max, maxLength[i]);
		}
		System.out.println(max);
	}
}
