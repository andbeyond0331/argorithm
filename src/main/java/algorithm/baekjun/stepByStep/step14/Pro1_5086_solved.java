package main.java.algorithm.baekjun.stepByStep.step14;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Pro1_5086_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        Set<String> strings = new TreeSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = (i+1); j <= s.length(); j++) {
                strings.add(s.substring(i,j));
                System.out.println("strings.add(s.substring("+i+","+j+")) : "+s.substring(i,j));
            }
        }
        bufferedWriter.write(String.valueOf(strings.size()));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
