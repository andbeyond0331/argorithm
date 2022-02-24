package main.java.argorithm.baekjun.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro2_2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        long cell = Integer.parseInt(bufferedReader.readLine());

        long result = 0;

        if(cell == 1) {
            result = 1;
        }else if(1<cell && cell<8){
            result = 2;
        }else{
            for (long num=0; ; num++){

                if((cell/6)==((num*num)+num)/2){
                    result=(num+2);
                    break;
                }else if ((cell/6)<((num*num)+num)/2){
                    result= num+1;
                    break;
                }

            }
        }


        System.out.println(result);


        bufferedReader.close();


    }
}
