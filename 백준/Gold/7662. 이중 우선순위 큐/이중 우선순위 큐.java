
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int T = Integer.parseInt(bufferedReader.readLine());
    PriorityQueue<Integer> asc;
    PriorityQueue<Integer> desc;
    Map<Integer, Integer> map;
    int k;
    int count;
    StringBuilder sb = new StringBuilder();
    for(int t = 1; t<=T; t++) {
      k = Integer.parseInt(bufferedReader.readLine());
      asc = new PriorityQueue<>();
      desc = new PriorityQueue<>(Comparator.reverseOrder());
      map = new HashMap<>();
      count = 0;
      for(int i = 0; i < k; i++) {
        st = new StringTokenizer(bufferedReader.readLine());
        String c = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        if(c.equals("I")) {
          asc.add(n);
          desc.add(n);
          map.put(n, map.getOrDefault(n,0)+1);
          count++;
        }else{
          if(n==1) {
//            if(desc.isEmpty()) {
//              continue;
//            }
            removeInvalid(desc, map);
            if(!desc.isEmpty()) {
              int max = desc.poll();
              map.put(max, map.get(max) -1);
              if(map.get(max) == 0) {
                map.remove(max);
              }
            }
//            int temp = desc.peek();
//            desc.poll();
//            if(map.containsKey(temp)) {
//              if(map.get(temp)==1) {
//                map.remove(temp);
//              }else{
//                map.put(temp, map.get(temp)-1);
//              }
//            }else { // 검증 자료구조에 없으면
//              continue;
//            }
//
//            count--;
          }else{
            removeInvalid(asc, map);
            if(!asc.isEmpty()) {
              int min = asc.poll();
              map.put(min, map.get(min) - 1);
              if(map.get(min) == 0) {
                map.remove(min);
              }
            }
//            if(asc.isEmpty()) {
//              continue;
//            }
//            int temp = asc.peek();
//
//            asc.poll();
//            if(map.containsKey(temp)) {
//              if(map.get(temp)==1) {
//                map.remove(temp);
//              }else{
//                map.put(temp, map.get(temp)-1);
//              }
//            }else{
//              continue;
//            }
//            count--;
          }
        }
      }
      removeInvalid(desc, map);
      removeInvalid(asc, map);
//
//      int min = 0;
//      int max = 0;
//      for(int i : asc) {
//        if(map.containsKey(i)) {
//          min = i;
//          break;
//        }
//      }
//      for(int i : desc) {
//        if(map.containsKey(i)) {
//          max = i;
//          break;
//        }
//      }
//      if(count<=0) {
//      if(map.isEmpty()){
//        sb.append("EMPTY").append(t==T?"":"\n");
//      }else{
//        sb.append(max).append(" ").append(min).append(t==T?"":"\n");
//      }
      if (asc.isEmpty() || desc.isEmpty()) {
        sb.append("EMPTY").append(t == T ? "" : "\n");
      } else {
        sb.append(desc.peek()).append(" ").append(asc.peek()).append(t == T ? "" : "\n");
      }
    }
    System.out.println(sb);

  }
  static void removeInvalid(PriorityQueue<Integer> pq, Map<Integer, Integer> map) {
    while(!pq.isEmpty() && map.getOrDefault(pq.peek(), 0) == 0) {
      pq.poll();
    }
  }
}