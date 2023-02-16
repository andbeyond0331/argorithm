package main.java.algorithm.boj.stepByStep.step7;

import java.util.Scanner;
import java.util.Vector;

public class Pro10_1316 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        int ans = 0;
        for (int i = 0; i < amount; i++) {

            String groupWord = scanner.next();

            Vector<Integer> vector = new Vector<>();
            int forCount = 0; // 0이면 그룹단어

            for(char alpha = 'a'; alpha <= 'z'; alpha++){

                String newAlpha = String.valueOf(alpha).trim();

//                if ( groupWord.contains(newAlpha)){
                    for (int j = 0; j < groupWord.length(); j++) {
                        System.out.println("groupWord.substring("+j+","+(j+1)+") == newAlpha : " + groupWord.substring(j,j+1) + "=="+newAlpha);
                        if(newAlpha.equals(groupWord.substring(j,j+1).trim())){
//                            System.out.println("newAlpha = " + newAlpha);

                            vector.add(j);
                            System.out.println("nailed");
                        }
                    }
                    if (!vector.isEmpty() || vector.size()!=1){
                        for (int j = 0; j < vector.size()-1; j++) {
                            System.out.println("vector["+j+"] : " + vector.get(j));
                            if(vector.get(j+1)-vector.get(j)!=1){
                                forCount++;
                            }
                        }
                    }
                    vector.clear();
//                }

            }
            if(forCount==0){
                ans++;
            }

        }

        System.out.println(ans);


//
//        for (int i = 0; i < amount; i++) {
//            String groupWord = scanner.next();
//            int count = 0;
//
//            for (int j = 0; j < groupWord.length(); j++) {
//                String stoppedWord = "";
//                int stopped = 0;
//                for (int k = j+1; k < groupWord.length(); k++) {
//                    if(groupWord.substring(j,j+1)!=groupWord.substring(k,k+1)){
//                        stopped = k;
//                        stoppedWord = groupWord.substring(k,k+1);
//                        break;
//                    }
//                }
//                for (int k = stopped+1; k < groupWord.length(); k++) {
//                    if(groupWord.substring(k,k+1)==stoppedWord){
//                        // 그룹 단어가 아님
//                    }else{
//                        groupWord.replaceAll(groupWord.substring(k,k+1),"");
//                        if(groupWord==""){
//                            count++;
//                            break;
//                        }else{
//
//                        }
//                    }
//                }
//            }
//        }



        scanner.close();
    }

}
