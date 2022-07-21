package main.java.algorithm.baekjun.stepByStep.step12_step_and_map;
import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Pro6_1269_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int A = Integer.parseInt(stringTokenizer.nextToken()); //A 원소 개수
        int B = Integer.parseInt(stringTokenizer.nextToken()); //B 원소 개수

        StringTokenizer aSt = new StringTokenizer(bufferedReader.readLine()," ");
        StringTokenizer bSt = new StringTokenizer(bufferedReader.readLine()," ");

        Set<Integer> aSet = new TreeSet<>();
        Set<Integer> bSet= new TreeSet<>();

        for (int i = 0; i < A; i++) {
            aSet.add(Integer.parseInt(aSt.nextToken()));
        }
        for (int i = 0; i < B; i++) {
            int temp = Integer.parseInt(bSt.nextToken());

            if(aSet.contains(temp)){
                aSet.remove(temp);
            }else{
                bSet.add(temp);
            }
        }



        int result = aSet.size()+bSet.size();
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
