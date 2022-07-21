package main.java.algorithm.baekjun.stepByStep.step9;

import java.io.*;

// 2022-03-17 시간초과

public class Pro5_4948 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        String target;
        while(!(target = bufferedReader.readLine()).equals("0")){

            int number = Integer.parseInt(target);
            int result = 0;

            if(number ==1){
                result = 1;
            }else{
                for (int i = number+1; i <= 2*number; i++) {
                    int count =0;

                    if(i==2){
                        count=0;
                    }else if(i%2!=0){
                        for (int j = 2; j <= Math.sqrt(i); j++) {
                            if(i%j==0){
                                count++;

                            }
                        }
                    }else{
                        count=1;
                    }


                    if(count==0){
                        result++;
                    }
                }
            }



            stringBuilder.append(result).append("\n");


        }
        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
