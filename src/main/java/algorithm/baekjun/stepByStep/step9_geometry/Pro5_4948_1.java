package main.java.algorithm.baekjun.stepByStep.step9_geometry;

import java.io.*;

// 2022-03-17 시간초과 해결하기

public class Pro5_4948_1 {

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
                if((number+1)%2!=0){
                    for (int i = number+1; i < 2*number; i+=2) {
                        int count = 0;
                        if(i==2){
                            count=0;
                        }else{
                            for (int j = 2; j <= Math.sqrt(i); j++) {
                                if(i%j==0){
                                    count++;

                                }
                                if(count>0){
                                    break;
                                }
                            }
                        }
                        if(count==0){
                            result++;
                        }
                    }
                }else{
                    for (int i = number+2; i < 2*number; i+=2) {
                        int count = 0;
                        if(i==2){
                            count=0;
                        }else{
                            for (int j = 2; j <= Math.sqrt(i); j++) {
                                if(i%j==0){
                                    count++;

                                }
                                if(count>0){
                                    break;
                                }
                            }
                        }
                        if(count==0){
                            result++;
                        }
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
