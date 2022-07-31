package main.java.algorithm.baekjun.stepByStep.step9_geometry;

// 2022-08-01 기억은 안 나는데 도전했었군.. 재도전! 07:47~08:50 todo 다시

import java.io.*;
import java.util.*;

public class Pro11_1002_1 {

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

            List<Double> list = new ArrayList<>();
          list.add(r1);
          list.add(r2);
          list.add(r3);
          list.sort(Comparator.naturalOrder());
            System.out.println("list.toString() = " + list.toString());

//            double pita = Math.sqrt(list.get(0)*list.get(0)+list.get(1)+list.get(1));

            if(list.get(0)+list.get(1)<list.get(2)){
                stringBuilder.append("0").append("\n");
            }else if(list.get(0)+list.get(1)==list.get(2)){
                stringBuilder.append("1").append("\n");

            }else{
                if(list.get(0)*list.get(0)+list.get(1)*list.get(1)==list.get(2)*list.get(2)){
                    if(list.get(2)==r3){
                        stringBuilder.append("-1").append("\n");
                    }else{
                        stringBuilder.append("2").append("\n");

                    }
                }else{
                    stringBuilder.append("2").append("\n");
                }
            }


        }


        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
