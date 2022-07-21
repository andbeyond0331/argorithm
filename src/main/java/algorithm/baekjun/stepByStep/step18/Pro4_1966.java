package main.java.algorithm.baekjun.stepByStep.step18;

//2022-04-12 - 시작

import java.io.*;
import java.util.*;

public class Pro4_1966 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out) );

        StringBuffer stringBuffer = new StringBuffer();

        int testCase = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < testCase; i++) {

            int count = 0;
            Queue<Integer> queue = new LinkedList<>();

            StringTokenizer documents = new StringTokenizer(bufferedReader.readLine()," ");
            StringTokenizer imp = new StringTokenizer(bufferedReader.readLine()," ");

            int N = Integer.parseInt(documents.nextToken()); // 문서의 개수
            int M = Integer.parseInt(documents.nextToken()); // 몇 번째?
            int max = 0;
            int targetImp = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(imp.nextToken());
                queue.add(temp);
                if(temp>max){
                    max = temp;
                }
                list.add(temp);
                if(j==M){
                    targetImp = temp;
                }

            }
            list.sort(Comparator.naturalOrder());

            while(list.get(list.size()-1)>targetImp){
                if(queue.peek()>=list.get(list.size()-1)){

                    int poll =     queue.poll();
                    System.out.println("i : " + i);
                    System.out.println("queue.poll() : "+ poll);

                        list.remove(list.size()-1);
                        count++;
                        M--;


                }else{
                    if(M>0){
                        int poll =     queue.poll();
                        System.out.println("i : " + i);
                        System.out.println("queue.poll() add: "+ poll);
                        queue.add(poll);
                        M--;
                    }else if(M==0){
                        int poll =     queue.poll();
                        System.out.println("i : " + i);
                        System.out.println("queue.poll() add: "+ poll);
                        queue.add(poll);
                        M = list.size()-1;
                    }else{
                        System.out.println("something's wrong in else");
                        break;
                    }
                }
            }

            while(M!=0){
                M--;
                System.out.println("M : " + M);
                count++;
            }
            if(count==0){
                count =1;
            }
            if(M==0){
                stringBuffer.append(count).append("\n");
            }else{
                System.out.println("something's wrong out of while");
            }






        }








        bufferedWriter.write(String.valueOf(stringBuffer));
        bufferedWriter.flush();
        bufferedWriter.close();

        bufferedReader.close();

    }


}
