
package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-07-26 시도 - 시간초과 해결 ver - 실패
// TO:DO: 2022-07-26 머리 맑을 때 다시!

import java.io.*;
import java.util.*;

public class Pro10_18870_1 {

    //좌표 압축

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        List<Integer> list2 = new ArrayList<>();
//        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();


//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        String[] strings = bufferedReader.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(strings[i]);
            if(!list.contains(temp)){
                list.add(temp);
            }

            list2.add(temp);
        }
        list.sort(Comparator.naturalOrder());
//        List<Integer> list = new ArrayList<>();
//        Iterator<Integer> it = set.iterator();
//        while(it.hasNext()){
//            list.add(it.next());
//        }

        for (int i = 0; i < N; i++) {

            stringBuilder.append(list.indexOf(list2.get(i))).append(" ");
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }



}
