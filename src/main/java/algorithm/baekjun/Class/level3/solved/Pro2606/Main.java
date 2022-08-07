package main.java.algorithm.baekjun.Class.level3.solved.Pro2606;

// 2022-08-06 19:17~
// 바이러스

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder =new StringBuilder();
        
        int N = Integer.parseInt(bufferedReader.readLine());
        int connected = Integer.parseInt(bufferedReader.readLine());
        Set<Integer> infected = new TreeSet<>();
        infected.add(1);
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        int[][] pairs = new int[connected][2];
        for (int i = 0; i < connected; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            listA.add(a);
            listB.add(b);
            if(a<b){
                pairs[i][0] = a;
                pairs[i][1] = b;
            }else{
                pairs[i][1] = a;
                pairs[i][0] = b;
                
            }
        }
        boolean flag = false;

        while(listA.size()!=0){
            if(flag){
                break;
            }
            if(listA.contains(1)){
                int idx = listA.indexOf(1);
                infected.add(listB.get(idx));
                listB.remove(idx);
                listA.remove(idx);
            }else if(listB.contains(1)){
                int idx = listB.indexOf(1);
                infected.add(listA.get(idx));
                listA.remove(idx);
                listB.remove(idx);
            }else{
//                for (int a:infected
//                     ) {
//                    System.out.println("a : " + a);
//                }
                List<Integer> temper = new ArrayList<>();
                int count = 0;
                for (int a:infected
                     ) {
                    if(listA.contains(a)){
                        count++;
                        int temp = listA.indexOf(a);
                        temper.add(listB.get(temp));
//                        infected.add(listB.get(temp));
                        listA.remove(temp);
                        listB.remove(temp);
                    }else if(listB.contains(a)){
                        count++;
                        int temp = listB.indexOf(a);
                        temper.add(listA.get(temp));
//                        infected.add(listA.get(temp));
                        listA.remove(temp);
                        listB.remove(temp);
                    }


                }
                if(count==0){
                    flag = true;
                }
                for (int a:temper
                     ) {
                    infected.add(a);
                }
//                System.out.println(count);
            }
        }
//        for (int a:infected
//             ) {
//            System.out.println("infected : "  + a);
//        }

        stringBuilder.append(infected.size()-1);
        
        


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

}
