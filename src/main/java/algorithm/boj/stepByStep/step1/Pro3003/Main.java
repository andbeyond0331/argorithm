package main.java.algorithm.boj.stepByStep.step1.Pro3003;

// 2022-08-07 12:46~13:13 중간에 복붙 잘못돼서 오래 걸림 - 성공!
// 킹, 퀸, 룩, 비숍, 나이트, 폰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine());
//        StringBuilder stringBuilder = new StringBuilder();
        int King = Integer.parseInt(stringTokenizer.nextToken());
//        System.out.println("King = " + King);
        int Queen = Integer.parseInt(stringTokenizer.nextToken());
//        System.out.println("Queen = " + Queen);
        int Rook = Integer.parseInt(stringTokenizer.nextToken());
//        System.out.println("Rook = " + Rook);
        int Bishop = Integer.parseInt(stringTokenizer.nextToken());
//        System.out.println("Bishop = " + Bishop);
        int Knight = Integer.parseInt(stringTokenizer.nextToken());
//        System.out.println("Knight = " + Knight);
        int Pawn = Integer.parseInt(stringTokenizer.nextToken());
//        System.out.println("Pawn = " + Pawn);

        if(King>1){
            System.out.print(-King+1);
            System.out.print(" ");
        }else if(King==1){
            System.out.print(0);
            System.out.print(" ");
        }else{
            System.out.print(1-King);
            System.out.print(" ");
        }
        if(Queen>1){
            System.out.print(-Queen+1);
            System.out.print(" ");
        }else if(Queen==1){
            System.out.print(0);
            System.out.print(" ");
        }else{
            System.out.print(1-Queen);
            System.out.print(" ");
        }
        if(Rook>2){
            System.out.print(-Rook+2);
            System.out.print(" ");
        }else if(Rook==2){
            System.out.print(0);
            System.out.print(" ");
        }else{
            System.out.print(2-Rook);
            System.out.print(" ");
        }
        if(Bishop>2){
            System.out.print(-Bishop+2);
            System.out.print(" ");
        }else if(Bishop==2){
            System.out.print(0);
            System.out.print(" ");
        }else{
            System.out.print(2-Bishop);
            System.out.print(" ");
        }
        if(Knight>2){
            System.out.print(-Knight+2);
            System.out.print(" ");
        }else if(Knight==2){
            System.out.print(0);
            System.out.print(" ");
        }else{
            System.out.print(2-Knight);
            System.out.print(" ");
        }

        if(Pawn>8){
            System.out.print(-Pawn+8);
            System.out.print(" ");
        }else if(Pawn==8){
            System.out.print(0);
            System.out.print(" ");
        }else{
            System.out.print(8-Pawn);
            System.out.print(" ");
        }

        bufferedReader.close();



    }
}
