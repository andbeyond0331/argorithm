
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] pole = new int[501];
		StringTokenizer st;
		int[] maxLen;
		int len = -1;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			pole[left] = (right);
			len = Math.max(len, left);
		}
		maxLen = new int[len+1];
		for(int i = 1; i < len+1; i++) {
			maxLen[i] = 1;
			for(int j = 1; j < i; j++) {
				if(pole[i]!=0 && pole[j]!=0 && pole[i]>pole[j] && maxLen[i] < maxLen[j]+1) {
					maxLen[i] = maxLen[j]+1;
				}
			}
		}
		int left = -1;
		for(int i = 1; i < len+1; i++) {
			left = Math.max(maxLen[i], left);
		}
		System.out.println(N-left);
//		for(int i = 1; i < len+1; i++) {
//			System.out.print(pole[i] + " ");
//		}
//		for(int i = 1; i < len+1; i++) {
//			System.out.print(maxLen[i] + " ");
//		}
	}
}
