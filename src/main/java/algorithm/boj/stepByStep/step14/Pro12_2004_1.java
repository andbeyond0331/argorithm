package main.java.algorithm.boj.stepByStep.step14;

// 2022-07-21 - 머리 맑을 때 다시 시도
// TODO: 2022-07-21 머리 맑을 때 다시 시도
//  2022-07-28 재시도도 - 결국 질문 올렸음.. 메모리초과
import java.io.*;
import java.util.StringTokenizer;

public class Pro12_2004_1 {

    public static int M;
    public static int N;


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        if(N-M<M){
            M = N-M;
        }

        long forCount = BC( N , M);

        int answer = 0;

        if(forCount%3==0){
            forCount = forCount/3;
        }

        if(forCount%7==0){
            forCount = forCount/7;
        }



            if(forCount%125==0){
                answer = answer+3;
            }else if(forCount%25==0){
                answer = answer+2;
            }else if(forCount%5==0){
                answer++;
            }


        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    static long BC ( long n, long m ) {

        if(m==n || m==0){
            return 1;
        }


        return n/m*BC(n-1, m-1);
    }


}
