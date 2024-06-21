import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String work = br.readLine();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int pre = Integer.parseInt(st.nextToken())+1;
    int dTime = Integer.parseInt(st.nextToken());
    int sH = Integer.parseInt(work.substring(0, 2));
    int sS = Integer.parseInt(work.substring(3, 5));
    int eH = Integer.parseInt(work.substring(6, 8));
    int eS = Integer.parseInt(work.substring(9, 11));
    int sTime = sH*60 + sS;
    int eTime = eH*60 + eS;
    int count = 0;
//    System.out.println(sH + " : " + sS + " ~ " + eH + " : " + eS);
    int dayWork = eTime - sTime;
//    System.out.println("dayWork = " + dayWork);
    while(pre>0) {
      // 이전 택배 수 * 택배 한 건에 걸리는 시간과 같다면 일수 + 1, 출근 + 걸리는 시간 해서 출력
      if(pre*dTime == dayWork) {
        count++;
        sTime += dTime;
        System.out.println(count);
        System.out.println(convertTime(sTime/60, sTime%60));
        return;
      }
      // 이전 택배 수 * 택배 한 건에 걸리는 시간보다 크다면 일수, 출근 + 이전 택배 수 * 택배 한 건에 걸리는 시간 출력
      else if(pre*dTime<dayWork) {
        sTime += (pre*dTime);
        System.out.println(count);
        System.out.println(convertTime(sTime/60, sTime%60));
        return;
      }
      // 이전 택배 수 * 택배 한 건에 걸리는 시간보다 작다면 일수 +1, while 한 번 더 돌리기
      else {
        count++;
        if(dayWork%dTime==0) {
          pre-=((dayWork/dTime)-1);
        }else {
          pre-=dayWork/dTime;
        }
      }
    }
  }
  static String convertTime(int h, int m) {
    String r = "";
    if(h<10) {
      r +="0";
    }
    r +=h;
    r+=":";
    if(m<10) {
      r+="0";
    }
    r+=m;
    return r;
  }

}
