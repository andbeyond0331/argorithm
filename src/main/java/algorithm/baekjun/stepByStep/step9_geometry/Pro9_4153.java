package main.java.algorithm.baekjun.stepByStep.step9_geometry;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 2022-03-17 도전

public class Pro9_4153 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        String target;

        while(!(target= bufferedReader.readLine()).equals("0 0 0")){
            StringTokenizer st = new StringTokenizer(target," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList();

            list.add(a);
            list.add(b);
            list.add(c);

            list.sort(Comparator.naturalOrder());

            a = list.get(0);
            b = list.get(1);
            c = list.get(2);


            if((a*a)+(b*b) == (c*c)){
                stringBuilder.append("right").append("\n");
            }else{
                stringBuilder.append("wrong").append("\n");
            }

        }







        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
