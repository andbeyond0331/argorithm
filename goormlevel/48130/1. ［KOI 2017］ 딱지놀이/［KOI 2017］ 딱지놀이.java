import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] a;
		int[] b;
		StringBuilder sb = new StringBuilder();
		for(int r = 1; r <= N; r++) {
			st = new StringTokenizer(br.readLine());
			a = new int[5];
			b = new int[5];
			int aCount = Integer.parseInt(st.nextToken());
			for(int ac = 0; ac<aCount; ac++) {
				a[Integer.parseInt(st.nextToken())]++;
			}
			st = new StringTokenizer(br.readLine());
			int bCount = Integer.parseInt(st.nextToken());
			for(int bc = 0; bc<bCount; bc++) {
				b[Integer.parseInt(st.nextToken())]++;
			}
			boolean flag = false;
			for(int i =4; i >=1; i--) {
				if(a[i]!=b[i]) {
					if(a[i]>b[i]) {
						sb.append("A");
						// System.out.println("A");
					}else {
						sb.append("B");
						// System.out.println("B");
					}
					flag = true;
					break;
				}
			}
			if(!flag) {
				sb.append("D");
				// System.out.println("D");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
}