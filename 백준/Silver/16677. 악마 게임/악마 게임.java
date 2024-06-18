import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args)  throws  IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 입력 받기
//    int m = Integer.parseInt(br.readLine());
    String m = br.readLine();
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    Map<Double, String> amount = new HashMap<>();
    double max = -1;

    for(int i = 0;i < N; i++) {
      int tempIdx = 0;
      st = new StringTokenizer(br.readLine());
      String word = st.nextToken();
      int gbs = Integer.parseInt(st.nextToken());
      for(int j = 0; j < word.length();j++) {
        if (tempIdx<m.length() && word.charAt(j) == m.charAt(tempIdx)) {
          tempIdx++;

        }
      }
      if(tempIdx==m.length()) {
        double tempD = (double)gbs/(double)(word.length()-m.length());
        if(!amount.containsKey(tempD)) {
          amount.put(tempD, word);
          max = Math.max(tempD, max);
        }
      }
    }
    if(max == -1) {
      System.out.println("No Jam");
      return;
    }
    System.out.println(amount.get(max));

  }
}
