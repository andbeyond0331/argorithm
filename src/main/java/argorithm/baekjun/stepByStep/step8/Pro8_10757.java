package main.java.argorithm.baekjun.stepByStep.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Pro8_10757 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        String[] strings = bufferedReader.readLine().split(" ");

        String[] a = strings[0].split("");
        String[] b = strings[1].split("");

        int[] A = new int[a.length];
        int[] B = new int[b.length];

        int countA = 0;
        for(String forA : a){
            A[countA] = Integer.parseInt(forA);
//            System.out.println(countA+"번째 A : " + A[countA] );
            countA++;
        }
        int countB = 0;
        for(String forB : b){
            B[countB] = Integer.parseInt(forB);
//            System.out.println(countB+"번째 B : " + B[countB] );
            countB++;
        }
        Vector<Integer> vector = new Vector<>();


        if(A.length>B.length) {
//            System.out.println("A.length>B.length");

                int blank = B.length - 1;
                for (int i = A.length - 1; i >= 0; i--) {
                    if (blank > -1) {
                        if (A[i] + B[blank] > 9) {
                            A[i - 1]++;
                            vector.add(0, A[i] + B[blank] - 10);
                        } else {
                            vector.add(0, A[i] + B[blank]);
                        }
                        blank--;
                    } else if (blank == -1) {
                        if (i != 0) {
                            if (A[i] > 9) {
                                A[i - 1]++;
                                vector.add(0, A[i] - 10);
                            } else {
                                vector.add(0, A[i]);
                            }
                        } else { //한자리수만 더 큰 경우
                            if (A[i] > 9) {
                                vector.add(0, A[i] - 10);
                                vector.add(0, 1);
                            } else {
                                vector.add(0, A[i]);
                            }
                        }

                    }



            }

        }else if(A.length<B.length){
//            System.out.println("A.length<B.length");

                int blank = A.length-1;
                for (int i = B.length-1; i >= 0; i--) {
                    if (blank>-1){
                        if(B[i]+A[blank]>9){
                            B[i-1]++;
                            vector.add(0,B[i]+A[blank]-10);
                        }else{
                            vector.add(0,B[i]+A[blank]);
                        }
                        blank--;
                    }else if(blank==-1){
                        if(i!=0){
                            if(B[i]>9){
                                B[i-1]++;
                                vector.add(0,B[i]-10);
                            }else{
                                vector.add(0,B[i]);
                            }
                        }else{ //한자리수만 더 큰 경우
                            if(B[i]>9){
                                vector.add(0,B[i]-10);
                                vector.add(0,1);
                            }else{
                                vector.add(0,B[i]);
                            }
                        }

                    }



            }

        }else{
//            System.out.println("A.length==B.length");
            for (int i = B.length-1; i >= 0; i--) {
                if(i!=0){
                    if(A[i]+B[i]>9){
                        A[i-1]++;
                        vector.add(0,A[i]+B[i]-10);

//                        System.out.println("aaaa i : " + i);
                        for(int hi : vector){
                            System.out.println(hi);
                        }

                    }else{
                        vector.add(0,A[i]+B[i]);

//                        System.out.println("bbbb i : " + i);
                        for(int hi : vector){
//                            System.out.println(hi);
                        }

                    }
                }else{
                    if(A[i]+B[i]>9){

                        vector.add(0,A[i]+B[i]-10);
                        vector.add(0,1);

//                        System.out.println("cccc i : " + i);
                        for(int hi : vector){
//                            System.out.println(hi);
                        }

                    }else{
                        vector.add(0,A[i]+B[i]);

                        System.out.println("dddd i : " + i);
                        for(int hi : vector){
//                            System.out.println(hi);
                        }

                    }
                }


            }
        }

        for (int num:vector
             ) {
            System.out.print(num);
        }

        bufferedReader.close();


    }
}
