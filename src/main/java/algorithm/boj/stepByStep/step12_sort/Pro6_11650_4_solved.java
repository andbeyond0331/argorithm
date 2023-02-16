
package main.java.algorithm.boj.stepByStep.step12_sort;

// 2022-07-26 재시도(합병정렬) - 성공..?
// TO:DO: 2022-07-26 왜 맞았나 생각하기 ㅋㅋㅋㅋㅋ // ㅋㅋㅋㅋㅋㅋ몇 번 더 해보니까 알겠음!

import java.io.*;
import java.util.StringTokenizer;

public class Pro6_11650_4_solved {

    public static int[] sortedX;
    public static int[] sortedY;
    public static int[] intX;
    public static int[] intY;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

         intX = new int[N];
        intY = new int[N];

        sortedX = new int[N];
        sortedY = new int[N];



        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            intX[i] = x;
            intY[i] = y;

        }

        divide(intX, intY, 0, N-1);

        for (int i = 0; i < sortedX.length; i++) {

            stringBuilder.append(sortedX[i]).append(" ").append(sortedY[i]).append("\n");
        }


        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedReader.close();


    }

    public static void divide(int[] arrX, int[] arrY, int left, int right){
        if( left==right){
            return;
        }
        int mid = (left+right)/2;

        divide(arrX, arrY, left, mid);
        divide(arrX, arrY, mid+1, right);
        merge(arrX, arrY, left, mid, right);

    }

//    public static void divideY(int arrXY, int[] arrYY, int left, int right){
//        if( left == right){
//            return;
//        }
//
//        int mid = (left+right)/2;
//
//        divideY(arrXY, arrYY, left, mid);
//        divideY(arrXY, arrYY, mid+1, right);
//        mergeY(arrXY, arrYY, left, mid, right);
//
//    }
//
//    public static void mergeY(int arrX, int[] arrY, int left, int mid, int right){
//        int l = left; // 왼쪽 부분리스트 시작점
//        int r = mid+1; // 오른쪽 부분리스트 시작점
//        int idx = left; // 채워넣을 배열의 인덱스
//        System.out.println("left = " + left);
//        System.out.println("mid = " + mid);
//        System.out.println("right = " + right);
//        System.out.println("arrX = " + arrX);
//
//        while(l<=mid && r <= right){
//
//            // 왼쪽 부분리스트 첫 번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
//            // 왼쪽의 첫 번째 원소를 새 배열에 넣고 l과 idx를 1 증가 시킴.
//
//            if(arrY[l]<=arrY[r]){
//
//                sortedY[idx] = arrY[l];
//                sortedX[idx] = arrX;
//                idx++;
//                l++;
//
//
//            }else{ /// 오 리스트 r번째가 왼 리스트 첫 원소보다 작을 경우 오른쪽의 r 원소를 새 배열에 넣고 r과 idx 증가 시킴
//
//                sortedY[idx] = arrY[r];
//                sortedX[idx] = arrX;
//
//                idx++;
//                r++;
//            }
//
//
//
//        }
//
//        if(l > mid){ // 왼 리스트 먼저 모두 새 배열에 넣었을 때
//            while(r <= right){ // 오른쪽 부분리스트 원소가 아직 남아있으면 남은 오 리스트 원소들을 새 배열에 채우기
//
//                sortedY[idx] = arrY[r];
//                sortedX[idx] = arrX;
//
//                idx++;
//                r++;
//            }
//        }else{ // 오 리스트 먼저 채워 새 배열에 채워 넣었을 때
//            while(l <= mid){ // 왼 리스트 아직 남았으면 남은 왼 리스트 원소들 새 배열에 채우기
//
//                sortedY[idx] = arrY[l];
//                sortedX[idx] = arrX;
//                idx++;
//                l++;
//
//            }
//        }
//
//
//
//
//    }

    public static void merge(int[] arrX, int[] arrY, int left, int mid, int right){

        int l = left; // 왼쪽 부분리스트 시작점
        int r = mid+1; // 오른쪽 부분리스트 시작점
        int idx = left; // 채워넣을 배열의 인덱스

        while(l<=mid && r <= right){

            // 왼쪽 부분리스트 첫 번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
            // 왼쪽의 첫 번째 원소를 새 배열에 넣고 l과 idx를 1 증가 시킴.

            if(arrX[l]<=arrX[r]){

                if(arrX[l] == arrX[r]){
                    if(arrY[l]<arrY[r]){
                        sortedX[idx] = arrX[l];
                        sortedY[idx] = arrY[l];
                        idx++;
                        l++;
                    }else{
                        sortedX[idx] = arrX[r];
                        sortedY[idx] = arrY[r];
                        idx++;
                        r++;
                    }
                }else{
                    sortedX[idx] = arrX[l];
                    sortedY[idx] = arrY[l];
                    idx++;
                    l++;
                }

            }else{ /// 오 리스트 r번째가 왼 리스트 첫 원소보다 작을 경우 오른쪽의 r 원소를 새 배열에 넣고 r과 idx 증가 시킴
                sortedX[idx] = arrX[r];
                sortedY[idx] = arrY[r];
                idx++;
                r++;
            }



        }

        if(l > mid){ // 왼 리스트 먼저 모두 새 배열에 넣었을 때
            while(r <= right){ // 오른쪽 부분리스트 원소가 아직 남아있으면 남은 오 리스트 원소들을 새 배열에 채우기

                    sortedX[idx] = arrX[r];
                    sortedY[idx] = arrY[r];
                    idx++;
                    r++;




            }
        }else{ // 오 리스트 먼저 채워 새 배열에 채워 넣었을 때
            while(l <= mid){ // 왼 리스트 아직 남았으면 남은 왼 리스트 원소들 새 배열에 채우기
                sortedX[idx] = arrX[l];
                sortedY[idx] = arrY[l];
                idx++;
                l++;




            }
        }

        for (int i = left; i <= right; i++) {
            arrX[i] = sortedX[i];
            arrY[i] = sortedY[i];
        }

    }
}
