package main.java.algorithm.baekjun.stepByStep.step14;

// 2022-07-28 재재재시도 - 시간초과 해결 ver - 실패

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Pro5_2981_3 {

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

        Set<Integer> set = new TreeSet<>();

        int numMax = 0;

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
            if(nums[i]>numMax){
                numMax = nums[i];
            }
        }

        for (int i = 0; i < numMax+1; i++) {
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
        if(max>1) {
            for (int i = 2; i <= Math.sqrt(max); i++) {

                if(max%i==0){
                    sb.append(i).append(" ");
                    if(i!=max/i){
                        set.add(max/i);
                    }

                }
            }
//            if(max%2==0){
//                for (int i = 2; i <= max/2+1; i++) {
//
//                    if(max%i==0){
//                        sb.append(i).append(" ");
//                    }
//
//                }
//            }else{
//                for(int i=3; i<=max/2+1; i+=2){
//                    if(max%i==0){
//                        sb.append(i).append(" ");
//                    }
//                }
//            }
//
//        }else{
//            sb.append(1);
//        }
//        sb.append(max);
        }
        for (int a:set
             ) {
            sb.append(a).append(" ");
        }
        sb.append(max);

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
