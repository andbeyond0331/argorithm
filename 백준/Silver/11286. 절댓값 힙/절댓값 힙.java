
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    // 배열에 정수 x 넣음(0아님)
    // 절댓값이 가장 작은 값 출력, 그 값을 배열에서 제거.
    // 절댓값이 가장 작은 값이 여러개라면 가장 작은 수를 출력, 그 값을 배열에서 제거.
    // x -> 추가, 0 -> 출력
    StringBuilder sb = new StringBuilder();
    PriorityQueue<Long> pos = new PriorityQueue<>();
    PriorityQueue<Long> neg = new PriorityQueue<>();
    for(int i = 0;i < N; i++) {
      long temp = Long.parseLong(br.readLine());
      if(temp == 0) {
        if(pos.isEmpty()) {
          if(neg.isEmpty()) {
            sb.append(0).append("\n");
//            System.out.println(0);
          }else{
            sb.append(neg.poll()*(long)(-1)).append("\n");
//            System.out.println(neg.poll());
          }
        }else if(neg.isEmpty()) {
          sb.append(pos.poll()).append("\n");
//          System.out.println(pos.poll());
        }else {
          long positive = pos.peek();
          long negative = neg.peek();
          if(positive<negative) {
            sb.append(pos.poll()).append("\n");
//            System.out.println(pos.poll());
          }else{
            sb.append(neg.poll()*(long)-1).append("\n");
//            System.out.println((neg.poll()*(long)-1));
          }
        }
      } else if(temp>0) {
        pos.add(temp);
      } else {
        neg.add((long)-1*temp);
      }
    }
    System.out.println(sb);
  }

}
