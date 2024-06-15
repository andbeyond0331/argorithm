import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 소금 농도 계산
        BigDecimal n = new BigDecimal(N);
        BigDecimal m = new BigDecimal(M);
        BigDecimal saltAmount = n.multiply(new BigDecimal("7.0"));
        BigDecimal totalAmount = n.add(m);
        BigDecimal concentration = saltAmount.divide(totalAmount, 2, RoundingMode.DOWN);

        // 결과 출력
        System.out.printf("%.2f", concentration);
    }
}
