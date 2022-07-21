package main.java.algorithm.baekjun.stepByStep.step9;

import java.io.*;

// 2022-03-17 도전

public class Pro6_9020 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int testCase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());

            int half = n/2;

            int count = 0; // 그게 소수인가 확인하기 위한 count

            boolean endMark = true;

            while (endMark){
                if(half == 2){

                    stringBuilder.append(half).append(" ").append(half).append("\n");

                    endMark = false;
                    break;

                }else{
                    for (int j = 1; j <= Math.sqrt(half); j++) {

                        if(half%j==0){
                            count++;
                        }

                    }
                    if(count==1){

                        stringBuilder.append(half).append(" ").append(half).append("\n");

                        endMark = false;
                        break;

                    }

                }

                count=0;

                for (int j = 1; j < half; j++) {
                    count=0;
                    for (int k = 1; k <= Math.sqrt(half-j); k++) {
                        if((half-j)%k==0){
                            count++;
                        }
                    }
                    if(count==1){
                        count=0;
                        for (int k = 1; k <= Math.sqrt(half+j); k++) {
                            if((half+j)%k==0){
                                count++;
                            }
                        }
                        if(count==1 && (half-j)!=1){
                            stringBuilder.append(String.valueOf(half-j)).append(" ").append(String.valueOf(half+j)).append("\n");

                            endMark = false;
                            break;
                        }else{
                            count=0;
                        }
                    }else{
                        //none
                    }

                }
            }

        }


        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
