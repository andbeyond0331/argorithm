import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			X = X>0?X:X*-1;
			Y = Y>0?Y:Y*-1;
			// System.out.println("X: " +X + "Y: " + Y + "N: "+ N);
			if(X+Y>N) {
				System.out.println("NO");
				continue;
			}else if((N-X-Y)%2==1) {
				System.out.println("NO");
				continue;
			}else {
				System.out.println("YES");
				continue;
			}
		}
	}
}