
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    // 입력 받기
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    // 정환이 아는 노래 저장 (map에 첫 세 음 넣고 최초에는 노래 제목, 두번째부터는 2로 통일)
    Map<String, String> jhSong = new HashMap<>();
    for(int i = 0; i < N; i++) {
      st = new StringTokenizer(bufferedReader.readLine());
      String note = "";
      String title = "";
      for(int j = 0; j < 5; j++) {
        if(j == 0) {
          st.nextToken();
          continue;
        } else if(j == 1) {
          title = st.nextToken();
        } else {
          note += st.nextToken();
        }
        
      }
      if(jhSong.containsKey(note)) {
        jhSong.put(note, "2");
      } else {
        jhSong.put(note, title);
      }
    }
    
    // 맞히기 시도할 문제 받으면서 map에 값이 알파벳으로 시작하면 해당 값, 숫자면 ? 키가 없으면 !을 출력
    for(int i = 0; i < M; i++) {
      String targetSong = bufferedReader.readLine().replaceAll(" ", "");
      if(jhSong.containsKey(targetSong)) {
        if(jhSong.get(targetSong).equals("2")) {
          System.out.println("?");
        }else {
          System.out.println(jhSong.get(targetSong));
        }
      }else {
        System.out.println("!");
      }
    }
    
    
  }
}
