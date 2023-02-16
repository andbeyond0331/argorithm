package main.java.algorithm.boj.stepByStep.step11;

// 2022-03-21 시작

import java.io.*;

public class Pro2_2231 {

    public static void main(String[] args) throws IOException {

        // 분해합
        // 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 사연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
        // 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우 생성자가 없을 수도 잇고 생성자가 여러개일 수도 있다.
        // N의 가장 작은 생성자 구하기
        // 없으면 0 출력
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        int result = 0;

        for (int i = 1; i < N; i++) {
            String num = String.valueOf(i);
            String[] forNum = num.split("");
            int sum = Integer.parseInt(num);
            for (int j = 0; j < forNum.length; j++) {
                int token = Integer.parseInt(forNum[j]);
                sum+= token;

            }
            if(sum==N){
                result = i;
                break;
            }
        }

        stringBuilder.append(String.valueOf(result));
        bufferedWriter.write(String.valueOf(stringBuilder));

        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();



    }

}
