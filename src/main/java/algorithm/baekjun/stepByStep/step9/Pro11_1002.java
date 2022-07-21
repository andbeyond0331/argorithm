package main.java.algorithm.baekjun.stepByStep.step9;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 2022-03-17 도전
public class Pro11_1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int testCase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < testCase; i++) {

            StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int r3 = (int) Math.sqrt( Math.pow((x1-x2),2)-Math.pow((y1-y2),2));
            System.out.println("r3 : " + r3);

            List<Integer> list = new ArrayList<>();
            list.add(r1);
            list.add(r2);
            list.add(r3);

            list.sort(Comparator.naturalOrder());

            if(r3==0){
                if(r1!=r2){
                    stringBuilder.append("0").append("\n");
                }else{
                    stringBuilder.append("-1").append("\n");
                }

            }else if((list.get(0)+list.get(1))==list.get(2)){
                stringBuilder.append("1").append("\n");
            }else if((list.get(0)+list.get(1))>list.get(2)){
                stringBuilder.append("2").append("\n");
            }else{
                stringBuilder.append("0").append("\n");
            }



        }

        









        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
