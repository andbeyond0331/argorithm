
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    long mod = (long) Math.pow(10, 9) + 7;
    long answer = 0;
    long powerOfTwo = 1;
    for(int i = 0;i < s.length(); i++) {
      if(s.charAt(i)=='O') {
        answer= (answer+powerOfTwo)%mod;
      }
      powerOfTwo = (powerOfTwo*2)%mod;
    }
    System.out.println(answer);
  }
}
