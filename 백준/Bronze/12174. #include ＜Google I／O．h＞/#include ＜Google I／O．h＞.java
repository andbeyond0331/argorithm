
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(bufferedReader.readLine());
    for (int i = 1; i <= T; i++) {
      int B = Integer.parseInt(bufferedReader.readLine());
      String s = bufferedReader.readLine();
//      System.out.println(s + "ss");
      String answer = "Case #" + i + ": ";
      for(int j = 0; j < B; j++) {
        String temp = "";
        for(int k = 0; k < 8; k++) {
          if(s.charAt((j*8)+k) == 'I') {
            temp += "1";
          } else {
            temp += "0";
          }
        }
//        System.out.println("aa" + temp);
        answer += String.valueOf((char)Integer.parseInt(temp, 2));
      }
      System.out.println(answer);
    }
  }

}
