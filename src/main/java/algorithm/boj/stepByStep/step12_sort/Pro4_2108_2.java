//package main.java.argorithm.baekjun.stepByStep.step12;
//
//// 2022-03-22 시간초과해결용2
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Pro3_2108_2 {
//
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringBuilder stringBuilder = new StringBuilder();
//        int N = Integer.parseInt(bufferedReader.readLine());
//
//        List<Integer> list = new ArrayList<>();
//        List<Integer> elements = new ArrayList();
//        List<Integer> counts = new ArrayList();
//        float arithmeticMean = 0.0F;
//        int diff = 0;
//        int often = 0;
//        for (int i = 0; i < N; i++) {
//            int number = Integer.parseInt(bufferedReader.readLine());
//            if(!list.contains(number)){
//                list.add(number);
//                elements.add(number);
//                counts.add(1);
//            }else{
//                list.add(number);
//                for (int j = 0; j < elements.size(); j++) {
//                    if(elements.get(j)==number){
//                        counts.set(j, counts.get(j)+1);
//                        diff++;
//                        break;
//                    }
//                }
//            }
//            arithmeticMean+=(float)number;
//
//
//        }
//        list.sort(Comparator.naturalOrder());
//       if(diff==0){
//           if(list.size()==1){
//               often=list.get(0);
//           }else{
//               often=list.get(1);
//           }
//       }else{
//           int maxCount =1;
//           List compareElements = elements;
////           for (int i = 0; i < elements.size(); i++) {
//               if(counts.get(i)==1){
//                   counts.remove(i);
//                   compareElements.remove(i);
//               }else if(counts.get())
//           }
//       }
//
//        stringBuilder.append(Math.round(arithmeticMean/(float)N)).append("\n");
//        stringBuilder.append(list.get(N/2)).append("\n");
//        stringBuilder.append(often).append("\n");
//        stringBuilder.append(list.get(N-1)-list.get(0));
//
//        bufferedWriter.write(String.valueOf(stringBuilder));
//        bufferedWriter.flush();
//        bufferedWriter.close();
//        bufferedReader.close();
//
//
//    }
//}
