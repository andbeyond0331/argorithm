package main.java.algorithm.boj.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro3_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        long X = Integer.parseInt(bufferedReader.readLine());

        long count = 3;
        long pre = 3;
        long lump = 0;

        if(1<=X&&X<=3) {
            lump = 1;
        }else if(4<=X&&X<=10){
            lump = 3;
            X-=3;
        }else{
            for(long i = 3; ; i+=2){
                count+=2*i+1;
                if(X>pre && X<=count){
//                    System.out.println("X : " + X + " , pre : " + pre + ", lump  : " + lump + ", count : "  + count);
                    lump = i;
                    X-=pre;
//                    System.out.println("lump : " + lump + " , X : " + X);
                    break;
                }
                pre +=2*i+1;
            }
        }



        long num = 0; //분자
        long den = 0; //분모

        if(X>lump){
            num = X-lump;
            den = 2*lump+2-X;
        }else{
            num = lump+1-X;
            den = X;
        }

        System.out.println(num+"/"+den);



        bufferedReader.close();


    }
}
