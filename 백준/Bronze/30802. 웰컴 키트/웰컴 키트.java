
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bufferedReader.readLine());
    int[] t = new int[6];
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i  =0; i < 6; i++) {
      t[i] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(bufferedReader.readLine());
    int T = Integer.parseInt(st.nextToken());
    int P = Integer.parseInt(st.nextToken());
    int temp = 0;
    for(int i = 0;i < 6; i++) {
      if(t[i]%T==0) {
        temp+=t[i]/T;
      }else{
        temp+=t[i]/T+1;
      }

    }
    sb.append(temp).append("\n");
    sb.append(N/P).append(" ").append(N%P);
    System.out.println(sb);
  }

}
