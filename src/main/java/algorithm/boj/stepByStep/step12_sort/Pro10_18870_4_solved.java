
package main.java.algorithm.boj.stepByStep.step12_sort;

// 2022-07-26 시도 - 시간초과 해결 ver - 실패
//  2022-07-27 재시도 - 병합 정렬도 실패라니...
//  2022-07-28 재재시도 걍 처음부터 다시 생각
//  2022-07-28 재재재시도 처음부터 짠 코드(위의 set, 이중배열)가 시간초과 떠서 검색으로 힌트만 얻어
// 좌표 압축이라는 것이 원래 있는 말이라는 것을 알게 됨
// 좌표 압축 : 좌표의 대수만 비교해도 될 때 대수만 저장하는 방법
//          새로운 배열에 원래 배열을 중복 없이 순서대로 정렬한 후 원래 배열에 수의 인덱스만 저장하기
//          새로운 배열은 정렬되어 있으므로 "이분 탐색" 사용하면 됨

// 여기서 이분 탐색 (Binaray Search) : 정렬 되어 있는 배열에서 데이터 찾으려 시도할 때
//                                  탐색 범위를 절반씩 줄여가며 찾는 것

/// !!!!!!!!!!!!!!이분 탐색이 답이었다!!!!!!!!!!!!!!!!!!!!!!

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Pro10_18870_4_solved {

    //좌표 압축

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        int[][] ints = new int[N][2];
        Set<Integer> set = new TreeSet<>();// 순서대로 중복 없이 원래 배열들을 넣어두기

        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(stringTokenizer.nextToken());
            ints[i][0] = temp;
            ints[i][1] = -1;
            set.add(temp);
        }

        // ins에는 좌표,-1 원래 순서로 들어가 있음
        // set에는 중복 없이 순서대로 들어가 있음

        Iterator<Integer> it = set.iterator();
        int[] newSet = new int[set.size()];
        int index = 0;

        while(it.hasNext()) {
            int temp = it.next();

            newSet[index] = temp;
            index++;
        }


        for (int i = 0; i < N; i++) {

            stringBuilder.append(findIndex(newSet, ints[i][0], 0, newSet.length)).append(" ");
        }



        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
    public static int findIndex(int[] arr, int num, int left, int right){
        int mid = (left+right)/2;

        if(arr[mid]==num){
            return mid;
        }
        if(arr[mid]<num){
            return findIndex(arr, num, mid+1, right);

        }else{
            return findIndex(arr, num, left, mid);
        }

    }





}
