
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine()); // 최대 100
    StringTokenizer st;
    String p; // 1<=p.length()<=100,000 // 함수
    int n; // 0<=n<=100,000 // 배열에 들어있는 수의 개수
    List<Integer> nums;
    String array;
    boolean flag; // true: 정방향
    StringBuilder sb = new StringBuilder();
    boolean[] flags = new boolean[T];
    outer: for(int t = 1; t <= T; t++) {
      p = br.readLine();
      n = Integer.parseInt(br.readLine());
      nums = new LinkedList<>();
      array = br.readLine();
      array = array.substring(1, array.length()-1);
      flag = true;
//      System.out.println(array);
      st = new StringTokenizer(array, ",");
      for(int i = 0;i < n; i++) {
        nums.add(Integer.parseInt(st.nextToken()));
      }
      for(int i = 0;i < p.length();i++) {
        if(p.charAt(i)=='R') {
          flag = !flag;
        }else if(p.charAt(i)=='D') {
          if(nums.isEmpty()) {
            sb.append("error").append("\n");
            continue outer;
          }else {
            if(flag) {
              nums.remove(0);
            }else{
              nums.remove(nums.size()-1);
            }
          }
        }
      }
      sb.append("[");
      while(!nums.isEmpty()) {
        sb.append(nums.remove(flag?0:nums.size()-1)).append(nums.isEmpty()?"":",");

      }
      sb.append("]\n");
    }
    System.out.println(sb);
  }
}
