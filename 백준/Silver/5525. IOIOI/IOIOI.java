import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine()); // 'N'개의 IOI 패턴
        int M = Integer.parseInt(bufferedReader.readLine()); // 문자열의 길이
        String S = bufferedReader.readLine(); // 입력 문자열

        int patternCount = 0; // N개의 "IOI" 패턴을 찾은 개수
        int ans = 0; // 답

        for (int i = 0; i < M - 1; i++) {
            // "IOI" 패턴이 시작되는지 확인
            if (S.charAt(i) == 'I') {
                int count = 0;
                while (i + 2 < M && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
                    count++; // "IOI" 패턴이 몇 번 반복되는지 카운트
                    i += 2; // "IOI"가 반복될 때마다 인덱스를 2씩 증가

                    if (count == N) { // N개의 "IOI" 패턴이 완성되면
                        ans++;
                        count--; // 다음 "IOI" 패턴을 찾기 위해 중간 값은 유지
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
