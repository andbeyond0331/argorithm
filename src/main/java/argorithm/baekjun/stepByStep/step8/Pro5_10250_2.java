package main.java.argorithm.baekjun.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2022-03-17 재시도

public class Pro5_10250_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine()); //테스트 케이스 수

        for(int i = 0; i < T; i++){ //테스트 케이스만큼 층수랑 호수 받기
            String[] inf = bufferedReader.readLine().split(" ");
            int H = Integer.parseInt(inf[0]); // 층수
            int W = Integer.parseInt(inf[1]); // 방수
            int N = Integer.parseInt(inf[2]); // 몇 번째 손님

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



            if(Integer.parseInt(fars)<10){
                System.out.println(floor+"0"+fars);
            }else{
                System.out.println(floor+fars);
            }

        }

        bufferedReader.close();


    }
}
