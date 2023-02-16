//package main.java.argorithm.baekjun.stepByStep.step10;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Pro2_10870 {
//
//    public static void main(String[] args) throws IOException{
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine());
//
//        int a = 0;
//        int b = 1;
//
//
//
//        System.out.println(Main(n, a, b));
//
//
//
//    }
//
//    public static int Main(int n, int a, int b){
//
//        if(n==1){
//
//            return b;
//        }else if(n==0){
//            return 0;
//        }
//        return Main(n-1, b, a+b);
//    }
//
//
//}
