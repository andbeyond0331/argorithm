package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-28 재재재재시도 - 처음부터 다시 풀기 -갸아아아아아아아아 드디어!!!!!성!!!공!!!

// 검문

// 근데 사이트 참고함..ㅠㅠ
// https://st-lab.tistory.com/155?category=887114

import java.io.*;

public class Pro5_2981_4_solved {

    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int earlier = 0;
        int[] minus = new int[N-1];
        int gcd =0;

        for (int i = 0; i < N; i++) {
            if(i == 0){
                earlier = Integer.parseInt(bufferedReader.readLine());
            }else{
                int temp = Integer.parseInt(bufferedReader.readLine());
                if(temp>earlier){

                    minus[i-1] = temp-earlier;
                }else{
                    minus[i-1] = earlier-temp;
                }
                earlier = temp;
            }
        }

        if(minus.length==1){
            gcd = minus[0];
        }else{
            for (int i = 0; i < minus.length-1; i++) {
                if(i==0){
                    gcd = GCD(minus[0], minus[1]);
                }else{
                    gcd = GCD(gcd, minus[i+1]);
                }
            }
        }



        for (int i = 2; i <= gcd; i++) {
            if(gcd%i==0){
                sb.append(i).append(" ");
            }
        }


        bufferedWriter.write(String.valueOf(sb));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        if(a>b){
            return GCD(b, a%b);
        }else{
            return GCD(a, b%a);
        }
    }

}
