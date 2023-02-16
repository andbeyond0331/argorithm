package main.java.algorithm.boj.stepByStep.step22_binarySearch;

// 2022-07-29 13:50~14:20
// 랜선 자르기 - 이분탐색 ver (시간 초과 해결하기) - 처음부터 다시 시도 - 성공!

// 참고 : https://st-lab.tistory.com/269



import java.io.*;
import java.util.StringTokenizer;

public class Pro3_1654_2_solved {


    public static void main(String[] arges) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        long K = Integer.parseInt(stringTokenizer.nextToken());
        long N = Integer.parseInt(stringTokenizer.nextToken());

        long[] ks = new long[(int)K];
        long longest = 0;

        for (int i = 0; i < K; i++) {
            ks[i] = Integer.parseInt(bufferedReader.readLine());
            if(ks[i]>longest){
                longest = ks[i];
            }
        }

        long min = 0;
        long max = longest+1;

        long mid = 0;

        while(min<max){

            mid = (min+max)/2;

            int count = 0;

            for (int i = 0; i < K; i++) {
                count+=ks[i]/mid;
            }
            if(count<N){
                max = mid;
            }else{
                min = mid+1;
            }


        }
        stringBuilder.append(min-1);



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

}
