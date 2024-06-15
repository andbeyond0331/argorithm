
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args)  throws  IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 입력 받기
    int T = Integer.parseInt(br.readLine());
    for(int t = 1; t <= T; t++) {

      String cards = br.readLine().replaceAll("6", "9");
      String[] card = cards.split("");
      Arrays.sort(card);
      Collections.reverse(Arrays.asList(card));
      long answer = 0;
      for(int mask = 1; mask<(1<<card.length)-1; mask++) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < card.length; i++) {
          if((mask&(1<<i)) != 0) {
            a.append(card[i]);
          }else {
            b.append(card[i]);
          }
        }
        if(a.length()>0 && b.length()>0) {
          answer = Math.max(answer, Long.parseLong(String.valueOf(a))*Long.parseLong(String.valueOf(b)));
        }
      }
      System.out.println(answer);
    }

  }
}
