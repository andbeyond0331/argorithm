package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-28 재재시도 - 시간초과

import java.io.*;

public class Pro5_2981_2_timeout {
    
    public static int gcdOfAll;
    public static int max;

    public static boolean flag;


    public static void main(String args[] ) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter( new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        gcdOfAll = 0;
        max = 0;
        flag=true;

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i = 0; i < 1000000000; i++) {
            findGCD(0, N, i, nums);
            if(!flag){
                flag = !flag;
                if(gcdOfAll>max){
                    max= gcdOfAll;
                }
                break;
            }
            if(gcdOfAll!=1){
                if(gcdOfAll>max){
                    max= gcdOfAll;
                }
            }else{
                if(gcdOfAll>max){
                    max = gcdOfAll;
                }
            }
        }
        if(max>1){
            for (int i = 2; i <= max; i++) {
                if(max%i==0){
                    sb.append(i).append(" ");
                }
            }
        }else{
            sb.append(1);
        }

        bufferedWriter.write(String.valueOf(sb));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void findGCD(int count, int n, int i, int[] arr){

        if(count==n-1){
            return;
        }
        if(arr[count]-i==0 || arr[count+1]-i==0 ){
//        if(arr[count]-i==0 || arr[count+1]-i==0 ||arr[count+1]-i==1 || arr[count]-i==1){
            if(arr[count]-i==0){
                gcdOfAll = arr[count+1]-i;
            }else{
                gcdOfAll = arr[count]-i;

            }
            flag = false;

            findGCD(count+1, n, i, arr);
        }else{
            if(count==0){

                if(GCD(arr[0]-i, arr[1]-i)==1){
                    gcdOfAll=1;

                    return;
                }else{
                    gcdOfAll = GCD(arr[0]-i, arr[1]-i);

                    findGCD(count+1, n, i, arr);
                }
            }else{
                if(GCD(gcdOfAll, arr[count+1]-i)==1){
                    gcdOfAll=1;
                    return;
                }else{
                    gcdOfAll = GCD(gcdOfAll, arr[count+1]-i);
                    findGCD(count+1, n, i, arr);
                }
            }
        }


    }

    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        if(a>b){
            return GCD(b, a%b);
        }else{
            return GCD(a, b%a);
        }

    }


}
