package main.java.algorithm.boj.stepByStep.step10;
import java.io.*;

// 2022-07-25 재시도

public class Pro3_17478_1 {

    public static StringBuilder stringBuilder;
    public static int n;
    public static String under;

    public static void main(String[] args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bufferedReader.readLine());
        n = N;
        under = "";

        stringBuilder = new StringBuilder();

        stringBuilder.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
        stringBuilder.append("\"재귀함수가 뭔가요?\"").append("\n");
        Return(N);
        stringBuilder.append("라고 답변하였지.");

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();




    }

    static void Return(int N){
        if(N==0){
            stringBuilder.append(under+"\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");

            return;
        }

        String temp = "\"재귀함수가 뭔가요?\"";
        String temp1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
        String temp2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
        String temp3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";

//        stringBuilder.append(under+temp).append("\n");
        stringBuilder.append(under+temp1).append("\n");
        stringBuilder.append(under+temp2).append("\n");
        stringBuilder.append(under+temp3).append("\n");

        under+="____";
        stringBuilder.append(under+temp).append("\n");

        Return(N-1);
        stringBuilder.append(under+ "라고 답변하였지.").append("\n");

        under = under.substring(0,under.length()-4);









    }




}
