import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();
        
        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // x를 기준으로 주기를 찾음
            int result = -1; // 초기값은 찾지 못했을 때 -1로 설정
            for (int k = x; k <= lcm(M, N); k += M) {
                // k % N이 y와 일치하는지 확인
                if ((k % N == 0 ? N : k % N) == y) {
                    result = k;
                    break;
                }
            }

            answer.append(result).append(t == T ? "" : "\n");
        }
        System.out.println(answer);
    }

    // 최대공약수(GCD)
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소공배수(LCM)
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
