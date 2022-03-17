package main.java.argorithm.baekjun.stepByStep.step9;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Pro5_4948 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));
        String target;
        while(!(target = bufferedReader.readLine()).equals("0")){

            int number = Integer.parseInt(target);
            int result = 0;

            for (int i = number+1; i <= 2*number; i++) {
                int count =0;

                for (int j = 1; j <= Math.sqrt(i); j++) {
                    if(i%j==0){
                        count++;

                    }
                }
                if(count==2){
                    result++;
                }
            }

//            System.out.println(result);
            bufferedWriter.write(result);

        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
