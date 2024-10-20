import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Route implements Comparable<Route>{
    int end;
    int pay;

    public Route(int end, int pay) {
        this.end = end;
        this.pay = pay;
    }

    @Override
    public int compareTo(Route o) {
        return this.pay - o.pay;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 도시 수 (정점)
        int N = Integer.parseInt(bufferedReader.readLine());
        // 버스 수 (간선)
        int M = Integer.parseInt(bufferedReader.readLine());

        // 그래프 초기화
        List<Route>[] graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());
            graph[start].add(new Route(end, pay));
        }

        // 시작점, 도착점 입력
        st = new StringTokenizer(bufferedReader.readLine());
        int realStart = Integer.parseInt(st.nextToken());
        int realEnd = Integer.parseInt(st.nextToken());

        // 다익스트라 알고리즘
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[realStart] = 0;

        PriorityQueue<Route> pq = new PriorityQueue<>();
        pq.offer(new Route(realStart, 0));

        while (!pq.isEmpty()) {
            Route current = pq.poll();
            int currentNode = current.end;
            int currentPay = current.pay;

            if (dist[currentNode] < currentPay) continue;

            for (Route next : graph[currentNode]) {
                int nextNode = next.end;
                int nextPay = currentPay + next.pay;

                if (dist[nextNode] > nextPay) {
                    dist[nextNode] = nextPay;
                    pq.offer(new Route(nextNode, nextPay));
                }
            }
        }

        // 결과 출력
        System.out.println(dist[realEnd]);
    }
}
