
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    int min = 1000001;
    int zero = -1;
    int sum = 0;
    for(int i = 0;i < n; i++) {
      int temp = Integer.parseInt(st.nextToken());
      sum+=temp;
      if(zero == -1) {
        zero = temp;
      }else {
        zero^=temp;
      }
      min = Math.min(min, temp);
    }
    if(zero == 0) {
      System.out.println(sum-min);
    }else{
      System.out.println(0);
    }
  }
}
