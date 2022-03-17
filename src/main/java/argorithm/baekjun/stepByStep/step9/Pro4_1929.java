package main.java.argorithm.baekjun.stepByStep.step9;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Pro4_1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer st;
        String str = bufferedReader.readLine();

        st = new StringTokenizer(str, " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i = M; i<N+1; i++){

                int count =0;

                if(i==1){
                    break;
                }else if(i%2!=0){
                    for (int j = 1; j <= sqrt(i); j++) {
                        if(i%j==0){
                            count++;
                        }
                    }
                }else if(i==2){
                    count=1;
                }

                if(count==1){
                    stringBuilder.append(i).append("\n");
                }


        }

        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();


        bufferedReader.close();
        bufferedWriter.close();

    }
}
