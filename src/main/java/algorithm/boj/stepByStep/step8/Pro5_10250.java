package main.java.algorithm.boj.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro5_10250 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < T; i++){
            String[] inf = bufferedReader.readLine().split(" ");
            int H = Integer.parseInt(inf[0]);
            int W = Integer.parseInt(inf[1]);
            int N = Integer.parseInt(inf[2]);

            String floor = "";
            if(N%H!=0){
                floor = String.valueOf(N%H);
            }else{
                floor = String.valueOf(H);
            }
            int far = N/H;

            String fars = "";
            if(N%H!=0){
                fars = String.valueOf(far+1);
            }else{
                fars = String.valueOf(far);
            }



            if(far<10){
                System.out.println(floor+"0"+fars);
            }else{
                System.out.println(floor+fars);
            }

        }

        bufferedReader.close();


    }
}
