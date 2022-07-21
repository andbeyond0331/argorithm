package main.java.algorithm.baekjun.stepByStep.step11;

// 2022-03-21 시작

import java.io.*;

public class Pro5_1436 {

    public static void main(String[] args) throws IOException {

        // 종말의 숫자란 어떤 수에 6이 적어도 3개이상 연속으로 들어가는 수를 말한다.
        // 제일 작은 종말의 숫자는 666이고,
        // 그 다음으로 큰 수는 1666, 2666, 3666, .... 과 같다.
        //
        //따라서, 숌은 첫 번째 영화의 제목은 세상의 종말 666,
        // 두 번째 영화의 제목은 세상의 종말 1666 이렇게 이름을 지을 것이다.
        // 일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 숫자) 와 같다.
        //
        //숌이 만든 N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램을 작성하시오.
        // 숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.

        //
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        boolean flag = true;
        int stan = 665;
        int count = 0;

        while(flag){
            stan++;
            if(String.valueOf(stan).contains("666")){
                count++;
            }

            if(count==N){
                stringBuilder.append(String.valueOf(stan));
                break;
            }
        }



        bufferedWriter.write(String.valueOf(stringBuilder));



        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();



    }

}
