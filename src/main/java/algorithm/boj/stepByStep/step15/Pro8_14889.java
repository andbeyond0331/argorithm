//package main.java.algorithm.baekjun.stepByStep.step15;


// 머리 좀 괜찮을 때 다시 오기

//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Pro8_14889 {
//
//    public static int[][] arr;
//    public static int[] oper;
//    public static int min = 1000000000;
//    public static int max = -1000000000;
//    public static int N;
//
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        N = Integer.parseInt(br.readLine());
//
//        arr = new int[N][N];
//        oper = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
//            for (int j = 0; j < N; j++) {
//                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
//            }
//
//            oper[i] = 1;
//        }
//
//
//
//
//
//
//
//        dfs(arr[0][0], 1);
//
//        System.out.println(max);
//        System.out.println(min);
//
//
//
//    }
//
//    public static void dfs(int num, int idx) {
//
//        if(idx==N){
//            max = Math.max(max,num);
//            min = Math.min(min,num);
//
//
//        }
//        for (int i = 0; i < N/2; i++) {
//            if(oper[i] > 0){
//                oper[i]--;
//
//
//
//                if(i==0){
//                    dfs(num + arr[idx], idx+1); break;
//                }else if(i==1){
//                    dfs(num - arr[idx], idx+1); break;
//                }else if(i==2){
//                    dfs(num * arr[idx], idx+1); break;
//                }else if(i==3){
//                    dfs(num / arr[idx], idx+1); break;
//                }
//
//                oper[i]++;
//            }
//        }
//
//
//
//
//
//    }
//
//
//}
