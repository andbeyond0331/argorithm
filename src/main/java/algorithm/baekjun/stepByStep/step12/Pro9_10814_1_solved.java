
package main.java.algorithm.baekjun.stepByStep.step12;

// 2022-07-26 시도 - 성공!

import java.io.*;
import java.util.StringTokenizer;

public class Pro9_10814_1_solved {

    //나이순 정렬

    public static int[] sortedAges;
    public static String[] sortedNames;
    public static int[] sortedOrders;
    public static int[] arrA;
    public static String[] arrN;
    public static int[] arrO;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());  // 회원 수


        arrA = new int[N];
        arrN = new String[N];
        arrO = new int[N];

        sortedAges = new int[N];
        sortedNames = new String[N];
        sortedOrders = new int[N];



        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int age = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken();
            System.out.println("name : " + name);
            arrA[i] = age;
            arrN[i] = name;
            arrO[i] = i;

        }

        divide(arrA, arrN, arrO, 0, N-1);


        for (int i = 0; i < sortedAges.length; i++) {

            stringBuilder.append(sortedAges[i]).append(" ").append(sortedNames[i]).append("\n");
        }

        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void divide(int[] ages, String[] names, int[] orders, int left, int right){

        if(left==right){
            return;
        }
        int mid = (left+right)/2;
        divide(ages, names, orders, left, mid);
        divide(ages, names, orders, mid+1, right);
        merge(ages, names, orders, left, mid, right);

    }

    public static void merge(int[] ages, String[] names, int[] orders, int left, int mid, int right){

        int l = left;
        int r = mid+1;
        int idx = left;

        while(l<=mid && r<= right){
            if(ages[l]<=ages[r]){

                if(ages[l] == ages[r]){
                    if(orders[l]<orders[r]){
                        sortedAges[idx] = ages[l];
                        sortedNames[idx] = names[l];
                        sortedOrders[idx] = orders[l];
                        idx++;
                        l++;
                    }else{
                        sortedAges[idx] = ages[r];
                        sortedNames[idx] = names[r];
                        sortedOrders[idx] = orders[r];
                        idx++;
                        r++;
                    }
                }else{
                    sortedAges[idx] = ages[l];
                    sortedNames[idx] = names[l];
                    sortedOrders[idx] = orders[l];
                    idx++;
                    l++;
                }
            }else{
                sortedAges[idx] = ages[r];
                sortedNames[idx] = names[r];
                sortedOrders[idx] = orders[r];
                idx++;
                r++;
            }
        }

        if(l>mid){
                while(r<=right){
                    sortedAges[idx] = ages[r];
                    sortedNames[idx] = names[r];
                    sortedOrders[idx] = orders[r];
                    r++;
                    idx++;
                }
            }else{
                while(l<=mid){
                    sortedAges[idx] = ages[l];
                    sortedNames[idx] = names[l];
                    sortedOrders[idx] = orders[l];

                    l++;
                    idx++;
                }
            }




            for (int i = left; i <= right; i++) {
                System.out.println("/////////////////");
                System.out.println("arrA["+i+"] : " + arrA[i]);
                System.out.println("arrN["+i+"] : " + arrN[i]);
                System.out.println("arrO["+i+"] : " + arrO[i]);
                System.out.println("/////////////////");
                System.out.println("/////////////////");
                System.out.println("sortedAges["+i+"] : " + sortedAges[i]);
                System.out.println("sortedNames["+i+"] : " + sortedNames[i]);
                System.out.println("sortedOrders["+i+"] : " + sortedOrders[i]);
                System.out.println("/////////////////");

                ages[i] = sortedAges[i];
                names[i] = sortedNames[i];
                orders[i] = sortedOrders[i];
            }


        }


    }
//}
