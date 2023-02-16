package main.java.algorithm.boj.stepByStep.step9_geometry;

// 2022-08-03 재재도전! - 성공! 조건문에서 if && else if 어떻게 걸러지는지 잘 확인하기
// 터렛

import java.io.*;
import java.util.*;

public class Pro11_1002_2_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int testCase = Integer.parseInt(bufferedReader.readLine());


        for (int i = 0; i < testCase; i++) {

            Set<Integer> set = new TreeSet<>();

            StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            double r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            double r2 = Integer.parseInt(st.nextToken());

            double r3 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//            System.out.println("r3 = " + r3);
//            System.out.println("r2 = " + r2);
//            System.out.println("r1 = " + r1);

//            if(r1==r2 && r2==r3){
//                stringBuilder.append("-1").append("\n");
//            }else if(r1+r2>r3){
//                stringBuilder.append("2").append("\n");
//
//            }else if(r1+r2<r3){
//                stringBuilder.append("0").append("\n");
//            }else if(r1+r2==r3){
//                stringBuilder.append("1").append("\n");
//            }else{
//                System.out.println("어떤 상황? r1 : " + r1 + ", r2 : " + r2 + ", r3 :"+r3);
//            }
            if(r1==r2 && (int)r3==0){
                stringBuilder.append("-1").append("\n");

            }else if((int)(r1*r1)+(int)(r2*r2)==(int)(r3*r3)){
                stringBuilder.append("-1").append("\n");

            }else if(Math.abs(r1-r2)>r3){
                stringBuilder.append("0").append("\n");
            }else if(Math.abs(r1-r2)==r3){
                stringBuilder.append("1").append("\n");

            }else if(r1+r2 > r3){
                stringBuilder.append("2").append("\n");

            }else if(r1+r2 == r3){
                stringBuilder.append("1").append("\n");

            }else if(r1+r2 < r3){
                stringBuilder.append("0").append("\n");
            }

        }


        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
