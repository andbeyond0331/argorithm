package main.java.algorithm.baekjun.stepByStep.step21_divide_and_conquer;

// 쿼드트리
// 2022-08-02 14:31~16:04 조건 붙어있는 (그냥 0이면 (0)이 아니라 0이다) 이런거 놓쳤음. 문제 꼼꼼히 파악하기! 그래도 성공!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2_1992_solved {

    public static int countB;
    public static int countW;
    public static StringBuilder stringBuilder;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        stringBuilder = new StringBuilder();

        int N= Integer.parseInt(bufferedReader.readLine());

        int[][] paper = new int[N][N];
        countB=0;
        countW = 0;


        for (int i = 0; i < N; i++) {
            String[] tempArr = bufferedReader.readLine().split("");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(tempArr[j]);
            }
        }
//        for (int i = 0; i < N; i++) {
//
//            System.out.println("paper : " + Arrays.toString(paper[i]));
//        }
        stringBuilder.append("(");
        divide(paper, 0, N-1, 0, N-1);
        stringBuilder.append(")");
        if(String.valueOf(stringBuilder).equals("(0)")){
            System.out.println(0);
        }else if(String.valueOf(stringBuilder).equals("(1)")){
            System.out.println(1);
        }else{
            System.out.println(stringBuilder);

        }




    }

    public static void divide(int[][] paper, int left, int right, int top, int bottom){
        if( left == right && top == bottom){
            if(paper[left][top]==1){
                stringBuilder.append("1");
            }else{
                stringBuilder.append("0");
            }
            return;
        }
        int midR = (left + right) / 2;
        int midC = (top + bottom) / 2;
        int[] sum = conquer(paper, left, midR, right, top, midC, bottom);
//        System.out.println("sum : " + Arrays.toString(sum));
        if(sum[2]!=-1 && sum[3]!=-1 && sum[4]!=-1 && sum[5]!=-1){
                if(sum[2]==1 && sum[3]==1 && sum[4]==1 && sum[5]==1){
                    stringBuilder.append("1");
                }else if(sum[2]==0 && sum[3]==0 && sum[4]==0 && sum[5]==0){
                    stringBuilder.append("0");
                }else{
                    stringBuilder.append(sum[2]).append(sum[3]).append(sum[4]).append(sum[5]);
                }
            }else{
                countW +=sum[0];
                countB +=sum[1];
                if(sum[2]==1){
                    stringBuilder.append("1");
                }else if(sum[2]==-1){
                    stringBuilder.append("(");

                    divide(paper, left, midR, top, midC);
                    stringBuilder.append(")");
                }else if(sum[2]==0) {
                    stringBuilder.append("0");

                }else{
                    System.out.println("22...읭?");

                }

            if(sum[3]==1){
//                    stringBuilder.append("세번째");
                stringBuilder.append("1");
            }else if(sum[3]==-1){
                stringBuilder.append("(");
//                    stringBuilder.append("세번째");

                divide(paper, left, midR, midC+1, bottom);
                stringBuilder.append(")");
            }else if(sum[3]==0) {
//                    stringBuilder.append("세번째");
                stringBuilder.append("0");
            }else{
                System.out.println("33...읭?");
            }
            if(sum[4]==1){
//                    stringBuilder.append("두번째");
                    stringBuilder.append("1");
                }else if(sum[4]==-1){
                    stringBuilder.append("(");
//                    stringBuilder.append("두번째");

                    divide(paper, midR+1, right, top, midC);
                    stringBuilder.append(")");
                }else if(sum[4]==0) {
//                    stringBuilder.append("두번째");
                    stringBuilder.append("0");
                }else{
                    System.out.println("44...읭?");
                }
//                 if(sum[3]==1){
////                    stringBuilder.append("두번째");
//                    stringBuilder.append("1");
//                }else if(sum[3]==-1){
//                    stringBuilder.append("(");
////                    stringBuilder.append("두번째");
//
//                    divide(paper, midR+1, right, top, midC);
//                    stringBuilder.append(")");
//                }else if(sum[3]==0) {
////                    stringBuilder.append("두번째");
//                    stringBuilder.append("0");
//                }else{
//                    System.out.println("33...읭?");
//                }
//
//                if(sum[4]==1){
////                    stringBuilder.append("세번째");
//                    stringBuilder.append("1");
//                }else if(sum[4]==-1){
//                    stringBuilder.append("(");
////                    stringBuilder.append("세번째");
//
//                    divide(paper, left, midR, midC+1, bottom);
//                    stringBuilder.append(")");
//                }else if(sum[4]==0) {
////                    stringBuilder.append("세번째");
//                    stringBuilder.append("0");
//                }else{
//                    System.out.println("44...읭?");
//                }
//
                if(sum[5]==1){
                    stringBuilder.append("1");
                }else if(sum[5]==-1){
                    stringBuilder.append("(");
                    divide(paper, midR+1, right, midC+1, bottom);
                    stringBuilder.append(")");
                }else if(sum[5]==0) {
                    stringBuilder.append("0");
                }else{
                    System.out.println("55...읭?");
                }

            }






    }


    public static int[] conquer(int[][] paper, int left, int midR, int right, int top, int midC, int bottom){
        int idxR = left;
        int idxC = top;

        int[] result = {0,0,0,0,0,0};

        String temp = ("\nleft = " + left + ", midR = " + midR + ", right = " + right + ", top = " + top + ", midC = " + midC + ", bottom = " + bottom+"\n");
//        stringBuilder.append(temp);

        if(left==right && top == bottom){
            if(paper[idxR][idxC]==0){

                result[0] = -1;
            }else{

                result[1] = -1;

            }
        }else{

            int targetA =paper[idxR][idxC];

            while(idxR<=midR && idxC<=midC){
                if(idxR==midR && idxC==midC){
                    if(paper[idxR][idxC]==targetA){

                        if(targetA == 0){
                            result[2]=0;
                        }else{
                            result[2]=1;
                        }
                    }
                }

                if(paper[idxR][idxC]!=targetA){
                    result[2] = -1;
                    break;
                }
                if(idxR<midR){
                    idxR++;
                }else{
                    idxR=left;
                    idxC++;
                }

            }

            idxR = midR+1;
            idxC = top;
            int targetC = paper[idxR][idxC];

            while(idxR<=right && idxC<=midC){
                if(idxR==right && idxC==midC){
                    if(paper[idxR][idxC]==targetC){
//                        stringBuilder.append("\n"+"2222222"+"\n");
                        if(targetC ==   0){
                            result[4] = 0;
                        }else{
                            result[4]= 1;
                        }
                    }
                }

                if(paper[idxR][idxC]!=targetC){
                    result[4] = -1;
                    break;
                }
                if(idxR<right){
                    idxR++;
                }else{
                    idxR=midR+1;
                    idxC++;
                }

            }
            idxR = left;
            idxC = midC+1;

            int targetB = paper[idxR][idxC];

            while(idxR<=midR && idxC<=bottom){
                if(idxR==midR && idxC==bottom){
                    if(paper[idxR][idxC]==targetB){
//                        stringBuilder.append("\n"+"3333333"+"\n");
                        if(targetB == 0){
                            result[3]=0;
                        }else{
                            result[3]=1;
                        }
                    }
                }

                if(paper[idxR][idxC]!=targetB){
                    result[3] = -1;
                    break;
                }
                if(idxR<midR){
                    idxR++;
                }else{
                    idxR=left;
                    idxC++;
                }

            }

            idxR = midR+1;
            idxC = midC+1;
            int targetD = paper[idxR][idxC];

            while(idxR<=right && idxC<=bottom){
                if(idxR==right && idxC==bottom){
                    if(paper[idxR][idxC]==targetD){
                        result[5] = 1;
                        if(targetD == 0){
                            result[5]  = 0;
                        }else{
                            result[5] = 1;
                        }
                    }
                }

                if(paper[idxR][idxC]!=targetD){
                    result[5] = -1;
                    break;
                }
                if(idxR<right){
                    idxR++;
                }else{
                    idxR=midR+1;
                    idxC++;
                }

            }

        }


        return result;
    }
}
