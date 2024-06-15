import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 숫자판의 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[N]; // 초기값
		int[] max = new int[N]; // 최댓값
		for(int i = 0;i < max.length; i++) {
			max[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		int K = Integer.parseInt(br.readLine());
		// 버튼 누르기
		for(int i = N-1; i>=0; i--) {
			// num[i] = (num[i]+K)%(max[i]+1)==max[i]?max[i]:(num[i]+K)%(max[i]+1);
			int a = (num[i]+K)%(max[i]+1);
			int b = (num[i]+K)/(max[i]+1);
			num[i] = a;
			K = b;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			// System.out.print(max[i]);
		}
	}
}