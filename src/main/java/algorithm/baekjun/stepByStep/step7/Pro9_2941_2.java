package main.java.algorithm.baekjun.stepByStep.step7;

import java.util.Scanner;

public class Pro9_2941_2 {

    //처음부터 다시

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ca = scanner.next();
        String newCa = ca;
        int count = 0;

        if(ca.contains("c=")){
            String forOne = newCa;
            newCa = newCa.replaceAll("c=", "");
            count+= (forOne.length()-newCa.length())/2;

        }
        if(ca.contains("c-")){
            String forOne = newCa;
            newCa = newCa.replaceAll("c-", "");
            count+= (forOne.length()-newCa.length())/2;
        }
        if(ca.contains("dz=")){
            String forOne = newCa;
            newCa = newCa.replaceAll("dz=", "");
            count+= (forOne.length()-newCa.length())/3;
        }

        if(ca.contains("d-")){
            String forOne = newCa;
            newCa = newCa.replaceAll("d-", "");
            count+= (forOne.length()-newCa.length())/2;
        }

        if(ca.contains("lj")){
            String forOne = newCa;
            newCa = newCa.replaceAll("lj", "");
            count+= (forOne.length()-newCa.length())/2;
        }

        if(ca.contains("nj")){
            String forOne = newCa;
            newCa = newCa.replaceAll("nj", "");
            count+= (forOne.length()-newCa.length())/2;
        }

        if(ca.contains("s=")){
            String forOne = newCa;
            newCa = newCa.replaceAll("s=", "");
            count+= (forOne.length()-newCa.length())/2;
        }

        if(ca.contains("z=")){
            String forOne = newCa;
            newCa = newCa.replaceAll("z=", "");
            count+= (forOne.length()-newCa.length())/2;
        }

        if(newCa.length()!=0){
            count+=newCa.length();
        }
        System.out.println(count);


        scanner.close();
    }

}
