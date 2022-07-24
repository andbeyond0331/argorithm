package main.java.algorithm.baekjun.stepByStep.step10;
import java.io.*;

public class Pro3_17478 {

    public static StringBuilder stringBuilder;
    public static int n;

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        n = N;

        stringBuilder = new StringBuilder();

        stringBuilder.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
        Return(N);

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();




    }

    static void Return(int N){
        if(N==0){
            return;
        }

        for (int i = n-N; i < N; i++) {
            String temp = "";for (int j = 0; j < i; j++) {
                temp+="____";
            }

            




        }

        for (int i = 0; i < N; i++) {
            String temp = "";


            stringBuilder.append(temp).append("\"재귀함수가 뭔가요?\"").append("\n");
            if(i!=N-1){
                stringBuilder.append(temp).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
                stringBuilder.append(temp).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
                stringBuilder.append(temp).append("그의 답은 대부분 옳았다고 하네. 그러던 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
            }
        }

//        for (int i = 0; i < N-1; i++) {
//            stringBuilder.append("____");
//        }
//        stringBuilder.append("\"재귀함수가 뭔가요?\"").append("\n");
//        stringBuilder.append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
//        stringBuilder.append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
//        stringBuilder.append("그의 답은 대부분 옳았다고 하네. 그러던 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
//        Return(N-1);
//        if(N==1){
//            for (int i = 0; i < N; i++) {
//
//                stringBuilder.append("____");
//            }
//            stringBuilder.append("\"재귀함수가 뭔가요?\"").append("\n");
//            for (int i = 0; i < N; i++) {
//
//                stringBuilder.append("____");
//            }
//            stringBuilder.append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
//        }
//        for (int i = 0; i < N; i++) {
//
//            stringBuilder.append("____");
//        }
//        stringBuilder.append("라고 답변하였지.").append("\n");




    }




}
