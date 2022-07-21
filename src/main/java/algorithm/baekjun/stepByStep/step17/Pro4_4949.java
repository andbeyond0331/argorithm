package main.java.algorithm.baekjun.stepByStep.step17;

//2022-04-11 시작 - 완료

import java.io.*;
import java.util.Stack;

public class Pro4_4949 {

    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer stringBuffer = new StringBuffer();

        String dot = "";
       while(!(dot=bufferedReader.readLine()).equals(".")){

           String answer = "";

           Stack stack = new Stack<>();

           for (int i = 0; i < dot.length(); i++) {
               String target = dot.substring(i,i+1);
               if(target.equals("(") || target.equals("[")){
                   stack.push(target);
               }else if(target.equals(")")){
                   if(stack.size()==0) {
                       answer = "no";
                       break;
                   }else if(stack.pop().equals("(")){
                       continue;
                   }else{
                       answer = "no";
                       break;
                   }
               }else if(target.equals("]")){
                   if(stack.size()==0) {
                       answer = "no";
                       break;
                   }else if(stack.pop().equals("[")){
                       continue;
                   }else{
                       answer = "no";
                       break;
                   }
               }

               if(stack.size()!=0){
                   answer = "no";
               }else{
                   answer = "yes";
               }

           }



           stringBuffer.append(answer).append("\n");
       }

        bufferedWriter.write(String.valueOf(stringBuffer));

        bufferedWriter.flush();
        bufferedWriter.close();



        bufferedReader.close();

        


    }

}
