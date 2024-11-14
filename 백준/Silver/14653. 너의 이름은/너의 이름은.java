import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 전체 사람 수
        int K = Integer.parseInt(stringTokenizer.nextToken()); // 메시지의 수
        int Q = Integer.parseInt(stringTokenizer.nextToken()); // 확인할 메시지 번호

        Set<Character>[] whoRead = new Set[K];
        int[] notReadCount = new int[K];
        for (int i = 0; i < K; i++) {
            whoRead[i] = new HashSet<>();
            whoRead[i].add('A'); // A는 항상 메시지를 읽는 사람으로 간주
        }

        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int unread = Integer.parseInt(stringTokenizer.nextToken());
            char sender = stringTokenizer.nextToken().charAt(0);
            notReadCount[i] = unread;

            // 송신자가 A가 아닌 경우, 이전 메시지에 송신자를 추가
            if (sender != 'A') {
                for (int j = 0; j <= i; j++) {
                    whoRead[j].add(sender);
                }
            }

            // 읽지 않은 사람 수가 이전과 동일한 경우, 이전 상태 복사
            if (i > 0 && notReadCount[i] == notReadCount[i - 1]) {
                whoRead[i].addAll(whoRead[i - 1]);
            }
            
            // 현재 메시지를 읽은 사람 목록에 송신자 추가
            whoRead[i].add(sender);
        }

        // 결과 추출: Q번째 메시지를 기준으로 읽지 않은 사람을 찾아 출력
        if (notReadCount[Q - 1] == 0) {
            System.out.println(-1);
        } else {
            boolean found = false;
            for (int i = 0; i < N; i++) {
                char person = (char) ('A' + i);
                if (!whoRead[Q - 1].contains(person)) {
                    System.out.print(person + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.println(-1);
            }
        }
    }
}
