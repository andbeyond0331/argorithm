import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  static int N;
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(bufferedReader.readLine());
    StringBuilder sb = new StringBuilder();
    String add = "1 -1 ";
    for(int i = 0; i < N-1; i++) {
        sb.append(add);
    }
      sb.append("-1 1");
    System.out.println(String.valueOf(sb));
   
  }

}
