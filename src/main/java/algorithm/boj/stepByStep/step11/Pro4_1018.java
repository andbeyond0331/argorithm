package main.java.algorithm.boj.stepByStep.step11;

// 2022-03-21 시작 - 실패

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Pro4_1018 {

    public static void main(String[] args) throws IOException {

        // 체스판 다시 칠하기

        //
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        String[] strings = new String[N];

        List<Integer> list = new ArrayList<>(); // 바꿔야하는 사각형 개수 세어서 저장

        for (int i = 0; i < N; i++) {
            String middle = bufferedReader.readLine();

            strings[i] = middle;

        }

        for (int i = 0; i <= N-8; i++) {
            String[] cuts = new String[8];



            String startWithB = "BWBWBWBW";
            String startWithW= "WBWBWBWB";
            boolean flag = true;
            int startWithBCount = 0;
            int startWithWCount = 0;



            for (int j = 0; j <= M-8; j++) {
                for (int k = 0; k < 8; k++) {
                    cuts[k] = strings[k].substring(j, j + 8);
                }

                // 88 체스판 생성 완료

                for (int happy = 0; happy < cuts.length; happy++) {
                    if(flag){
                        for (int innerhappy = 0; innerhappy < cuts[happy].length(); innerhappy++) {
                            if(!cuts[happy].substring(innerhappy,innerhappy+1).equals(startWithB.substring(innerhappy,innerhappy+1))){

                                startWithBCount++;

                            }

                            flag=false;
                        }
                    }else{
                        for (int innerhappy2 = 0; innerhappy2 < cuts[happy].length(); innerhappy2++) {
                            if(!cuts[happy].substring(innerhappy2,innerhappy2+1).equals(startWithW.substring(innerhappy2,innerhappy2+1))){

                                startWithBCount++;

                            }

                            flag=true;
                        }
                    }

                }

                for (int hope = 0; hope < cuts.length; hope++) {
                    if(flag){
                        for (int innerhope = 0; innerhope < cuts[hope].trim().length(); innerhope++) {
                            if(!cuts[hope].substring(innerhope,innerhope+1).equals(startWithW.substring(innerhope,innerhope+1))){
                                startWithWCount++;
                            }
                            flag=false;
                        }
                    }else{
                        for (int innerhope2 = 0; innerhope2 < cuts[hope].trim().length(); innerhope2++) {
                            if(!cuts[hope].substring(innerhope2,innerhope2+1).equals(startWithB.substring(innerhope2,innerhope2+1))){
                                startWithWCount++;
                            }
                            flag=true;
                        }
                    }

                }


                list.add(startWithBCount);
                list.add(startWithWCount);




            }




        }

        System.out.println("list.size() : " + list.size());

        list.sort(Comparator.naturalOrder());

        stringBuilder.append(String.valueOf(list.get(0)));

        bufferedWriter.write(String.valueOf(stringBuilder));



        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();



    }

}
