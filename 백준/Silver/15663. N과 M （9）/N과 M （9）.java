
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] given;
    static boolean[] visited;
    static int[] output;
    static LinkedHashSet<String> result;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        given = new int[N];
        visited = new boolean[N];
        output = new int[M];
        result = new LinkedHashSet<>();
        
        st = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            given[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(given); // 중복 방지를 위해 정렬
        perm(0);
        
        // 결과 출력
        for (String s : result) {
            System.out.println(s);
        }
    }

    static void perm(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(output[i]).append(" ");
            }
            result.add(sb.toString().trim());
            return;
        }
        
        int lastUsed = -1; // 같은 레벨에서 중복 방지
        for (int i = 0; i < N; i++) {
            if (!visited[i] && given[i] != lastUsed) { // 이전에 사용한 값 건너뜀
                visited[i] = true;
                output[depth] = given[i];
                lastUsed = given[i];
                
                perm(depth + 1);
                
                visited[i] = false;
            }
        }
    }
}
