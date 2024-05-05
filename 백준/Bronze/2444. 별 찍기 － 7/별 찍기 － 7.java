import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 1부터 N까지 1 3 5 7 ...
		// 그 다음부터는 1까지
		StringBuilder answer = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			answer.append(" ".repeat(N-i));
			answer.append("*".repeat((i*2)-1));
			answer.append("\n");
		}
		for(int i = N-1; i >= 1; i--) {
			answer.append(" ".repeat(N-i));
			answer.append("*".repeat((i*2)-1));
			answer.append(i==1?"":"\n");
		}
		System.out.println(answer);
	}
}
