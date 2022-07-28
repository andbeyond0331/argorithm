package main.java.algorithm.baekjun.stepByStep.step16_dynamic_programming1;

import java.io.*;

// 2022-07-28 재시도 - 처음부터 다시 todo 내일 아침에 다시

public class Pro3_1904_1 {

    // 01타일

    public static int result;
    public static int[] ints;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int answer = 1;
        result = 0;

        int zzCount = N/2;

        ints = new int[1000001];

        momFac(N, 0);

        tile(N,zzCount);

        if(N==1){
            answer = 1;
        }else{
//            System.out.println(result);
            answer += result;
        }
        answer = answer%15746;

        stringBuilder.append(answer);


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static int tile(int n, int count){

        if(count==1){
            return result+=n-1;
        }
        if(n-count==count){
            result+=1;
        }else{
            if(ints[count]!=0 || ints[n-count]!=0){
                result+=ints[n]/ints[n-count]/ints[count];

            }

        }


        return tile(n, count-1);
    }
//
//    public static int fac(int n, int count, int start){
//        if(start==n-count){
//            return 1;
//        }
//
//        if(ints[start]==0){
//            if(start==1){
//                ints[start]=1;
//            }else{
//                ints[start]=
//            }
//        }
//        return n*fac(n-1, count, start+1);
//    }

    public static void momFac(int count, int start){
        if(start==count){
            return;
        }
        if(ints[start]==0){
            momFac(count, start+1);

        }
    }



}
