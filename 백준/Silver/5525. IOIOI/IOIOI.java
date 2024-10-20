
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine());
    int M = Integer.parseInt(bufferedReader.readLine());
    String S = bufferedReader.readLine();
    // 탐색하고 있는 위치 i 이전에 찾은 적 있으면 이후 OI 가 있다면 추가 & 다음 탐색은 +2부터
    // 없으면 그 위치부터 IOIOI.. 반복되는지 확인
    boolean flag = false;
    int ans = 0;
    outer: for(int i = 0;i < M-1; i++) {
      if (flag) { // 바로 이전에 발견됨.
        if(2*N+1+(i-1)+1>M-1) {
          break;
        }else{
          if(S.charAt(2*N+1+(i-1))=='O'&& S.charAt(2*N+1+(i-1)+1)=='1') {
            ans++;
            i++;
          }else {
            flag = false;
            continue;
          }
        }
      }else{
        if(i+(2*N)>M-1) {
          break;
        }else{
          for(int j = 0;j < 2*N+1; j++) {
            if(j%2==0) {
              if(S.charAt(i+j)!='I') {
                continue outer;
              }
            }else{
              if(S.charAt(i+j)!='O') {
                continue outer;
              }
            }
          }
          ans++;
          flag = true;
        }
      }
    }
    System.out.println(ans);
  }
}