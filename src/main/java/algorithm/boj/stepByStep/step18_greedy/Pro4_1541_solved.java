package main.java.algorithm.boj.stepByStep.step18_greedy;

// 2022-07-29 09:21~09:53 한 방에 !! 성공!
// 잃어버린 괄호

import java.io.*;

public class Pro4_1541_solved {

    public static int[] sorted;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder stringBuilder = new StringBuilder();
        String ex = bufferedReader.readLine();

        int calResult = 0;

        String[] byMinus = ex.split("-");
        if(byMinus.length==1){ // 마이너스 부호가 없을 때
            String plus = "\\+";
            String[] byPlus = ex.split(plus);
            for (int i = 0; i < byPlus.length; i++) {
                calResult += Integer.parseInt(byPlus[i]);
            }
        }else{
            for (int i = 0; i < byMinus.length; i++) {
                String[] byPlus = byMinus[i].split("\\+");
                int tempCountFirst = 0;
                int tempCount = 0;
                if(i==0){
                    for (int j = 0; j < byPlus.length; j++) {
                        tempCountFirst+=Integer.parseInt(byPlus[j]);
                    }
                }else{
                    for (int j = 0; j < byPlus.length; j++) {
                        tempCount+=Integer.parseInt(byPlus[j]);
                    }
                }

                calResult+=tempCountFirst-tempCount;
            }
        }

        stringBuilder.append(calResult);



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

}
