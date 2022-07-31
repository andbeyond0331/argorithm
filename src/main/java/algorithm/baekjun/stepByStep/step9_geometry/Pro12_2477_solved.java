package main.java.algorithm.baekjun.stepByStep.step9_geometry;

// 참외밭
// 2022-08-01 06:37~07:45 성공!

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Pro12_2477_solved {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        int K = Integer.parseInt(bufferedReader.readLine());

        int longestHeight = 0;
        int longestWidth = 0;

        List<Integer> vecList = new ArrayList<>(); //원래 순서대로 방향
        List<Integer> lenList = new ArrayList<>(); //원래 순서대로 길이

        List<Integer> newVec = new ArrayList<>(); //작은 사각형 구하기 위한 방향 순서
        List<Integer> newLen = new ArrayList<>(); //작은 사각형 구하기 위한 길이 순서

        int repeatedVecH = 0;
        int repeatedVecW = 0;

        int bigSquare = 0;
        int smallSquare = 0;

        for (int i = 0; i < 6; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int vec = Integer.parseInt(stringTokenizer.nextToken());
            int length = Integer.parseInt(stringTokenizer.nextToken());

            if(vec==3 || vec==4){
                if(longestHeight<length){
                    longestHeight = length;
                }
                if(vecList.contains(vec)){
                    repeatedVecH = vec;
                }
            }else{
                if(longestWidth<length){
                    longestWidth = length;
                }
                if(vecList.contains(vec)){
                    repeatedVecW = vec;
                }
            }

            vecList.add(vec);
            lenList.add(length);

        }

        for (int i = vecList.indexOf(7-repeatedVecH); i < vecList.size(); i++) {
            newVec.add(vecList.get(i));
            newLen.add(lenList.get(i));
        }
        for (int i = 0; i < vecList.indexOf(7-repeatedVecH); i++) {
            newVec.add(vecList.get(i));
            newLen.add(lenList.get(i));
        }

        boolean flagH = true;
        boolean flagW = true;
        int firstIdx = 0;

        for (int i = 0; i < newVec.size(); i++) {
            if(newVec.get(i)==repeatedVecH){
                firstIdx = i;
                break;
            }else if(newVec.get(i)==repeatedVecW){
                firstIdx = i;
                break;
            }
        }
//        System.out.println("newLen.get(firstIdx+1) : " + newLen.get(firstIdx+1));
//        System.out.println("newLen.get(firstIdx+2) : " + newLen.get(firstIdx+2));
//        System.out.println("longestWidth = " + longestWidth);
//        System.out.println("longestHeight = " + longestHeight);
        smallSquare = newLen.get(firstIdx+1)*newLen.get(firstIdx+2);
        bigSquare = longestHeight*longestWidth;

        stringBuilder.append((bigSquare-smallSquare)*K);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();






    }
}
