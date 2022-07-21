package main.java.algorithm.baekjun.stepByStep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro7_14888_solved_repeat_needed {

    public static int[] arr;
    public static int[] oper;
    public static int min = 1000000000;
    public static int max = -1000000000;
    public static int N;
    

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        oper = new int[4];

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        
        StringTokenizer opers = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            oper[i] = Integer.parseInt(opers.nextToken());
        }

        


        dfs(arr[0], 1);

        System.out.println(max);
        System.out.println(min);



    }

    public static void dfs(int num, int idx) {

        if(idx==N){
            max = Math.max(max,num);
            min = Math.min(min,num);
            return;
            
        }
        for (int i = 0; i < 4; i++) {
            if(oper[i] > 0){
                oper[i]--;

                if(i==0){
                    dfs(num + arr[idx], idx+1); break;
                }else if(i==1){
                    dfs(num - arr[idx], idx+1); break;
                }else if(i==2){
                    dfs(num * arr[idx], idx+1); break;
                }else if(i==3){
                    dfs(num / arr[idx], idx+1); break;
                }

                oper[i]++;
            }
        }





    }


}
