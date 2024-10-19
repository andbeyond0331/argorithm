
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

//    int A = Integer.parseInt(st.nextToken());
//    int B = Integer.parseInt(st.nextToken());
//    int C = Integer.parseInt(st.nextToken());
    long A = Long.parseLong(st.nextToken());
    long B = Long.parseLong(st.nextToken());
    long C = Long.parseLong(st.nextToken());
    long ans = 1;
//    for(long i = 0; i < B; i++) {
//      ans*=A;
//      ans%=C;
//    }
    System.out.println(fpow(A, B, C));

  }
  static long fpow(long a, long b, long c) {
    if(b == 1) {
      return a%c;
    }
    long x = fpow(a, b/2, c);
    if(b%2==0) {
      return (x*x)%c;
    }
    return (x*x%c)*a%c;
  }
}
// a / c = p ... q
// c * p + q = a
// a * a / c = ap ... q
// c * ap + q = a * a
// 10 -> 1 -> 10
// 100 -> 2 -> 4
// 1000 -> 3 -> 4
// 10000 -> 4 -> 4

// a % c = x
// a / c = q ... x
// cq + x = a
// aa % c = x2
// aa / c = q2 ... x2
// cq2 + x2 = aa
// cqa + ax = cq2 + x2
// a(cq + x) = cq2 + x2
// 3 4 5
// 3 -> 1 -> 3
// 9 -> 2 ->
//


