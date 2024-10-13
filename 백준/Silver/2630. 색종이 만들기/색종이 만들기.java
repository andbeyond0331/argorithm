
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int countB;
    public static int countW;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(bufferedReader.readLine());

        int[][] paper = new int[N][N];
        countB=0;
        countW = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

//        System.out.println("paper : " + Arrays.toString(paper));
//        for (int i = 0; i < N; i++) {
//            System.out.println("paper : " + Arrays.toString(paper[i]));
//        }

        divide(paper, 0, N-1, 0, N-1);

        System.out.println(countW);
        System.out.println(countB);



    }

    public static void divide(int[][] paper, int left, int right, int top, int bottom){
        if( left == right && top == bottom){
            if(paper[left][top]==1){
                countB ++;
            }else{
                countW++;
            }
            return;
        }
        int midR = (left + right) / 2;
        int midC = (top + bottom) / 2;
        int[] sum = conquer(paper, left, midR, right, top, midC, bottom);
        if(sum[2]==1 && sum[3]==1 && sum[4]==1 && sum[5]==1){
                if(sum[0]==4){
                    countW += 1;
                }else if(sum[1]==4){
                    countB += 1;
                }else{
                    countW+=sum[0];
                    countB+=sum[1];
                }
            }else{
                countW +=sum[0];
                countB +=sum[1];
                if(sum[2]==1){

                }else if(sum[2]==-1){

                    divide(paper, left, midR, top, midC);
                }else{
                    System.out.println("22...읭?");
                }
                if(sum[3]==1){

                }else if(sum[3]==-1){

                    divide(paper, left, midR, midC+1, bottom);
                }else{
                    System.out.println("33...읭?");
                }
                if(sum[4]==1){

                }else if(sum[4]==-1){

                    divide(paper, midR+1, right, top, midC);
                }else{
                    System.out.println("44...읭?");
                }
                if(sum[5]==1){

                }else if(sum[5]==-1){

                    divide(paper, midR+1, right, midC+1, bottom);
                }else{
                    System.out.println("55...읭?");
                }

            }






    }


    public static int[] conquer(int[][] paper, int left, int midR, int right, int top, int midC, int bottom){
//        int l = left;
//        int r = midR +1;
//        int t = top;
//        int b = midC +1;

//        System.out.println("left = " + left + ", midR = " + midR + ", right = " + right + ", top = " + top + ", midC = " + midC + ", bottom = " + bottom);
        int idxR = left;
        int idxC = top;

        int[] result = {0,0,0,0,0,0};

        if(left==right && top == bottom){
            if(paper[idxR][idxC]==0){
//                System.out.println("WWWWWWWWW");
//                System.out.println("left = " + left + ", midR = " + midR + ", right = " + right + ", top = " + top + ", midC = " + midC + ", bottom = " + bottom);
//                System.out.println("WWWWWWWWW");
                result[0] = -1;
            }else{
//                System.out.println("BBBBBBBBB");
//                System.out.println("left = " + left + ", midR = " + midR + ", right = " + right + ", top = " + top + ", midC = " + midC + ", bottom = " + bottom);
//                System.out.println("BBBBBBBBB");
                result[1] = -1;

            }
        }else{

            int targetA =paper[idxR][idxC];

            while(idxR<=midR && idxC<=midC){
                if(idxR==midR && idxC==midC){
                    if(paper[idxR][idxC]==targetA){
                        result[2] = 1;
                        if(targetA == 0){
                            result[0] ++;
                        }else{
                            result[1]++;
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
            idxR = left;
            idxC = midC+1;

            int targetB = paper[idxR][idxC];

            while(idxR<=midR && idxC<=bottom){
                if(idxR==midR && idxC==bottom){
                    if(paper[idxR][idxC]==targetB){
                        result[3] = 1;

                        if(targetB == 0){
                            result[0] ++;
                        }else{
                            result[1]++;
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
            idxC = top;
            int targetC = paper[idxR][idxC];

            while(idxR<=right && idxC<=midC){
                if(idxR==right && idxC==midC){
                    if(paper[idxR][idxC]==targetC){
                        result[4] = 1;
                        if(targetC == 0){
                            result[0] ++;
                        }else{
                            result[1]++;
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
            idxR = midR+1;
            idxC = midC+1;
            int targetD = paper[idxR][idxC];

            while(idxR<=right && idxC<=bottom){
                if(idxR==right && idxC==bottom){
                    if(paper[idxR][idxC]==targetD){
                        result[5] = 1;
                        if(targetD == 0){
                            result[0] ++;
                        }else{
                            result[1]++;
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
