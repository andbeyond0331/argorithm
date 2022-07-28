package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-21 - 머리 맑을 때 다시 시도
// TO DO: 2022-07-21 머리 맑을 때 다시 시도
//  2022-07-28 재시도도 - 결국 질문 올렸음.. 메모리초과
// 2022-07-28 재재시도 - 승수 구하는 법으로.. - 성공 하지만 다시보기
//https://st-lab.tistory.com/166
import java.io.*;
import java.util.StringTokenizer;

public class Pro12_2004_2_solved_repeat_needed {

    public static long pFive = 0;
    public static long pTwo = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        long n = Integer.parseInt(stringTokenizer.nextToken());
        long m = Integer.parseInt(stringTokenizer.nextToken());
        if(n<m){
            long temp  = m;
            m = n;
            n = m;
        }

        pFive = forFive(n)-forFive(n-m)-forFive(m);
        pTwo = forTwo(n)-forTwo(n-m)-forTwo(m);

        bufferedWriter.write(String.valueOf(pFive>pTwo ? pTwo : pFive));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    static long forFive(long n){
        int count=0;
        while(n>=5){
            count+=n/5;
            n/=5;
        }
        return count;
    }

    static long forTwo(long n){
        int count=0;

        while(n>=2){
            count+=n/2;
            n/=2;
        }
        return count;
    }


}
